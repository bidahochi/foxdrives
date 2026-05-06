package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.GuiIDs;
import bidahochi.foxdrives.entities.EntitySeat;
import bidahochi.foxdrives.entities.util.TrustedPlayer;
import bidahochi.foxdrives.util.DataMemberName;
import bidahochi.foxdrives.util.ItemTrailer;
import com.google.gson.JsonObject;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
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

import java.util.*;

import static bidahochi.foxdrives.util.FoxDrivesConstants.*;

public abstract class EntityTrailer extends Entity implements IEntityAdditionalSpawnData, IWrappable {

    @SideOnly(Side.CLIENT)
    public ModelBase modelInstance;

    //@SideOnly(Side.CLIENT)
    public long lastFrame = System.currentTimeMillis();

    public float health =20, roll=0;
    public double transportX=0,transportY=0,transportZ=0;
    public float servyaw;
    public int tickOffset=0;
    public float velocity=0;
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

    public void setTransportOwner(String transportOwner) {
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
    public EntityTrailer(World world) {
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
    protected void entityInit() {
        this.dataWatcher.addObject(DW_VEL, velocity);
        this.dataWatcher.addObject(DW_VEHICLEDATAJSON, vehicleDataJSON());//tracks vehicle lighting
        this.dataWatcher.addObject(DW_ROLL, roll);//tracks the entity roll from being hit
        this.dataWatcher.addObject(DW_HEALTH, health);//tracks entity health
        this.dataWatcher.addObject(DW_SKIN, 0);//used to track currently selected skin
        this.dataWatcher.addObject(DW_YAW, 0f);//used to track rotation yaw
        if (this instanceof ITowingChild) {
            this.dataWatcher.addObject(DW_PARENT, -1);
        }
        if (this instanceof ITowingParent) {
            this.dataWatcher.addObject(DW_CHILD, -1);
        }
        this.dataWatcher.addObject(DW_UNIQUEID, -1);
        //this.dataWatcher.addObject(DW_THROTTLE, 0f);//throttle
        //this.dataWatcher.addObject(DW_BRAKING, 0);//throttle
    }

    public JsonObject vehicleDataAsJsonObjectDW() {
        try
        {
            return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON));
        }
        catch (Exception e)
        {
            return vehicleDataAsJSON();
        }
    }

    public int getSkin() { return dataWatcher.getWatchableObjectInt(DW_SKIN); }

    private boolean isHeadlightsEnabled = false;
    private boolean isBeaconEnabled = false;
    private byte ditchLightMode = 0;
    private byte beaconCycleIndex = 0;
    private byte turnSignal = 0; // False for left, True for right
    private byte turnSignalTick = 0;
    private boolean areBrakeLightsOn = false;

    public String vehicleDataJSON() { return vehicleDataAsJSON().toString(); }

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

