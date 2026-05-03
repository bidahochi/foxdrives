package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.entities.util.HitchType;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;

import java.util.UUID;

public interface ITowingChild {

    ITowingParent getParentVehicle();

    Vec3f getHitchOffset();

    int getEntityId();

    Entity getEntity();

    default HitchType getReceiverType() { return HitchType.BOTH; }
}
