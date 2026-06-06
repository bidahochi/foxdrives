package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.entities.util.HitchType;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;

import java.util.HashMap;

/**
 * @author broscolotos
 * */
public interface ITowingParent {

    /**
     * @return the entity being towed.
     */
    ITowingChild childVehicle();

    /**
     * use getHitchOffsets to set the offsets on your vehicle's hitch(es).
     * If your vehicle accepts HitchType.ALL, instead specify the location
     * of each individual type. ie, .add(HitchType.BALL, new Vec3f(x, y, z)
     * .add(HitchType.FIFTH_WHEEL, new Vec3f(x, y, z).
     * @return a map of hitch offsets depending on type.
     */
    HashMap<HitchType, Vec3f> getHitchOffsets();

    /**
     * Used to obtain the entity from the world.
     * @return the non-persistent ID of this entity.
     */
    int getEntityId();

    /**
     * @return this
     */
    Entity getEntity();

    /**
     * @return the HitchType this entity accepts.
     */
    default HitchType getHitchType() { return HitchType.ALL; }

    /**
     * @return the persistent linking ID for the coupled entity.
     */
    int getLinkedChildID();

    /**
     * @return the persistent linking ID for this entity.
     */
    int getLinkingID();

    /**
     * How far the parent will search around itself
     * to find a child. This is done:
     * a) when you are manually attaching a trailer
     * b) when you reload the world.
     * */
    default double getDetectionRange() { return 3.0D; }
}
