package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.entities.util.HitchType;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.entity.Entity;

/** @author broscolotos */
public interface ITowingChild {

    /**
     * @return the vehicle towing this.
     */
    ITowingParent getParentVehicle();

    /**
     * dont use this to set the offset of the receiver, instead set AbstractTowingChild.receiverPos
     * in the constructor of your entity.
     * @return a Vec3f storing the offset for the receiver of the trailer.
     */
    Vec3f getReceiverOffset();

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
    default HitchType getReceiverType() { return HitchType.ALL; }

    /**
     * @return the persistent linking ID for this entity.
     */
    int getLinkingID();
}
