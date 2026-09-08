package bidahochi.foxdrives.entities.ColtD250;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelD250;
import bidahochi.foxdrives.models.ModelD250_Utility;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityD250_Utility extends EntityCarChest
{

    public EntityD250_Utility(World world) {
        super(world);
        textureDescriptionMap.put(0, "White");
        textureDescriptionMap.put(1, "Garage Door Service");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelD250_Utility();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/Colt_D250_utility/f250 White (Door) (Low trim) - service truck", "textures/Colt_D250_utility/f250 White (Low trim) - service truck"};
    }

    @Override
    public CarType type(){
        return CarType.D250;
    }

}
