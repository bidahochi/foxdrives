package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.util.HitchState;
import bidahochi.foxdrives.entities.util.HitchType;
import bidahochi.foxdrives.util.Packet.PacketSyncHitch;
import cpw.mods.fml.common.network.NetworkRegistry;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

import static bidahochi.foxdrives.util.FoxDrivesConstants.*;

public abstract class AbstractTowingParent extends EntityCarChest implements ITowingParent {

    private ITowingChild towedVehicle = null;

    private double DETECTION_RANGE = 2D;

    private int detectionCooldown = 0;

    public HitchState hitchState = HitchState.IDLE;

    public AbstractTowingParent(World world) {
        super(world);
        /*hitch = new EntityReceiver(world, this);
        hitch.setPosition(posX, posY, posZ);
        hitch.getDataWatcher().updateObject(17, getEntityId());
        worldObj.spawnEntityInWorld(hitch);*/
    }

    @Override
    public void entityInit() {
        super.entityInit();
        dataWatcher.addObject(DW_HITCHSTATE, HitchState.IDLE.ordinal());
        dataWatcher.addObject(DW_CHILD, "");
    }

    @Override
    public ITowingChild childVehicle() { return towedVehicle; }

    @Override
    public Vec3f getReceiverPosition() { return null; }

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
        if (!worldObj.isRemote) {
            if(key == 6) {
                System.out.println("toggle hitching");
                if (hitchState == HitchState.COUPLED) {
                    ((EntityPlayer) worldObj.getEntityByID(player)).addChatComponentMessage(new ChatComponentText("Already hitched!"));
                }
                if (hitchState == HitchState.SEARCHING) {
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
        if (!this.worldObj.isRemote) {
            if (this.hitchState == HitchState.SEARCHING && this.childVehicle() == null && detectionCooldown-- <= 0) { // only check four times a second instead of every tick.
                System.out.println("Searching!!!");
                detectionCooldown = 5;
                AbstractTowingChild nearbyChild = findNearbyChild();
                if (nearbyChild != null) {
                    onChildDetected(nearbyChild);
                }
            }
        }

        if (addedToChunk && this.childVehicle() == null && !this.dataWatcher.getWatchableObjectString(DW_CHILD).isEmpty()) {
            System.out.println("Searching for child");
            String childUUID = this.dataWatcher.getWatchableObjectString(DW_CHILD);
            if (!childUUID.isEmpty()) {
                reattachChild(UUID.fromString(childUUID));
            }
        }
    }

    private void reattachChild(UUID targetUUID) {
        List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(15, 15, 15));
        if (list == null || list.isEmpty()) return;
        for (Object entity : list) {
            if (!(entity instanceof ITowingChild)) continue;

            Entity towingEntity = ((ITowingChild) entity).getEntity();
            if (towingEntity.getUniqueID() != null && towingEntity.getUniqueID().equals(targetUUID)) {
                this.setChildVehicle((ITowingChild) entity);
                ((AbstractTowingChild) entity).setParentVehicle(this);

                if (!this.worldObj.isRemote) {
                    this.dataWatcher.updateObject(DW_CHILD, targetUUID.toString());
                }
                return;
            }
        }
    }

    public AbstractTowingChild findNearbyChild() {
        AxisAlignedBB searchBox = this.boundingBox.expand(DETECTION_RANGE, DETECTION_RANGE / 2, DETECTION_RANGE);
        List<?> entities = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, searchBox);
        if (entities.isEmpty()) {
            return null;
        }
        AbstractTowingChild closest = null;
        double closestDist = Double.MAX_VALUE;

        for (Object obj : entities) {
            if (!(obj instanceof AbstractTowingChild)) { continue; }

            AbstractTowingChild child = (AbstractTowingChild) obj;

            //if the trailer is already attached to a receiver
            if (child.getParentVehicle() != null) { continue; }

            //if the trailers receiver doesn't match the hitch type of the vehicle
            if (child.getReceiverType() != this.getHitchType() && this.getHitchType() != HitchType.BOTH && child.getReceiverType() != HitchType.BOTH) { continue; }

            double dist = this.getDistanceSqToEntity(child);

            if (dist < closestDist) {
                closestDist = dist;
                closest = child;
            }
        }

        return closest;
    }

    private void onChildDetected(AbstractTowingChild child) {
        System.out.println("Child detected, coupling");
        this.hitchState = HitchState.COUPLED;
        this.setChildVehicle(child);
        child.setParentVehicle(this);
        syncHitchState();
        dataWatcher.updateObject(DW_CHILD, childVehicle().getEntity().getUniqueID().toString());
        child.getDataWatcher().updateObject(DW_PARENT, this.getUniqueID().toString());
        //worldObj.playSoundAtEntity(this, "hitchingNoise", 1, 1);
    }

    private void decouple() {
        if (towedVehicle != null) {
            ((AbstractTowingChild) towedVehicle).setParentVehicle(null);
        }
        this.setChildVehicle(null);
        hitchState = HitchState.IDLE;
        syncHitchState();
    }

    private void syncHitchState() {
        dataWatcher.updateObject(DW_HITCHSTATE, hitchState.ordinal());
        if (!worldObj.isRemote) {
            FoxDrives.hitchSyncChannel.sendToAllAround(new PacketSyncHitch(getEntityId(), hitchState, childVehicle().getEntityId()),
                    new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 64));
        }
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        dataWatcher.updateObject(DW_CHILD, compound.getString("childID"));
    }


    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setString("childID", dataWatcher.getWatchableObjectString(DW_CHILD));
    }
}
