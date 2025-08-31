package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.EntitySeat;
import bidahochi.foxdrives.util.DataMemberName;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static bidahochi.foxdrives.util.FoxDrivesConstants.*;

public abstract class EntityCar extends Entity {

    @SideOnly(Side.CLIENT)
    public ModelBase modelInstance;
    //@SideOnly(Side.CLIENT)
    public long lastFrame = System.currentTimeMillis();

    public float health =20, roll=0;
    public double transportX=0,transportY=0,transportZ=0;
    public float servyaw;
    public int tickOffset=0;
    public byte running=0;
    public float velocity=0;
    //public float throttle;
    public boolean braking;
    private float guiRenderScale = 25f;

    public ArrayList<EntitySeat> passengers = new ArrayList<>();
    /**
     * <p>Stores texture descriptions. Integer represents the number of the skin as registered in DataWatcher, and the String is the description itself.</p>
     */
    public final Map<Integer, String> textureDescriptionMap = new HashMap<>();

     /**
     * client side entity spawn
     */
    public EntityCar(World world) {
        super(world);
        //this can be called on server from the inventory car class, so, dont do client stuff there
        if(world.isRemote) {
            this.preventEntitySpawning = true;
            this.setSize(getHitboxSize(), 1.6F);
            this.yOffset = 0;
            ignoreFrustumCheck = true;
            this.isImmuneToFire = true;
        }
    }


    /**
     * server side entity spawn
     */
    public EntityCar(World world, double xPos, double yPos, double zPos) {
        super(world);
        this.setPosition(xPos, yPos, zPos);
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.prevPosX = xPos;
        this.prevPosY = yPos;
        this.prevPosZ = zPos;
        this.setSize(getHitboxSize(), 1.6F);
        ignoreFrustumCheck = true;
        this.isImmuneToFire = true;
        this.preventEntitySpawning = true;
    }


    /**
     * Literally just exists to properly init the datawatcher stuff.
     */
    @Override
    protected void entityInit(){
        this.dataWatcher.addObject(DW_VEL, velocity);
        this.dataWatcher.addObject(DW_LIGHTSJSON, lightingDetailsJSON());//tracks vehicle lighting
        this.dataWatcher.addObject(DW_RUNNING, running);//tracks if the entity is on or not
        this.dataWatcher.addObject(DW_ROLL, roll);//tracks the entity roll from being hit
        this.dataWatcher.addObject(DW_HEALTH, health);//tracks entity health
        this.dataWatcher.addObject(DW_SKIN, 0);//used to track currently selected skin
        this.dataWatcher.addObject(DW_YAW, 0f);//used to track rotation yaw
        //this.dataWatcher.addObject(DW_THROTTLE, 0f);//throttle
        //this.dataWatcher.addObject(DW_BRAKING, 0);//throttle
    }

    public JsonObject lightingDetailsAsJsonObjectDW()
    {
        try
        {
            return AsJsonObject(dataWatcher.getWatchableObjectString(DW_LIGHTSJSON));
        }
        catch (Exception e)
        {
            return lightingDetailsAsJSON();
        }
    }

    private boolean isHeadlightsEnabled = false;
    private boolean isBeaconEnabled = false;
    private byte ditchLightMode = 0;
    private byte beaconCycleIndex = 0;
    private byte turnSignal = 0; // False for left, True for right
    private byte turnSignalTick = 0;
    private boolean areBrakeLightsOn = false;

    public String lightingDetailsJSON()
    {
        JsonObject lightingDetailsJSON = new JsonObject();
        lightingDetailsJSON.addProperty("isHeadlightsEnabled", isHeadlightsEnabled);
        lightingDetailsJSON.addProperty("isBeaconEnabled", isBeaconEnabled);
        lightingDetailsJSON.addProperty("beaconCycleIndex", beaconCycleIndex);
        lightingDetailsJSON.addProperty("ditchLightMode", ditchLightMode);
        lightingDetailsJSON.addProperty("turnSignal", turnSignal);
        lightingDetailsJSON.addProperty("turnSignalTick", turnSignalTick);
        lightingDetailsJSON.addProperty("areBrakeLightsOn", areBrakeLightsOn);

        return lightingDetailsJSON.toString();
    }

