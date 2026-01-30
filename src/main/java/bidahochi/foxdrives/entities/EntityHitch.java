package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.entities.BaseEntityVehicle.ITowingChild;
import bidahochi.foxdrives.entities.BaseEntityVehicle.ITowingParent;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import fdfexcraft.tmt_slim.Vec3f;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityHitch extends Entity implements IEntityAdditionalSpawnData {

    private ITowingParent parentEntity;
    private ITowingChild childEntity = null;
    private int parentID = 0;
    private int childID = 0;

    public EntityHitch(World world, ITowingParent parent) {
        super(world);
        parentEntity = parent;
        this.setSize(0.1f,0.1f);

    }

    @Override
    protected void entityInit() {
        dataWatcher.addObject(17, parentID);
        dataWatcher.addObject(18, childID);
    }

    @Override
    public void onUpdate(){
        if(parentEntity == null){
            Entity ent = worldObj.getEntityByID(parentID);
            if(ent == null || ent instanceof ITowingParent == false) return;
            parentEntity = (ITowingParent) ent;
            if(parentEntity.getHitch() != this) parentEntity.setHitch(this);
        }
        if(parentEntity == null || parentEntity.getEntity().isDead){
            setDead();
            return;
        }
        Vec3f hitchPos = parentEntity.getHitchPosition();
        hitchPos.yCoord += 1f;
        float cos = MathHelper.cos((float)(parentEntity.getEntity().rotationYaw * Math.PI / 180.0f));
        float sin = MathHelper.sin((float)(parentEntity.getEntity().rotationYaw * Math.PI / 180.0f));
        setPosition(
                parentEntity.getEntity().posX + (hitchPos.xCoord * cos - hitchPos.zCoord * sin),
                parentEntity.getEntity().posY + hitchPos.yCoord,
                parentEntity.getEntity().posZ + (hitchPos.xCoord * sin + hitchPos.zCoord * cos)
        );
        setRotation(parentEntity.getEntity().rotationPitch, parentEntity.getEntity().rotationYaw);
        lastTickPosX = prevPosX = parentEntity.getEntity().prevPosX + (hitchPos.xCoord * cos - hitchPos.zCoord * sin);
        lastTickPosY = prevPosY = parentEntity.getEntity().prevPosY + hitchPos.yCoord;
        lastTickPosZ = prevPosZ = parentEntity.getEntity().prevPosZ + (hitchPos.xCoord * sin + hitchPos.zCoord * cos);
        prevRotationYaw = parentEntity.getEntity().prevRotationYaw;
        prevRotationPitch = parentEntity.getEntity().prevRotationPitch;
        if(!worldObj.isRemote){
            if(riddenByEntity == null || posY < -64) setDead();
        }
    }

    //We use the default riding system to link the 'hitch' the two entities.
    @Override
    public void updateRiderPosition(){
        if(riddenByEntity == null || parentEntity == null) return;
        riddenByEntity.setPosition(posX, posY, posZ);
        riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPosX;
        riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPosY;
        riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPosZ;
    }


    @Override
    public void writeSpawnData(ByteBuf buffer){
        buffer.writeInt(parentEntity == null ? 0 : parentEntity.getEntityId());
        buffer.writeInt(childEntity == null ? 0 : childEntity.getEntityId());
    }

    @Override
    public void readSpawnData(ByteBuf buffer){
        parentID = buffer.readInt();
        childID = buffer.readInt();
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound tag) {
        parentID = tag.getInteger("parentID");
        childID = tag.getInteger("childID");
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound tag) {
        tag.setInteger("parentID", parentID);
        tag.setInteger("childID", childID);
    }


    @Override
    public boolean shouldRenderInPass(int pass)
    {
        return pass == 1;
    }
}
