package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.entities.util.HitchType;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;

import java.util.UUID;

public interface ITowingParent {


    ITowingChild childVehicle();

    Vec3f getReceiverPosition();

    int getEntityId();

    //EntityReceiver getReceiver();

    //void setReceiver(EntityReceiver hitch);

    Entity getEntity();

    default HitchType getHitchType() { return HitchType.BOTH; }
}