    //TODO: everything with lighting pulls from the towing entity
    public boolean isLightsEnabled() { return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.isHeadlightsEnabled.AsString()).getAsBoolean(); }

    public boolean areBrakeLightsOn() { return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.areBrakeLightsOn.AsString()).getAsBoolean(); }

    public boolean isBeaconEnabled() { return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean(); }

    public byte getBeaconCycleIndex() { return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.beaconCycleIndex.AsString()).getAsByte(); }

    public boolean isAuxLightsEnabled() { return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.ditchLightMode.AsString()).getAsByte() > 0; }



    /**
     * Get Turns Signal Direction
     * @return Left = -1, Right = 1
     */
    public byte getTurnSignalDirection() { return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.turnSignal.AsString()).getAsByte(); }

    public byte getTurnSignalTick() { return AsJsonObject(dataWatcher.getWatchableObjectString(DW_VEHICLEDATAJSON)).get(DataMemberName.turnSignalTick.AsString()).getAsByte(); }

    public float getVelocity() { return dataWatcher.getWatchableObjectFloat(DW_VEL); }

    public void setPacketLights(boolean isHeadlightsOn) { isHeadlightsEnabled = isHeadlightsOn; }

    public void setPacketTurnIndicator(byte turnIndicator) { turnSignal = turnIndicator; }

    public void setPacketBeacon(boolean isVehicleBeaconEnabled) { isBeaconEnabled = isVehicleBeaconEnabled; }

    /**Sets the Ditch light mode
     *
     * @param ditchLightMode set 0 for off,
     */
    public void setPacketDitchLightsMode(byte ditchLightMode) { this.ditchLightMode = ditchLightMode; }


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
        //if (entity instanceof EntityReceiver) return;
        if(entity instanceof EntityPlayer && entity.ridingEntity instanceof EntitySeat) return;
        super.applyEntityCollision(entity);
	}

    /**add entity mount functionality, and remove item interactions*/
    @Override
    public boolean interactFirst(EntityPlayer player) {
        if (player.ridingEntity == this) {
            return false;
        }

        ItemStack itemstack = player.inventory.getCurrentItem();
        if (lockThisTransport(itemstack, player)) {
            return true;
        }

        if (this.getTransportLocked()) {
            boolean isTrustedPlayer = isPlayerTrusted(player.getDisplayName());
            if (!player.getDisplayName().equalsIgnoreCase(this.getTransportOwner()) && isTrustedPlayer == false) {
                if (!worldObj.isRemote) player.addChatMessage(new ChatComponentText("Vehicle is locked by " + this.getTransportOwner() + "."));
                return true;
            }
            else if (!player.getDisplayName().equalsIgnoreCase(this.getTransportOwner()) && player.inventory.getCurrentItem() != null && player.inventory.getCurrentItem().getItem() == FoxDrives.wrap  && !isTrustedPlayer == false) {
                if (!worldObj.isRemote) player.addChatMessage(new ChatComponentText("Vehicle is locked by " + this.getTransportOwner() + "."));
                return true;
            }
        }

        // Owner Only Operations / Trusted to Break
        if ((!this.getTransportLocked() || player.getDisplayName().equalsIgnoreCase(this.getTransportOwner()) || isPlayerTrustedToBreak(player.getDisplayName())) && player.getHeldItem() != null) {
            if(player.getHeldItem().getItem() == FoxDrives.wrap) {
                if (!player.isSneaking()) {
                    //gets current skin value and loops around to 0 if it's past the entity's skin count.
                    int skin = dataWatcher.getWatchableObjectInt(DW_SKIN) + 1;
                    if (skin >= getSkins().length)
                    {
                        skin = 0;
                    }
                    dataWatcher.updateObject(DW_SKIN, skin);
                    return true;
                }
                else if (getSkins().length > 1) {
                    player.openGui(FoxDrives.instance, GuiIDs.WRAP_MENU, player.getEntityWorld(), this.getEntityId(), -1, (int) this.posZ);
                    return true;
                }
                //otherwise, try to mount the entity
            }
        }

        if (!this.worldObj.isRemote) {
            if(riddenByEntity == null && !type().passenger_pos.isEmpty()) {
                player.mountEntity(this);
            }
            else if(player.ridingEntity == null && !type().passenger_pos.isEmpty()) {
                if(passengers.size() + 1 < type().passenger_pos.size()) {
                    //TODO: refactor seats to allow more than just cars.
                    /*EntitySeat seat = new EntitySeat(this);
                    seat.setPosition(posX, posY, posZ);
                    seat.getDataWatcher().updateObject(17, getEntityId());
                    worldObj.spawnEntityInWorld(seat);
                    passengers.add(seat);
                    player.mountEntity(seat);*/
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
        if (damagesource.getEntity() instanceof EntityPlayer && !damagesource.isProjectile())
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
                        Item item = TrailerType.getItemByClass(this.getClass());
                        if(item != null)
                        {
                            ItemStack stack = ItemTrailer.setPersistentData(new ItemStack(item, 1), this);
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

    public void onEntityDestruction(DamageSource damagesource) { /* Mostly used for child classes */ }

    public float getDamage() { return this.dataWatcher.getWatchableObjectFloat(DW_HEALTH); }
    public void setDamage(float d) { this.dataWatcher.updateObject(DW_HEALTH, d); }

    public float getRollingDirection() { return this.dataWatcher.getWatchableObjectFloat(DW_ROLL); }
    public void setRollingDirection(float r) { this.dataWatcher.updateObject(DW_ROLL, r); }

    public void setRollingVel(float vel) {
        this.velocity = vel;
        dataWatcher.updateObject(DW_VEL, velocity);
    }

    /** called every tick
     * replaces core entity update functionality, since EntityLiving does too much stuff we don't need.*/
    @Override
    public void onUpdate() {
        //handle the get punched animation
        if (this.getRollingDirection() > 0) {
            this.setRollingDirection(this.getRollingDirection() - 1);
        }

        if (this.getDamage() > 0.0F) {
            this.setDamage(this.getDamage() - 1.0F);
        }
        if(posY<-64) {
            this.kill();
        }
        //handle super update crap
        this.onEntityUpdate();

        if (!worldObj.isRemote) {
            dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
        }
    }

    /** save/load stuff */
    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        velocity=compound.getFloat("vel");
        rotationYaw=compound.getFloat("yaw");
        dataWatcher.updateObject(DW_YAW, rotationYaw);
        dataWatcher.updateObject(DW_SKIN, compound.getInteger("skin"));
        if (this instanceof ITowingChild) {
            dataWatcher.updateObject(DW_PARENT, compound.getInteger("parentID"));
        }
        if (this instanceof ITowingParent) {
            dataWatcher.updateObject(DW_CHILD, compound.getInteger("childID"));
        }
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

        if (compound.hasKey("UUIDMost")) {
            this.entityUniqueID = new UUID(compound.getLong("UUIDMost"), compound.getLong("UUIDLeast"));
        }

        dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
    }

    private void ReverseMapJson(JsonObject vehicleDetailsJson) {
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
        compound.setFloat("vel", velocity);
        compound.setFloat("yaw", rotationYaw);
        compound.setInteger("skin", dataWatcher.getWatchableObjectInt(DW_SKIN));
        if (this instanceof ITowingChild) {
            compound.setInteger("parentID", dataWatcher.getWatchableObjectInt(DW_PARENT));
        }
        if (this instanceof ITowingParent) {
            compound.setInteger("childID", dataWatcher.getWatchableObjectInt(DW_CHILD));
        }
        compound.setString(DataMemberName.vehicleDetailsJSON.MemberName, vehicleDataJSON());
    }

    //we don't want vanilla mvmnt to apply at all.
    @Override
    public void moveEntity(double x, double y, double z) { }

    @SideOnly(Side.CLIENT)
    public void setPositionAndRotation2(double p_70056_1_, double p_70056_3_, double p_70056_5_, float p_70056_7_, float p_70056_8_, int p_70056_9_) {
        super.setPositionAndRotation2(p_70056_1_, p_70056_3_, p_70056_5_, p_70056_7_, p_70056_8_, 1);
    }

    /**sets the position of the entity riding*/
    @Override
    public void updateRiderPosition() {
        if (this.riddenByEntity != null && !type().passenger_pos.isEmpty()) {

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
    public void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_) {}

    @Override
    public void setDead(){
        super.setDead();
        for(EntitySeat seat : passengers){
            seat.car = null;
            seat.setDead();
        }
    }

    /** Gets this Entity's TrailerType */
    public abstract TrailerType type();

    public float getGuiRenderScale() { return guiRenderScale; }

    public void setGuiRenderScale(float guiRenderScale) { this.guiRenderScale = guiRenderScale; }

    public Vec3f getModelRotation() { return new Vec3f(0,0,0); }

    public Vec3f getModelOffset() { return new Vec3f(0,0,0); }

    public Vec3f getModelScale() { return new Vec3f(1,1,1); }

    // Implements Locked & Trusted List
    /**
     * @return Returns String ArrayList of trusted players' usernames.
     */
    public List<TrustedPlayer> getTrustedList() { return trustedList; }
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
    public void readSpawnData(ByteBuf additionalData) { locked = additionalData.readBoolean(); }

    /**
     * <p>This method is called on the server side when a connected client is loading the entity. Data written
     * to the ByteBuffer will be synced with the client and available to the client through the readSpawnData method.</p>
     * <br></br><p>"this is basically NBT for entity spawn, to keep data between client and server in sync because some data is not automatically shared."</p>
     * @param buffer The packet data stream
     */
    @Override
    public void writeSpawnData(ByteBuf buffer) { buffer.writeBoolean(locked); }


    public Map<Integer, String> getTextureDescriptionMap() { return textureDescriptionMap; }

    public World getWorld() { return worldObj; }
}
