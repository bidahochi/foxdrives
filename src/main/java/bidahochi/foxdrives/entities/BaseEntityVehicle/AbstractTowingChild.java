package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.TrailerType;
import cpw.mods.fml.common.FMLCommonHandler;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import static bidahochi.foxdrives.util.FoxDrivesConstants.*;

public abstract class AbstractTowingChild extends EntityTrailer implements ITowingChild {

    private ITowingParent parentVehicle;

    private static int childUniqueIDs = -1;

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
        this.dataWatcher.updateObject(DW_PARENT, parent != null ? parent.getLinkingID() : -1);
    }

    public int getLinkedParentID() { return dataWatcher.getWatchableObjectInt(DW_PARENT); }

    public void setLinkedParentID(int parentID) { dataWatcher.updateObject(DW_PARENT, parentID); }

    public int getLinkingID() { return this.dataWatcher.getWatchableObjectInt(DW_UNIQUEID); }

    @Override
    public Entity getEntity() { return this; }

    @Override
    public void entityInit() {
        super.entityInit();
    }

    @Override
    public void onUpdate() {
        if (!this.worldObj.isRemote && this.getLinkingID() == -1) {
            if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
                setNewUniqueID(this.getEntityId());
            }
        }

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
    }


    public int setNewUniqueID(int id) {
        if (id <= 0)
            id = childUniqueIDs++;
        else
            childUniqueIDs = id++;
        this.dataWatcher.updateObject(DW_UNIQUEID, id);
        getEntityData().setInteger("uniqueID", id);

        return id;
    }

    public ITowingParent resolveParentVehicle() {
        if (!worldObj.isRemote) {
            //SERVER
            if (parentVehicle != null && !parentVehicle.getEntity().isDead) {
                return parentVehicle;
            }
        } else {
            //CLIENT
            if (parentVehicle != null && !parentVehicle.getEntity().isDead) {
                return parentVehicle;
            }

            for (Object obj : worldObj.loadedEntityList) {
                Entity e = (Entity) obj;
                if (!(e instanceof ITowingParent)) continue;
                if (e.isDead) continue;
                AbstractTowingParent vehicle = (AbstractTowingParent) ((ITowingParent)e).getEntity();
                if (vehicle.childVehicle() != null && vehicle.childVehicle().equals(this)) {
                    parentVehicle = (ITowingParent) e;
                    break;
                }
            }
        }
        return parentVehicle;
    }

    @Override
    public void applyEntityCollision(Entity entity){
        if(this.getParentVehicle() != null && this.getParentVehicle() == entity) return;
        super.applyEntityCollision(entity);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.dataWatcher.updateObject(DW_UNIQUEID, getEntityData().getInteger("uniqueID"));
    }
}
