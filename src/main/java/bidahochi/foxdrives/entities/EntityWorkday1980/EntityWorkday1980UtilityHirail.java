package bidahochi.foxdrives.entities.EntityWorkday1980;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelWorkday_1980_Utility_Hirail;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityWorkday1980UtilityHirail extends EntityCarChest
{
    public EntityWorkday1980UtilityHirail(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Blandsville Track Department");
        textureDescriptionMap.put(1, "CSXT");
        textureDescriptionMap.put(2, "FNCC MW");
        textureDescriptionMap.put(3, "NEP MW");
        textureDescriptionMap.put(4, "GLC");
        textureDescriptionMap.put(5, "CRIP");
        textureDescriptionMap.put(6, "GCM");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelWorkday_1980_Utility_Hirail();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/workday/workday_1980_utility_blank_hirail_noshit", "textures/workday/workday_1980_utility_hirail_CSX",
                "textures/workday/workday_1980_utility_hirail_fncc", "textures/workday/workday_1980_utility_hyrail_wpnep_mw",
                "textures/workday/workday_1980_Utility_hyrail_GLC", "textures/workday/workday_1980_utility_hyrail_CRIP",
                "textures/workday/workday_1980_utility_hyrail_GCM"};
    }

    @Override
    public CarType type(){
        return CarType.WORKDAY_1980_Utility_Hirail;
    }

}