    public JsonObject lightingDetailsAsJSON()
    {
        JsonObject lightingDetailsJSON = new JsonObject();
        lightingDetailsJSON.addProperty("isHeadlightsEnabled", isHeadlightsEnabled);
        lightingDetailsJSON.addProperty("isBeaconEnabled", isBeaconEnabled);
        lightingDetailsJSON.addProperty("beaconCycleIndex", beaconCycleIndex);
        lightingDetailsJSON.addProperty("ditchLightMode", ditchLightMode);
        lightingDetailsJSON.addProperty("turnSignal", turnSignal);
        lightingDetailsJSON.addProperty("turnSignalTick", turnSignalTick);
        lightingDetailsJSON.addProperty("areBrakeLightsOn", areBrakeLightsOn);
        return lightingDetailsJSON;
    }

    private JsonObject AsJsonObject(String string)
    {
        return new JsonParser().parse(string).getAsJsonObject();
    }

    public boolean isLightsEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_LIGHTSJSON)).get(DataMemberName.isHeadlightsEnabled.AsString()).getAsBoolean();
    }

    public boolean areBrakeLightsOn()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_LIGHTSJSON)).get(DataMemberName.areBrakeLightsOn.AsString()).getAsBoolean();
    }

    public boolean isBeaconEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_LIGHTSJSON)).get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean();
    }

    public byte getBeaconCycleIndex()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_LIGHTSJSON)).get(DataMemberName.beaconCycleIndex.AsString()).getAsByte();
    }

    public boolean isDitchLightsEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_LIGHTSJSON)).get(DataMemberName.ditchLightMode.AsString()).getAsByte() > 0;
    }

    public float getVelocity()
    {
        return dataWatcher.getWatchableObjectFloat(DW_VEL);
    }

    public void setPacketLights(boolean isHeadlightsOn)
    {
        isHeadlightsEnabled = isHeadlightsOn;
    }

    public void setPacketTurnIndicator(byte turnIndicator)
    {
        turnSignal = turnIndicator;
    }

    public void setPacketBeacon(boolean isVehicleBeaconEnabled)
    {
        isBeaconEnabled = isVehicleBeaconEnabled;
    }

    /**Sets the Ditch light mode
     *
     * @param ditchLightMode set 0 for off,
     */
    public void setPacketDitchLightsMode(byte ditchLightMode)
    {
        this.ditchLightMode = ditchLightMode;
    }


    /**
     * Returns the model for the entity
     */
    public abstract ModelBase getModel();

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    public abstract String[] getSkins();

    /**
     * returns a multiplier for how much the entity will rotate during turning
     */
    public float turnStrength(boolean reversing){
        return reversing ? 0.75f : 1f;
    }

    /**
     * returns a multiplier for how much the entity will rotate during turning
     */
    public float turnRenderDegree(boolean reversing){return reversing?-35:35;}

    /**
     * returns a multiplier for the render of wheel spin speed
     */
    public float wheelSpinMultiplier(){return 1;}

    /**
     * allows entities to climb slabs
     */
    public boolean canClimbSlabs(){return true;}

    /**
     * allows entities to climb a single full block
     */
    public boolean canClimbFullBlocks(){return false;}

    /**
     * defines the hitbox size (width and depth) of the vehicle
     */
    public float getHitboxSize(){return 1.4f;}

    /**
     * Returns a boundingBox used to collide the entity with other entities and blocks. This enables the entity to be
     * pushable on contact, like boats or minecarts.
     */
    @Override
    public AxisAlignedBB getCollisionBox(Entity p_70114_1_) {
        return p_70114_1_.boundingBox;
    }

    @Override
    public AxisAlignedBB getBoundingBox() {
        return boundingBox;
    }

    @Override
    public boolean canBeCollidedWith() {
        return true;
    }

	@Override
	public void applyEntityCollision(Entity entity){
		if(entity instanceof EntitySeat) return;
        if(entity instanceof EntityPlayer && entity.ridingEntity instanceof EntitySeat) return;
        super.applyEntityCollision(entity);
	}

    /**add entity mount functionality, and remove item interactions*/
    @Override
    public boolean interactFirst(EntityPlayer player){
        //if it's the skinning item, iterate to the next skin
        if(!this.worldObj.isRemote && player.getHeldItem()!=null &&
                player.getHeldItem().getItem()== FoxDrives.wrap) {
                if (!player.isSneaking()) {
                    //gets current skin value and loops around to 0 if it's past the entity's skin count.
                    int skin = dataWatcher.getWatchableObjectInt(DW_SKIN) + 1;
                    if (skin >= getSkins().length) {
                        skin = 0;
                    }
                    dataWatcher.updateObject(DW_SKIN, skin);
                } else if (getSkins().length > 1) {
                    player.openGui(FoxDrives.instance, 101, player.getEntityWorld(), this.getEntityId(), -1, (int) this.posZ);
                }
        //otherwise, try to mount the entity
        } else if (!this.worldObj.isRemote) {
            if(riddenByEntity == null){
                player.mountEntity(this);
            }
            else if(player.ridingEntity == null){
                if(passengers.size() + 1 < type().passenger_pos.size()){
                    EntitySeat seat = new EntitySeat(this);
                    seat.setPosition(posX, posY, posZ);
                    seat.getDataWatcher().updateObject(17, getEntityId());
                    worldObj.spawnEntityInWorld(seat);
                    passengers.add(seat);
                    player.mountEntity(seat);
                }
            }
            return true;
        }
        return false;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float p_70097_2_) {
        if(worldObj.isRemote || isDead) return false;
        setRollingDirection(-this.getRollingDirection());
        setRollingDirection(10);
        setDamage(this.getDamage() + p_70097_2_ * 10.0F);

        EntityPlayer player = source.getEntity() instanceof EntityPlayer ? player = (EntityPlayer)source.getEntity() : null;
        if((player != null && player.capabilities.isCreativeMode) || getDamage() > 40){
            if(riddenByEntity != null) riddenByEntity.mountEntity(null);
            if(getDamage() > 40){
                setDead();
                if(player != null && !player.capabilities.isCreativeMode){
                    Item item = CarType.getItemByClass(this.getClass());
                    if(item != null){
                        EntityItem ent = new EntityItem(worldObj);
                        ent.setEntityItemStack(new ItemStack(item, 1));
                        ent.setPosition(posX, posY + 0.5, posZ);
                        worldObj.spawnEntityInWorld(ent);
                    }
                }
            }
        }
        return true;
    }

    public float getDamage(){
        return this.dataWatcher.getWatchableObjectFloat(DW_HEALTH);
    }
    public void setDamage(float d){
        this.dataWatcher.updateObject(DW_HEALTH, d);
    }
    public float getRollingDirection(){
        return this.dataWatcher.getWatchableObjectFloat(DW_ROLL);
    }
    public void setRollingDirection(float r){
        this.dataWatcher.updateObject(DW_ROLL, r);
    }

    public void setRollingVel(float vel)
    {
        this.velocity = vel;
        dataWatcher.updateObject(DW_VEL, velocity);
    }

    private void cycleTurnSignalIndex()
    {
        if (turnSignal != 0 && ticksExisted % 7 == 0)
        {
            turnSignalTick++;
            if (turnSignalTick == 2)
            {
                turnSignalTick = 0;
            }
        }
    }

    private void cycleBeaconIndex()
    {
        if (isBeaconEnabled && ticksExisted % 5 == 0)
        {
            beaconCycleIndex++;
            if (beaconCycleIndex == 4)
            {
                beaconCycleIndex = 0;
            }
        }
    }

    /** called every tick
     * replaces core entity update functionality, since EntityLiving does too much stuff we don't need.*/
    @Override
    public void onUpdate()
    {
        cycleBeaconIndex();
        cycleTurnSignalIndex();

        //handle the get punched animation
        if (this.getRollingDirection() > 0) {
            this.setRollingDirection(this.getRollingDirection() - 1);
        }

        if (this.getDamage() > 0.0F) {
            this.setDamage(this.getDamage() - 1.0F);
        }
        if(posY<-64){
            this.kill();
        }
        //handle super update crap
        this.onEntityUpdate();
        //handle movement
        this.moveEntityWithHeading();

        if (!worldObj.isRemote)
        {
            dataWatcher.updateObject(DW_LIGHTSJSON ,lightingDetailsJSON());

        }
    }

    /** save/load stuff */
    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        running= compound.getByte("run");
        velocity=compound.getFloat("vel");
        rotationYaw=compound.getFloat("yaw");
        dataWatcher.updateObject(DW_RUNNING, running);
        dataWatcher.updateObject(DW_YAW, rotationYaw);
        dataWatcher.updateObject(DW_SKIN, compound.getInteger("skin"));

        JsonObject lightDetailsJson;
        try
        {
            lightDetailsJson = AsJsonObject(compound.getString(DataMemberName.lightingDetailsJSON.AsString()));
        }
        catch (Exception e)
        {
            lightDetailsJson = lightingDetailsAsJSON();
        }

        isHeadlightsEnabled = lightDetailsJson.get(DataMemberName.isHeadlightsEnabled.AsString()).getAsBoolean();
        isBeaconEnabled = lightDetailsJson.get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean();
        beaconCycleIndex = lightDetailsJson.get(DataMemberName.beaconCycleIndex.AsString()).getAsByte();
        ditchLightMode = lightDetailsJson.get(DataMemberName.ditchLightMode.AsString()).getAsByte();
        turnSignal = lightDetailsJson.get(DataMemberName.turnSignal.AsString()).getAsByte();
        turnSignalTick = lightDetailsJson.get(DataMemberName.turnSignalTick.AsString()).getAsByte();
        areBrakeLightsOn = lightDetailsJson.get(DataMemberName.areBrakeLightsOn.AsString()).getAsBoolean();
        dataWatcher.updateObject(DW_LIGHTSJSON, lightingDetailsJSON());
    }
    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        compound.setByte("run", running);
        compound.setFloat("vel", velocity);
        compound.setFloat("yaw", rotationYaw);
        compound.setInteger("skin", dataWatcher.getWatchableObjectInt(DW_SKIN));
        compound.setString("lightingDetailsJSON", dataWatcher.getWatchableObjectString(DW_LIGHTSJSON));
    }

    /**
     * handles interaction from client over network.
     * @see bidahochi.foxdrives.util.PacketInteract  */
    public void networkInteract(int player, int key)
    {
        if (!worldObj.isRemote)
        {
            System.out.println(key);

            switch(key)
            {
                case 1:
                    this.dataWatcher.updateObject(DW_RUNNING, running==(byte)1?(byte)0:(byte)1);
                break;

                case 3:
                    //dataWatcher.updateObject(DW_BRAKING, 1);
                    areBrakeLightsOn = !areBrakeLightsOn;
                    braking = true;
                    dataWatcher.updateObject(DW_LIGHTSJSON ,lightingDetailsJSON());
                break;
                case 4:
                    setPacketTurnIndicator(turnSignal != -1 ? (byte)-1 : 0);
                    dataWatcher.updateObject(DW_LIGHTSJSON ,lightingDetailsJSON());
                    break;
                case 5:
                    setPacketTurnIndicator(turnSignal != 1 ? (byte)1 : 0);
                    dataWatcher.updateObject(DW_LIGHTSJSON ,lightingDetailsJSON());
                    break;
                case 10:
                    setPacketLights(isLightsEnabled() ? false : true);
                    dataWatcher.updateObject(DW_LIGHTSJSON ,lightingDetailsJSON());
                break;
                case 11:
                    setPacketBeacon(isBeaconEnabled() ? false : true);
                    dataWatcher.updateObject(DW_LIGHTSJSON ,lightingDetailsJSON());
                break;
                case 12:
                    setPacketDitchLightsMode(isDitchLightsEnabled() ? (byte) 0 : (byte) 1);
                    dataWatcher.updateObject(DW_LIGHTSJSON ,lightingDetailsJSON());
                break;
            }
            System.out.println(key + " " + player);
        }
    }

    /**
     * Moves the entity based on the rider heading and rider.moveForward
     */
    public void moveEntityWithHeading()
    {
        if(running != dataWatcher.getWatchableObjectByte(DW_RUNNING)){
            running = dataWatcher.getWatchableObjectByte(DW_RUNNING);
        }

        if (!worldObj.isRemote && running == 0)
        {
            velocity = 0;
            motionX = 0;
            motionY = 0;
            motionZ = 0;
        }
        else if(!worldObj.isRemote)
        {
            motionX *= 0.9;
            motionY = -0.4905;
            motionZ *= 0.9;
            velocity *= 0.92;
            EntityLivingBase rider = ((EntityLivingBase)this.riddenByEntity);
            if(rider != null){
                velocity += rider.moveForward * type().accel ;
            }
            if(braking){
                velocity *= 0.5;
                if(velocity < 0.1 && velocity > -0.1) velocity = 0;
                //dataWatcher.updateObject(DW_BRAKING, 0);
                braking = false;
            }
            if(running == 0 || riddenByEntity == null){
                velocity = 0;
            }
            else if(velocity <= 0f){
                velocity *= 0.35f;
            }
            clampTopSpeed(velocity);
            float diff = rider == null ? 0f : rotationYaw - rider.rotationYaw;
            if(running != 0){
                rotationYaw -= (diff * turnStrength(velocity <= 0.0F));
                dataWatcher.updateObject(DW_YAW, rotationYaw);
            }

            this.stepHeight = canClimbFullBlocks()?1.0f:canClimbSlabs()?0.5f:0.0f;
            moveEntityWithHeading(0, velocity);
            motionX -= Math.sin(Math.toRadians(rotationYaw)) * velocity * 0.05;
            motionZ += Math.cos(Math.toRadians(rotationYaw)) * velocity * 0.05;
            //moveEntity(motionX, motionY, motionZ);

            double d0 = 0.25D;
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, getBoundingBox().expand(d0, d0, d0));
            for(Object o : list){
                if(o instanceof EntityPlayer && ((Entity)o).ridingEntity instanceof EntitySeat) continue;
                if(o instanceof EntityLiving && ((Entity)o).getBoundingBox() != null && ((Entity)o).getBoundingBox().intersectsWith(getBoundingBox())){
                    ((Entity)o).attackEntityFrom(new EntityDamageSource("player", this), 5);
                }
            }
        } else if(tickOffset >0) {
            prevPosX=posX;prevPosZ=posZ;
            setPosition(
                    this.posX + (this.transportX - this.posX) / (double) this.tickOffset,
                    this.posY + (this.transportY - this.posY) / (double) this.tickOffset,
                    this.posZ + (this.transportZ - this.posZ) / (double) this.tickOffset
            );
            tickOffset--;
            prevRotationYaw = rotationYaw;
            rotationYaw = rotationYaw + (((servyaw - rotationYaw) + 180) % 360 - 180) / tickOffset;
        }
    }

    public void clampTopSpeed(double velocity) {
        //clamp top speed
        if(velocity > type().max_forward_speed){
            this.velocity = type().max_forward_speed;
        }
        else if(velocity < -type().max_backward_speed){
            this.velocity = -type().max_backward_speed;
        }
    }

    @SideOnly(Side.CLIENT)
    public void setPositionAndRotation2(double p_70056_1_, double p_70056_3_, double p_70056_5_, float p_70056_7_, float p_70056_8_, int p_70056_9_) {
        transportX=p_70056_1_;
        transportY=p_70056_3_;
        transportZ=p_70056_5_;
        //adds 2 to the tick offset to match the entity registration's update frequency of 3.
        //as noted in the cpw.mods.fml.common.registry.EntityRegistry.registerModEntity
        //     call of FoxDrives.java#init(FMLInitializationEvent)
        tickOffset = p_70056_9_ + 2;
        servyaw = dataWatcher.getWatchableObjectFloat(DW_YAW);

        //force an extra rider position update. probably unnecessary, but better safe than laggy.
        updateRiderPosition();
    }

    /**sets the position of the entity riding*/
    @Override
    public void updateRiderPosition(){
        if (this.riddenByEntity != null) {

            float[] pos = type().passenger_pos.get(0);
            //rotate yaw
            if(rotationYaw != 0.0F){
                float cos = MathHelper.cos((rotationYaw)*((float) Math.PI / 180.0f));
                float sin = MathHelper.sin((rotationYaw)*((float) Math.PI / 180.0f));

                riddenByEntity.setPosition(
                    posX + (pos[0] * cos - pos[2] * sin),
                    posY + riddenByEntity.getYOffset() * type().rider_scale + pos[1],
                    posZ + (pos[0] * sin + pos[2] * cos)
                );
            }
            else{
                riddenByEntity.setPosition(posX + pos[0], posY + riddenByEntity.getYOffset() * type().rider_scale + pos[1], posZ + pos[2]);
            }
        }
    }

    /*todo:
    @Override
    public void openGUI(EntityPlayer p_110199_1_)
    {
        if (!this.worldObj.isRemote && (this.riddenByEntity == null || this.riddenByEntity == p_110199_1_) && this.isTame())
        {
            this.horseChest.func_110133_a(this.getCommandSenderName());
            p_110199_1_.displayGUIHorse(this, this.horseChest);
        }
    }*/


    //todo: plays driving sounds using vanilla step sound heresy
    @Override
    public void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_){}

    @Override
    public void setDead(){
        super.setDead();
        for(EntitySeat seat : passengers){
            seat.car = null;
            seat.setDead();
        }
    }

    /** Gets this Entity's CarType */
    public abstract CarType type();

    public float getGuiRenderScale() {
        return guiRenderScale;
    }

    public void setGuiRenderScale(float guiRenderScale) {
        this.guiRenderScale = guiRenderScale;
    }

    public Vec3f getModelRotation() {
        return new Vec3f(0,0,0);
    }

    public Vec3f getModelOffset() {
        return new Vec3f(0,0,0);
    }

    public Vec3f getModelScale() {
        return new Vec3f(1,1,1);
    }

    /**
     * Moves the entity based on the specified heading.  Args: strafe, forward
     */
    public void moveEntityWithHeading(float p_70612_1_, float p_70612_2_)
    {
        double d0;

        if (this.isInWater())
        {
            d0 = this.posY;
            this.moveFlying(p_70612_1_, p_70612_2_, !false ? 0.04F : 0.02F);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.800000011920929D;
            this.motionY *= 0.800000011920929D;
            this.motionZ *= 0.800000011920929D;
            this.motionY -= 0.02D;

            if (this.isCollidedHorizontally && this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d0, this.motionZ))
            {
                this.motionY = 0.30000001192092896D;
            }
        }
        else if (this.handleLavaMovement())
        {
            d0 = this.posY;
            this.moveFlying(p_70612_1_, p_70612_2_, 0.02F);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.5D;
            this.motionY *= 0.5D;
            this.motionZ *= 0.5D;
            this.motionY -= 0.02D;

            if (this.isCollidedHorizontally && this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579D - this.posY + d0, this.motionZ))
            {
                this.motionY = 0.30000001192092896D;
            }
        }
        else
        {
            float f2 = 0.91F;

            if (this.onGround)
            {
                f2 = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ)).slipperiness * 0.91F;
            }

            float f3 = 0.16277136F / (f2 * f2 * f2);
            float f4;

            if (this.onGround)
            {
                f4 = 0.1F * f3;
            }
            else
            {
                f4 = 0.02F;
            }

            this.moveFlying(p_70612_1_, p_70612_2_, f4);
            f2 = 0.91F;

            if (this.onGround)
            {
                f2 = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ)).slipperiness * 0.91F;
            }


            this.moveEntity(this.motionX, this.motionY, this.motionZ);

            if (this.worldObj.isRemote && (!this.worldObj.blockExists((int)this.posX, 0, (int)this.posZ) || !this.worldObj.getChunkFromBlockCoords((int)this.posX, (int)this.posZ).isChunkLoaded))
            {
                if (this.posY > 0.0D)
                {
                    this.motionY = -0.1D;
                }
                else
                {
                    this.motionY = 0.0D;
                }
            }
            else
            {
                this.motionY -= 0.08D;
            }

            this.motionY *= 0.9800000190734863D;
            this.motionX *= (double)f2;
            this.motionZ *= (double)f2;
        }

        //this.prevLimbSwingAmount = this.limbSwingAmount;
        d0 = this.posX - this.prevPosX;
        double d1 = this.posZ - this.prevPosZ;
        float f6 = MathHelper.sqrt_double(d0 * d0 + d1 * d1) * 4.0F;

        if (f6 > 1.0F)
        {
            f6 = 1.0F;
        }

        //this.limbSwingAmount += (f6 - this.limbSwingAmount) * 0.4F;
        //this.limbSwing += this.limbSwingAmount;
    }
}
