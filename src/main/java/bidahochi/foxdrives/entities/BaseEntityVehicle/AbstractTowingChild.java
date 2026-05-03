package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.TrailerType;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

import java.util.List;
import java.util.UUID;

import static bidahochi.foxdrives.util.FoxDrivesConstants.*;

public class AbstractTowingChild extends EntityTrailer implements ITowingChild {

    private UUID parentVehicleUUID = null;

    private ITowingParent parentVehicle;

    public AbstractTowingChild(World world) { super(world); }

    @Override
    public ModelBase getModel() { return null; }

    @Override
    public String[] getSkins() { return new String[0]; }

    @Override
    public TrailerType type() { return null; }

    @Override
    public ITowingParent getParentVehicle() { return this.parentVehicle; }

    @Override
    public Vec3f getHitchOffset() { return null; }

    public void setParentVehicle(ITowingParent parent) {
        this.parentVehicle = parent;
        this.parentVehicleUUID = parent.getEntity().getUniqueID();
        this.dataWatcher.updateObject(DW_PARENT, parent.getEntity().getUniqueID().toString());
        System.out.println("Setting parent UUID in DW: " + parentVehicleUUID);
    }

    @Override
    public Entity getEntity() { return this; }

    @Override
    public void entityInit() {
        super.entityInit();
    }

    @Override
    public void onUpdate() {
        ITowingParent parent = resolveParentVehicle();
        if (parent == null) {
            super.onUpdate();
            return;
        }
        double savedPrevX = posX;
        double savedPrevY = posY;
        double savedPrevZ = posZ;
        float savedPrevYaw = rotationYaw;

        float parentYaw = parent.getEntity().rotationYaw;
        double pRad = Math.toRadians(parentYaw);
        double pSin = Math.sin(pRad);
        double pCos = Math.cos(pRad);

        double pPosX = worldObj.isRemote ? parent.getEntity().lastTickPosX + (parent.getEntity().posX - parent.getEntity().lastTickPosX) : parent.getEntity().posX;
        double pPosY = worldObj.isRemote ? parent.getEntity().lastTickPosY + (parent.getEntity().posY - parent.getEntity().lastTickPosY) : parent.getEntity().posY;
        double pPosZ = worldObj.isRemote ? parent.getEntity().lastTickPosZ + (parent.getEntity().posZ - parent.getEntity().lastTickPosZ) : parent.getEntity().posZ;

        Vec3f receiverPos = ((AbstractTowingParent)parent.getEntity()).getReceiverPosition();
        double receiverX = pPosX + (pCos * receiverPos.xCoord - pSin * receiverPos.zCoord);
        double receiverY = pPosY + receiverPos.yCoord;
        double receiverZ = pPosZ + (pSin * receiverPos.xCoord + pCos * receiverPos.zCoord);

        //get the yaw of the trailer from geometry rather than anything stored internally to ensure its correct.
        double dx = receiverX - posX;
        double dz = receiverZ - posZ;
        float childYaw;
        if (Math.abs(dx) < 0.001 && Math.abs(dz) < 0.001) {
            childYaw = parentYaw;
        } else {
            childYaw = (float) Math.toDegrees(Math.atan2(-dx, dz));
        }

        double cRad = Math.toRadians(childYaw);
        double cSin = Math.sin(cRad);
        double cCos = Math.cos(cRad);

        double childX = receiverX - (cCos * this.getHitchOffset().xCoord - cSin * this.getHitchOffset().zCoord);
        double childY = receiverY - this.getHitchOffset().yCoord;
        double childZ = receiverZ - (cSin * this.getHitchOffset().xCoord + cCos * this.getHitchOffset().zCoord);

        setLocationAndAngles(childX, childY, childZ, childYaw, 0);
        prevPosX = savedPrevX;
        prevPosY = savedPrevY;
        prevPosZ = savedPrevZ;
        prevRotationYaw = savedPrevYaw;
        motionX = 0;
        motionY = 0;
        motionZ = 0;

        if (this.getRollingDirection() > 0) {
            this.setRollingDirection(this.getRollingDirection() - 1);
        }
        if (this.getDamage() > 0.0F) {
            this.setDamage(this.getDamage() - 1.0F);
        }
        if (posY < -64) {
            this.kill();
        }

        this.ticksExisted++;
        if (!worldObj.isRemote) {
            dataWatcher.updateObject(DW_VEHICLEDATAJSON, vehicleDataJSON());
        }
        if (addedToChunk && ((this.getParentVehicle() == null && !this.dataWatcher.getWatchableObjectString(DW_PARENT).isEmpty()))) {
            System.out.println("Searching for parent");
            List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(15, 15, 15));
            if (list != null && !list.isEmpty()) {
                for (Object entity : list) {
                    if (entity instanceof ITowingParent) {
                        if (((ITowingParent)entity).getEntity().getUniqueID() != null && ((ITowingParent)entity).getEntity().getUniqueID()
                                .equals(UUID.fromString(this.dataWatcher.getWatchableObjectString(DW_PARENT)))) {
                            this.setParentVehicle(((ITowingParent)entity));
                            ((AbstractTowingParent)entity).setChildVehicle(this);
                        }
                    }
                }
            }
        }
    }

    public ITowingParent resolveParentVehicle() {
        if (!worldObj.isRemote) {
            //SERVER
            if (parentVehicleUUID == null) return null;

            if (parentVehicle != null && !parentVehicle.getEntity().isDead
            && parentVehicle.getEntity().getUniqueID().equals(parentVehicleUUID)) {
                return parentVehicle;
            }
            parentVehicle = null;
            for (Object obj : worldObj.loadedEntityList) {
                Entity e = (Entity) obj;
                if (!(e instanceof ITowingParent)) continue;
                if (!e.isDead && ((ITowingParent)e).getEntity().getUniqueID().equals(parentVehicleUUID)) {
                    parentVehicle = (ITowingParent) e;
                    break;
                }
            }
            return parentVehicle;
        } else {
            //CLIENT
            if (dataWatcher.getWatchableObjectString(DW_PARENT).isEmpty()) { return null; }
            parentVehicleUUID = UUID.fromString(dataWatcher.getWatchableObjectString(DW_PARENT));
            UUID parentId = UUID.fromString(dataWatcher.getWatchableObjectString(DW_PARENT));
            if (parentId.toString().isEmpty()) return null;
            if (parentVehicle != null && !parentVehicle.getEntity().isDead
            && ((AbstractTowingParent)parentVehicle.getEntity()).getEntity().getUniqueID().equals(parentVehicleUUID)) {
                return parentVehicle;
            }

            for (Object obj : worldObj.loadedEntityList) {
                Entity e = (Entity) obj;
                if (!(e instanceof ITowingParent)) continue;
                if (((ITowingParent)e).getEntity().getUniqueID() == null) {
                    System.out.println("linkingID null for some reason");
                    continue;
                }
                if (!e.isDead && ((ITowingParent)e).getEntity().getUniqueID().equals(parentVehicleUUID)) {
                    parentVehicle = (ITowingParent) e;
                    break;
                }
            }
            return parentVehicle;
        }

    }

    @Override
    public void applyEntityCollision(Entity entity){
        if(this.getParentVehicle() != null && this.getParentVehicle() == entity) return;
        super.applyEntityCollision(entity);
    }
}
