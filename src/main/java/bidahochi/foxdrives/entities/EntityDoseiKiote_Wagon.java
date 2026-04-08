package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelDoseiKiote_Sedan;
import bidahochi.foxdrives.models.ModelDoseiKiote_Wagon;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityDoseiKiote_Wagon extends EntityCarChest
{
    public EntityDoseiKiote_Wagon(World world) {
        super(world);
        textureDescriptionMap.put(0, "Factory White-Silver");
        textureDescriptionMap.put(1, "Factory Cherrub Red");
        textureDescriptionMap.put(2, "Factory Coral Teal");
        textureDescriptionMap.put(3, "Factory Deep Blue");
        textureDescriptionMap.put(4, "Factory Chocolate Brown");
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelDoseiKiote_Wagon();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/dosei/dosei_kiote_wagon_turbo_silverwhite2_roofrack", "textures/dosei/dosei_kiote_wagon_turbo_red",
                "textures/dosei/dosei_kiote_wagon_turbo_gron", "textures/dosei/dosei_kiote_wagon_turbo_bluu", "textures/dosei/dosei_kiote_wagon_turbo_chocolate"};
    }

    @Override
    public CarType type(){
        return CarType.DOSEI_KIOTE_WAGON;
    }

}
