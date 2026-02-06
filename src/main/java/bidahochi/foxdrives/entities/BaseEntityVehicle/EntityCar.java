package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.GuiIDs;
import bidahochi.foxdrives.entities.EntitySeat;
import bidahochi.foxdrives.entities.util.TrustedPlayer;
import bidahochi.foxdrives.util.DataMemberName;
import bidahochi.foxdrives.util.ItemCar;
import com.google.gson.JsonObject;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static bidahochi.foxdrives.util.FoxDrivesConstants.*;

public abstract class EntityCar extends Entity implements IEntityAdditionalSpawnData {

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

    /**
     * Whether this vehicle is locked and can only be used by the Owner
     */
    public boolean locked = false;

    /**
     * Lock packet
     */
    public boolean getTransportLocked() {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.isTransportLocked.AsString()).getAsBoolean();
    }

    /**
     * Lock packet
     */
    public void setTransportLocked(boolean set) {
        locked = set;
        if (!worldObj.isRemote)
        dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
    }

    /**
     * The owner of the vehicle: The user who spawned it
     */
    private String transportOwner = "";

    public String getTransportOwner() {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.vehicleOwner.AsString()).getAsString();
    }

    public void setTransportOwner(String transportOwner)
    {
        this.transportOwner = transportOwner;
        dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
    }


    /**
     * The creator of the train
     */
    public String vehicleCreator = "";


    public ArrayList<EntitySeat> passengers = new ArrayList<>();

    /**
     * <p>List of players trusted to use the train</p>
     */
    private List<TrustedPlayer> trustedList = new ArrayList<>();

    /**
     * <p>Stores texture descriptions. Integer represents the number of the skin as registered in DataWatcher, and the String is the description itself.</p>
     */
    public final Map<Integer, String> textureDescriptionMap = new HashMap<>();

     /**
     * entity spawn
     */
    public EntityCar(World world) {
        super(world);
        //this can be called on server from the inventory car class, so, dont do client stuff there
        if(world.isRemote)
        {
            this.yOffset = 0;
        }

        this.preventEntitySpawning = true;
        this.setSize(getHitboxSize(), 1.6F);
        ignoreFrustumCheck = true;
        this.isImmuneToFire = true;
    }

    /**
     * Literally just exists to properly init the datawatcher stuff.
     */
    @Override
    protected void entityInit(){
        this.dataWatcher.addObject(DW_VEL, velocity);
        this.dataWatcher.addObject(DW_VEHICLEDATAJSON, vehicleDataJSON());//tracks vehicle lighting
        this.dataWatcher.addObject(DW_RUNNING, running);//tracks if the entity is on or not
        this.dataWatcher.addObject(DW_ROLL, roll);//tracks the entity roll from being hit
        this.dataWatcher.addObject(DW_HEALTH, health);//tracks entity health
        this.dataWatcher.addObject(DW_SKIN, 0);//used to track currently selected skin
        this.dataWatcher.addObject(DW_YAW, 0f);//used to track rotation yaw
        //this.dataWatcher.addObject(DW_THROTTLE, 0f);//throttle
        //this.dataWatcher.addObject(DW_BRAKING, 0);//throttle
    }

    public JsonObject vehicleDataAsJsonObjectDW()
    {
        try
        {
            return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON));
        }
        catch (Exception e)
        {
            return vehicleDataAsJSON();
        }
    }

    public int getSkin()
    {
        return dataWatcher.getWatchableObjectInt(DW_SKIN);
    }

    private boolean isHeadlightsEnabled = false;
    private boolean isBeaconEnabled = false;
    private byte ditchLightMode = 0;
    private byte beaconCycleIndex = 0;
    private byte turnSignal = 0; // False for left, True for right
    private byte turnSignalTick = 0;
    private boolean areBrakeLightsOn = false;

    public String vehicleDataJSON()
    {
        return vehicleDataAsJSON().toString();
    }

    public JsonObject vehicleDataAsJSON()
    {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty(DataMemberName.vehicleOwner.AsString(), transportOwner);
        jsonObject.addProperty(DataMemberName.isTransportLocked.AsString(), locked);
        jsonObject.addProperty("vehicleCreator", vehicleCreator);
        jsonObject.addProperty("isHeadlightsEnabled", isHeadlightsEnabled);
        jsonObject.addProperty("isBeaconEnabled", isBeaconEnabled);
        jsonObject.addProperty("beaconCycleIndex", beaconCycleIndex);
        jsonObject.addProperty("ditchLightMode", ditchLightMode);
        jsonObject.addProperty("turnSignal", turnSignal);
        jsonObject.addProperty("turnSignalTick", turnSignalTick);
        jsonObject.addProperty("areBrakeLightsOn", areBrakeLightsOn);
        return jsonObject;
    }

    private JsonObject AsJsonObject(String string)
    {
        return FoxDrives.JSON_PARSER.parse(string).getAsJsonObject();
    }

    public boolean isRunning()
    {
        return dataWatcher.getWatchableObjectByte(DW_RUNNING) > 0;
    }

    public boolean isLightsEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.isHeadlightsEnabled.AsString()).getAsBoolean();
    }

    public boolean areBrakeLightsOn()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.areBrakeLightsOn.AsString()).getAsBoolean();
    }

    public boolean isBeaconEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean();
    }

    public byte getBeaconCycleIndex()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.beaconCycleIndex.AsString()).getAsByte();
    }

    public boolean isAuxLightsEnabled()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.ditchLightMode.AsString()).getAsByte() > 0;
    }

    /**
     * Get Turns Signal Direction
     * @return Left = -1, Right = 1
     */
    public byte getTurnSignalDirection()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.turnSignal.AsString()).getAsByte();
    }

    public byte getTurnSignalTick()
    {
        return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.turnSignalTick.AsString()).getAsByte();
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
    public boolean interactFirst(EntityPlayer player)
    {
        if (player.ridingEntity == this)
        {
            return false;
        }

        ItemStack itemstack = player.inventory.getCurrentItem();
        if (lockThisTransport(itemstack, player))
        {
            return true;
        }

        if (this.getTransportLocked())
        {
            boolean isTrustedPlayer = isPlayerTrusted(player.getDisplayName());
            if (!player.getDisplayName().equalsIgnoreCase(this.getTransportOwner()) && isTrustedPlayer == false)
            {
                if (!worldObj.isRemote) player.addChatMessage(new ChatComponentText("Vehicle is locked by " + this.getTransportOwner() + "."));
                return true;
            }
            else if (!player.getDisplayName().equalsIgnoreCase(this.getTransportOwner()) && player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() == FoxDrives.wrap  && !isTrustedPlayer == false)
            {
                if (!worldObj.isRemote) player.addChatMessage(new ChatComponentText("Vehicle is locked by " + this.getTransportOwner() + "."));
                return true;
            }
        }

        // Owner Only Operations / Trusted to Break
        if ((this.getTransportLocked() == false || player.getDisplayName().equalsIgnoreCase(this.getTransportOwner()) || isPlayerTrustedToBreak(player.getDisplayName())) && player.getHeldItem() != null)
        {
            if(player.getHeldItem().getItem() == FoxDrives.wrap)
            {
                if (!player.isSneaking())
                {
                    //gets current skin value and loops around to 0 if it's past the entity's skin count.
                    int skin = dataWatcher.getWatchableObjectInt(DW_SKIN) + 1;
                    if (skin >= getSkins().length)
                    {
                        skin = 0;
                    }
                    dataWatcher.updateObject(DW_SKIN, skin);
                    return true;
                }
                else if (getSkins().length > 1)
                {
                    player.openGui(FoxDrives.instance, GuiIDs.WRAP_MENU, player.getEntityWorld(), this.getEntityId(), -1, (int) this.posZ);
                    return true;
                }
                //otherwise, try to mount the entity
            }
        }

        if (!this.worldObj.isRemote)
        {
            if(riddenByEntity == null)
            {
                player.mountEntity(this);
            }
            else if(player.ridingEntity == null)
            {
                if(passengers.size() + 1 < type().passenger_pos.size())
                {
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

        return worldObj.isRemote;
    }

    private boolean lockThisTransport(ItemStack itemstack, EntityPlayer entityplayer)
    {
        if (itemstack != null && itemstack.getItem().getUnlocalizedName().toLowerCase().contains("tc:adminbook"))
        {
            if (worldObj.isRemote)
            {
                return false;
            }
            if (entityplayer.canCommandSenderUseCommand(2, ""))
            {
                setTransportLocked(!locked);
                if(!worldObj.isRemote)
                {
                    entityplayer.addChatMessage(new ChatComponentText(locked ? "Locked" : "Unlocked"));
                }
            }

            return true;
        }

        return false;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource damagesource, float p_70097_2_) {
        if(worldObj.isRemote || isDead) return false;
        if (damagesource.getEntity() instanceof EntityPlayer && damagesource.isProjectile() == false)
        {
            if (canBeDestroyedByPlayer(damagesource))
            {
                ((EntityPlayer) damagesource.getEntity()).addChatComponentMessage(new ChatComponentText("Cannot remove" + " owned by " + getTransportOwner() + "."));
                return false;
            }

            setRollingDirection(-this.getRollingDirection());
            setRollingDirection(10);
            setDamage(this.getDamage() + p_70097_2_ * 10.0F);

            EntityPlayer player = damagesource.getEntity() instanceof EntityPlayer ? player = (EntityPlayer)damagesource.getEntity() : null;
            if((player != null && player.capabilities.isCreativeMode) || getDamage() > 40)
            {
                if(riddenByEntity != null) riddenByEntity.mountEntity(null);
                if(getDamage() > 40)
                {
                    onEntityDestruction(damagesource);
                    setDead();
                    if(player != null && !player.capabilities.isCreativeMode)
                    {
                        Item item = CarType.getItemByClass(this.getClass());
                        if(item != null)
                        {
                            ItemStack stack = ItemCar.setPersistentData(new ItemStack(item, 1), this);
                            exportTrustedListToNBT(stack != null ? stack.getTagCompound() : null);
                            EntityItem ent = new EntityItem(worldObj);
                            ent.setEntityItemStack(stack);
                            ent.setPosition(posX, posY + 0.5, posZ);
                            worldObj.spawnEntityInWorld(ent);
                        }
                    }
                }
            }
        }
        return true;
    }

    protected boolean canBeDestroyedByPlayer(DamageSource damagesource) {
        if (this.getTransportLocked())
        {
            if (damagesource.getEntity() instanceof EntityPlayer)
            {
                if (!((EntityPlayer) damagesource.getEntity()).getDisplayName().equalsIgnoreCase(this.getTransportOwner()) && !(this.isPlayerTrustedToBreak(((EntityPlayerMP) damagesource.getEntity()).getDisplayName())))
                {
                    return true;
                }
            }
            else if (!damagesource.isProjectile())
            {
                return true;
            }
        }
        return false;
    }

    public void onEntityDestruction(DamageSource damagesource)
    {
        // Mostly used for child classes
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
            dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());

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


        JsonObject vehicleDetailsJson;
        try
        {
            vehicleDetailsJson = AsJsonObject(compound.getString(DataMemberName.vehicleDetailsJSON.AsString()));
            ReverseMapJson(vehicleDetailsJson);
        }
        catch (Exception e)
        {
            vehicleDetailsJson = vehicleDataAsJSON();
            ReverseMapJson(vehicleDetailsJson);
            FoxDrives.fdLog.info(e.getMessage());
        }

        dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
    }

    private void ReverseMapJson(JsonObject vehicleDetailsJson)
    {
        transportOwner = vehicleDetailsJson.get(DataMemberName.vehicleOwner.AsString()).getAsString();
        vehicleCreator = vehicleDetailsJson.get(DataMemberName.vehicleCreator.AsString()).getAsString();
        isHeadlightsEnabled = vehicleDetailsJson.get(DataMemberName.isHeadlightsEnabled.AsString()).getAsBoolean();
        isBeaconEnabled = vehicleDetailsJson.get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean();
        beaconCycleIndex = vehicleDetailsJson.get(DataMemberName.beaconCycleIndex.AsString()).getAsByte();
        ditchLightMode = vehicleDetailsJson.get(DataMemberName.ditchLightMode.AsString()).getAsByte();
        turnSignal = vehicleDetailsJson.get(DataMemberName.turnSignal.AsString()).getAsByte();
        turnSignalTick = vehicleDetailsJson.get(DataMemberName.turnSignalTick.AsString()).getAsByte();
        areBrakeLightsOn = vehicleDetailsJson.get(DataMemberName.areBrakeLightsOn.AsString()).getAsBoolean();
        locked = vehicleDetailsJson.get(DataMemberName.isTransportLocked.AsString()).getAsBoolean();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        compound.setByte("run", running);
        compound.setFloat("vel", velocity);
        compound.setFloat("yaw", rotationYaw);
        compound.setInteger("skin", dataWatcher.getWatchableObjectInt(DW_SKIN));
        compound.setString(DataMemberName.vehicleDetailsJSON.MemberName, vehicleDataJSON());
    }

    /**
     * handles interaction from client over network.
     * @see bidahochi.foxdrives.util.PacketInteract  */
    public void networkInteract(int player, int key)
    {
        if (!worldObj.isRemote) {
            switch (key) {
                case 1:
                    this.dataWatcher.updateObject(DW_RUNNING, running == (byte) 1 ? (byte) 0 : (byte) 1);
                    break;

                case 3:
                    //dataWatcher.updateObject(DW_BRAKING, 1);
                    areBrakeLightsOn = !areBrakeLightsOn;
                    braking = true;
                    dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
                    break;
                case 4:
                    setPacketTurnIndicator(turnSignal != -1 ? (byte) -1 : 0);
                    dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
                    break;
                case 5:
                    setPacketTurnIndicator(turnSignal != 1 ? (byte) 1 : 0);
                    dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
                    break;
                case 10:
                    setPacketLights(isLightsEnabled() ? false : true);
                    dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
                    break;
                case 11:
                    setPacketBeacon(isBeaconEnabled() ? false : true);
                    dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
                    break;
                case 12:
                    setPacketDitchLightsMode(isAuxLightsEnabled() ? (byte) 0 : (byte) 1);
                    dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
                    break;
            }
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
    // Implements Locked & Trusted List

    /**
     * @return Returns String ArrayList of trusted players' usernames.
     */
    public List<TrustedPlayer> getTrustedList() {
        return trustedList;
    }
    public void setTrustedList(List<TrustedPlayer> trustedList) { this.trustedList = trustedList; }

    /**
     * <p>Returns whether or not a player is trusted to a piece of rolling stock.</p>
     * @param displayName Case-insensitive display name of player.
     * @return True if the player is trusted, false if the player is not trusted.
     */
    public boolean isPlayerTrusted(String displayName) {
        for (TrustedPlayer trustedPlayer : this.getTrustedList()) {
            if (trustedPlayer.getDisplayName().equalsIgnoreCase(displayName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * <p>Returns whether or not a player is trusted to break a piece of rolling stock.</p>
     * @param displayName Case-insensitive display name of player.
     * @return True if player has break access, false if player does not have break access.
     */
    public boolean isPlayerTrustedToBreak(String displayName) {
        for (TrustedPlayer trustedPlayer : this.getTrustedList()) {
            if (trustedPlayer.getDisplayName().equalsIgnoreCase(displayName)) {
                return trustedPlayer.hasBreakAccess();
            }
        }
        return false;
    }

    /**
     * <p>Export trusted players to NBT tag for data saving.</p>
     * @param nbttagcompound NBT tag into which to write trusted list.
     */
    public void exportTrustedListToNBT(NBTTagCompound nbttagcompound) {
        if (!trustedList.isEmpty()) {
            NBTTagList trustedList = new NBTTagList();
            for (TrustedPlayer trustedPlayer : this.trustedList) {
                NBTTagCompound trustedPlayerTag = new NBTTagCompound();
                trustedPlayerTag.setString("playerName", trustedPlayer.getDisplayName());
                trustedPlayerTag.setBoolean("breakAccess", trustedPlayer.hasBreakAccess());
                trustedList.appendTag(trustedPlayerTag);
            }
            nbttagcompound.setTag("trustedList", trustedList);
            nbttagcompound.setString("trustedListPreviousOwner", getTransportOwner());
        }
    }

    /**
     * <p>Import a trusted player list from a given NBT tag.</p>
     * @param nbttagcompound NBT tag from which to import trusted list.
     */
    public void importTrustedListFromNBT(NBTTagCompound nbttagcompound) {
        if (nbttagcompound.hasKey("trustedList")) {
            NBTTagList trustedList = nbttagcompound.getTagList("trustedList", Constants.NBT.TAG_COMPOUND);
            this.trustedList.clear();
            for (int i = 0; i < trustedList.tagCount(); i++) {
                if (!trustedList.getCompoundTagAt(i).getString("playerName").equalsIgnoreCase(getTransportOwner())) // Check to ensure we're not adding the current owner to the trusted list...
                    this.trustedList.add(new TrustedPlayer(trustedList.getCompoundTagAt(i).getString("playerName"), trustedList.getCompoundTagAt(i).getBoolean("breakAccess")));
            }
            if (nbttagcompound.hasKey("trustedListPreviousOwner")) { // If the previous owner is not the one who placed down the piece of rolling stock...
                if (!nbttagcompound.getString("trustedListPreviousOwner").equalsIgnoreCase(getTransportOwner())) {
                    getTrustedList().add(new TrustedPlayer(nbttagcompound.getString("trustedListPreviousOwner"), true));
                }
            }
        }
    }

    /**
     * <p>This method is called on the client side when an entity is being loaded in. The additionalData buffer is sent from the server
     * and is populated by the server using the writeSpawnData method.</p>
     * <br></br><p>"this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared."</p>
     * @param additionalData The packet data stream
     */
    @Override
    public void readSpawnData(ByteBuf additionalData) {
        locked = additionalData.readBoolean();
    }

    /**
     * <p>This method is called on the server side when a connected client is loading the entity. Data written
     * to the ByteBuffer will be synced with the client and available to the client through the readSpawnData method.</p>
     * <br></br><p>"this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared."</p>
     * @param buffer The packet data stream
     */
    @Override
    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeBoolean(locked);
    }
}
