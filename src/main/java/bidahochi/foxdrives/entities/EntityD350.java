package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelD250;
import bidahochi.foxdrives.models.ModelD350;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityD350 extends EntityCarChest
{

    public EntityD350(World world) {
        super(world);
        textureDescriptionMap.put(0, "Metalic Blue/Black");
        textureDescriptionMap.put(1, "Red/Gray");
        textureDescriptionMap.put(2, "White/Black");
        textureDescriptionMap.put(3, "White/Black (Branded, Loaded)");
        textureDescriptionMap.put(4, "White/Black (Branded, Unloaded)");
        textureDescriptionMap.put(5, "White/Red");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelD350();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/Colt_D350/F350 bluegreen-black", "textures/Colt_D350/F350 red-gray", "textures/Colt_D350/F350 white-black", "textures/Colt_D350/F350 white-black-loaded", "textures/Colt_D350/F350 white-black-unloaded", "textures/Colt_D350/F350 white-red"};
    }

    @Override
    public CarType type(){
        return CarType.D350;
    }

}
