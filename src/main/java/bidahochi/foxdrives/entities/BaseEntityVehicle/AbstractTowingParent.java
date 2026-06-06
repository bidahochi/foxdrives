package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.util.HitchState;
import bidahochi.foxdrives.entities.util.HitchType;
import bidahochi.foxdrives.util.Packet.PacketDecoupleHitch;
import bidahochi.foxdrives.util.Packet.PacketSyncHitch;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.List;

import static bidahochi.foxdrives.util.FoxDrivesConstants.*;

public abstract class AbstractTowingParent extends EntityCarChest implements ITowingParent {

    public HashMap<HitchType, Vec3f> hitchPos = new HashMap<HitchType, Vec3f>();

    private ITowingChild towedVehicle = null;

    private int detectionCooldown = 0;

    private static int parentUniqueIDs = -1;

    public HitchState hitchState = HitchState.IDLE;

    public AbstractTowingParent(World world) {
        super(world);
    }

    @Override
    public void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(DW_HITCHSTATE, HitchState.IDLE.ordinal());
        this.dataWatcher.addObject(DW_CHILD, -1);
        this.dataWatcher.addObject(DW_UNIQUEID, -1);
    }

    public int getLinkedChildID() { return dataWatcher.getWatchableObjectInt(DW_CHILD); }

    public void setLinkedChildID(int childID) { dataWatcher.updateObject(DW_CHILD, childID); }

    public int getLinkingID() { return this.dataWatcher.getWatchableObjectInt(DW_UNIQUEID); }

    @Override
    public ITowingChild childVehicle() { return towedVehicle; }

    @Override
    public HashMap<HitchType, Vec3f> getHitchOffsets() { return hitchPos; }

    @Override
    public Entity getEntity() { return this; }

    @Override
    public ModelBase getModel() { return null; }

    @Override
    public String[] getSkins() { return new String[0]; }

    @Override
    public CarType type() { return null; }

    public void setChildVehicle(ITowingChild child) { this.towedVehicle = child; }

    @Override
    public void networkInteract(int player, int key) {
        if (!this.worldObj.isRemote) {
            if(key == 6) {
                if (hitchState == HitchState.COUPLED) {
                    ((EntityPlayer) worldObj.getEntityByID(player)).addChatComponentMessage(new ChatComponentText("Detatching trailer"));
                    decouple();
                }
                else if (hitchState == HitchState.SEARCHING) {
                    ((EntityPlayer) worldObj.getEntityByID(player)).addChatComponentMessage(new ChatComponentText("Hitching mode disabled"));
                    hitchState = HitchState.IDLE;
                } else {
                    ((EntityPlayer) worldObj.getEntityByID(player)).addChatComponentMessage(new ChatComponentText("Hitching mode enabled"));
                    hitchState = HitchState.SEARCHING;
                }
            }
            else super.networkInteract(player, key);
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (!this.worldObj.isRemote && this.getLinkingID() == -1) {
            if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
                setNewUniqueID(this.getEntityId());
            }
        }

        /**
         * As entities can't be registered in nbttagcompound we instead use this
         * system. When the world loads, only the (int) linkedChildID is known.
         * This method search for the entity with the ID corresponding to linkedChildID.
         * When found, (ITowingChild) towedVehicle will be updated accordingly.
         */
        if (((this.hitchState == HitchState.SEARCHING && this.childVehicle() == null) || (this.towedVehicle == null && this.getLinkedChildID() != -1)) && detectionCooldown-- <= 0) { // only check four times a second instead of every tick.
            detectionCooldown = 5;
            AbstractTowingChild nearbyChild = findNearbyChild();
            if (nearbyChild != null) {
                onChildDetected(nearbyChild);
            }
        }

        if (ticksExisted % 20 == 0 && this.hitchState == HitchState.COUPLED) {
            if (worldObj.getEntityByID(childVehicle().getTransportEntityID()) == null || worldObj.getEntityByID(childVehicle().getTransportEntityID()).isDead) {
                decouple();
            }
        }
    }

    @Override
    public void setDead(){
        if (!worldObj.isRemote) {
            decouple();
        }
        super.setDead();
    }

    public int setNewUniqueID(int id) {
        if (id <= 0)
            id = parentUniqueIDs++;
        else
            parentUniqueIDs = id++;

        this.dataWatcher.updateObject(DW_UNIQUEID, id);
        getEntityData().setInteger("uniqueID", id);

        return id;
    }

    public AbstractTowingChild findNearbyChild() {
        AxisAlignedBB searchBox = this.boundingBox.expand(getDetectionRange(), getDetectionRange() / 2, getDetectionRange());
        List<?> entities = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, searchBox);
        if (entities.isEmpty()) {
            return null;
        }
        AbstractTowingChild closest = null;
        double closestDist = Double.MAX_VALUE;

        for (Object obj : entities) {
            if (!(obj instanceof AbstractTowingChild)) { continue; }

            AbstractTowingChild child = (AbstractTowingChild) obj;

            //if the trailer is supposed to be attached to us already.
            if (child.getLinkedParentID() == this.getLinkingID() && this.getLinkedChildID() == child.getLinkingID()) return child;

            //if the trailer is already attached to a parent
            if (child.getParentVehicle() != null) { continue; }

            //if the trailer's receiver doesn't match the hitch type of this
            if (child.getReceiverType() != this.getHitchType() && this.getHitchType() != HitchType.ALL && child.getReceiverType() != HitchType.ALL) { continue; }

            double dist = this.getDistanceSqToEntity(child);

            if (dist < closestDist) {
                closestDist = dist;
                closest = child;
            }
        }

        return closest;
    }

    private void onChildDetected(AbstractTowingChild child) {
        this.hitchState = HitchState.COUPLED;
        dataWatcher.updateObject(DW_CHILD, child.getLinkingID());
        child.setLinkedParentID(this.getLinkingID());
        this.setChildVehicle(child);
        child.setParentVehicle(this);
        syncHitchState(false);
        //worldObj.playSoundAtEntity(this, "hitchingNoise", 1, 1);
    }

    public void decouple() {
        hitchState = HitchState.IDLE;
        dataWatcher.updateObject(DW_CHILD, -1);
        syncHitchState(true);
        if (childVehicle() != null && childVehicle().getEntity() != null) {
            ((AbstractTowingChild) childVehicle().getEntity()).setLinkedParentID(-1);
            ((AbstractTowingChild) childVehicle().getEntity()).setParentVehicle(null);
        }
        this.setChildVehicle(null);
    }

    private void syncHitchState(boolean decouple)
    {
        dataWatcher.updateObject(DW_HITCHSTATE, hitchState.ordinal());
        if (!this.worldObj.isRemote)
        {
            if (childVehicle() == null)
            {
                return;
            }

            if (decouple)
            {
                FoxDrives.decoupleHitchChannel.sendToAllAround(new PacketDecoupleHitch(getEntityId(), HitchState.IDLE, childVehicle().getTransportEntityID()),
                        new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 64));
            }
            else
            {
                FoxDrives.hitchSyncChannel.sendToAllAround(new PacketSyncHitch(getEntityId(), hitchState, childVehicle().getTransportEntityID()),
                        new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 64));
            }
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.dataWatcher.updateObject(DW_UNIQUEID, compound.getInteger("uniqueID"));
        this.dataWatcher.updateObject(DW_CHILD, compound.getInteger("childID"));
    }


    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("childID", dataWatcher.getWatchableObjectInt(DW_CHILD));
    }
}
