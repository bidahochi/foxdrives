package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelToyotaPickup1992;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityToyotaPickup1992 extends EntityCarChest
{
    public EntityToyotaPickup1992(World world) {
        super(world);
        textureDescriptionMap.put(0, "JC's Truck");
        textureDescriptionMap.put(1, "Factory White");
        textureDescriptionMap.put(2, "Factory Toned Grey");
        textureDescriptionMap.put(3, "Factory Burgundy");
        textureDescriptionMap.put(4, "Pinstripes");
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelToyotaPickup1992();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/toyota/JC1992BoiodaPickup", "textures/toyota/toyota_pickup_1992_blank", "textures/toyota/toyota_pickup_1992_grey"
                , "textures/toyota/toyota_pickup_1992_red", "textures/toyota/toyota_pickup_1992_white2"};
    }

    @Override
    public CarType type(){
        return CarType.TOYOTA_PICKUP_1992;
    }

}
