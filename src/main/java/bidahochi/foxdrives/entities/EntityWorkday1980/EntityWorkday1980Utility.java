package bidahochi.foxdrives.entities.EntityWorkday1980;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelWorkday_1980_Utility;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityWorkday1980Utility extends EntityCarChest
{
    public EntityWorkday1980Utility(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Factory Blank");
        textureDescriptionMap.put(1, "CSXT");
        textureDescriptionMap.put(2, "GLC");
        textureDescriptionMap.put(3, "Magnolia Acres Mfg.");
        textureDescriptionMap.put(4, "Red Contractor");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelWorkday_1980_Utility();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/workday/workday_1980_utility_blank", "textures/workday/workday_1980_utility_CSX", "textures/workday/workday_1980_Utility_GLC",
        "textures/workday/workday_1980_utility_magnol","textures/workday/workday_1980_utility_reddy"};
    }

    @Override
    public CarType type(){
        return CarType.WORKDAY_1980_Utility;
    }

}
