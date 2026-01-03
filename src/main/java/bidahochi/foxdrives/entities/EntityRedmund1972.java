package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelRedmund1972;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityRedmund1972 extends EntityCarChest
{

    public EntityRedmund1972(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Factory Blank");
        textureDescriptionMap.put(1, "Factory Chocolate Brown");
        textureDescriptionMap.put(2, "Factory Arbor Red");
        textureDescriptionMap.put(3, "Factory Yellow-White");
        textureDescriptionMap.put(4, "Factory Blue-White");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelRedmund1972();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/redmund/redmund_1972_blank", "textures/redmund/redmund_1972_brown", "textures/redmund/redmund_1972_red",
                "textures/redmund/redmund_1972_yellow_white", "textures/redmund/redmund_1972_blue_white"};
    }

    @Override
    public CarType type(){
        return CarType.REDMUND_1972;
    }

}
