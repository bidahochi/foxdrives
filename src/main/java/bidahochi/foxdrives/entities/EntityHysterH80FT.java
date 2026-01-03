package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.models.ModelHysterH80FT;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityHysterH80FT extends EntityCar
{

    public EntityHysterH80FT(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Yellow");
        textureDescriptionMap.put(1, "Blue");
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelHysterH80FT();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/hyster_h80ft", "textures/hyster_h80ft2"};
    }

    @Override
    public CarType type(){
        return CarType.HYSTER_H80FT;
    }

}
