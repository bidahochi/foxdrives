package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelDoseiKiote_Sedan;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityDoseiKiote_Sedan extends EntityCarChest
{
    public EntityDoseiKiote_Sedan(World world) {
        super(world);
        textureDescriptionMap.put(0, "Factory Silver W/ Blue Interior");
        textureDescriptionMap.put(1, "Factory Desert W/ Tan Interior");
        textureDescriptionMap.put(2, "");
        textureDescriptionMap.put(3, "");
        textureDescriptionMap.put(4, "");
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelDoseiKiote_Sedan();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/dosei/dosei_kiote_sedan_turbo_silverwhite", "textures/dosei/dosei_kiote_sedan_turbo_deserttan"};
    }

    @Override
    public CarType type(){
        return CarType.DOSEI_KIOTE_SEDAN;
    }

}
