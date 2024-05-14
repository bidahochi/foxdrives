package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.models.ToyotaPickup1992;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;

public class EntityToyotaPickup1992 extends EntityCarChest {

    public EntityToyotaPickup1992(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityToyotaPickup1992(World p_i1685_1_) {
        super(p_i1685_1_);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ToyotaPickup1992();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/toyota/JC1992BoiodaPickup"};
    }

    /**
     * Returns the movement speed in blocks per tick. entity horse uses 0.1f
     */
    @Override
    public float getMoveSpeed() {
        return 45f;
    }//45

    /**
     * Returns the acceleration speed in meters per second.
     * NOTE: this method is a placeholder and is not yet implemented.
     */
    @Override
    public float getAccelSpeed() {
        return 1;
    }

    @Override
    public CarType type(){
        return CarType.TOYOTA_PICKUP_1992;
    }

}
