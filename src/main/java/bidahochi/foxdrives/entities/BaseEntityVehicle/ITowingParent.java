package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.entities.EntityHitch;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;

public interface ITowingParent {

    ITowingChild childVehicle();

    Vec3f getHitchPosition();

    int getEntityId();

    EntityHitch getHitch();

    void setHitch(EntityHitch hitch);

    Entity getEntity();
}
