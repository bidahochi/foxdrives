package bidahochi.foxdrives.entities.BaseEntityVehicle;

import fdfexcraft.tmt_slim.Vec3f;

public interface ITowingChild {

    ITowingParent getParentVehicle();

    Vec3f getMountingOffset();

    int getEntityId();
}
