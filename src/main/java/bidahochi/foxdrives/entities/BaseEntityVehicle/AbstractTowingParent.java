package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.EntityHitch;
import bidahochi.foxdrives.entities.EntitySeat;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public abstract class AbstractTowingParent extends EntityCar implements ITowingParent {

    private ITowingChild child = null;
    private EntityHitch hitch = null;

    public AbstractTowingParent(World world) {
        super(world);
        hitch = new EntityHitch(world, this);
        hitch.setPosition(posX, posY, posZ);
        hitch.getDataWatcher().updateObject(17, getEntityId());
        worldObj.spawnEntityInWorld(hitch);
    }

    @Override
    public ITowingChild childVehicle() { return child; }

    @Override
    public Vec3f getHitchPosition() { return null; }

    @Override
    public EntityHitch getHitch() { return hitch; }

    @Override
    public Entity getEntity() { return this; }

    @Override
    public void setHitch(EntityHitch hitch) { this.hitch = hitch; }

    @Override
    public ModelBase getModel() { return null; }

    @Override
    public String[] getSkins() { return new String[0]; }

    @Override
    public CarType type() { return null; }
}
