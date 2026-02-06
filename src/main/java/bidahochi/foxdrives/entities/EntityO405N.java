package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelGilligPhantom;
import bidahochi.foxdrives.models.ModelO405N;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityO405N extends EntityCarChest
{

    public EntityO405N(World world) {
        super(world);
        textureDescriptionMap.put(0, "VGF Frankfurt");
        textureDescriptionMap.put(1, "MVG Munich");
        textureDescriptionMap.put(2, "DVG Duisburg");
        textureDescriptionMap.put(3, "EVAG Essen");
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelO405N();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/O405N/O405N_Orange2", "textures/O405N/O405N_Light_Blue2", "textures/O405N/O405N_Red2", "textures/O405N/O405N_Yellow2"};
    }

    @Override
    public CarType type(){
        return CarType.O405N;
    }

}
