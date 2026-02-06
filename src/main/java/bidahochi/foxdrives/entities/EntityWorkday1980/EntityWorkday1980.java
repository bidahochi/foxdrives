package bidahochi.foxdrives.entities.EntityWorkday1980;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelWorkday_1980;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityWorkday1980 extends EntityCarChest
{

    public EntityWorkday1980(World world) {
        super(world);
        textureDescriptionMap.put(0, "Factory Blank");
        textureDescriptionMap.put(1, "Factory Silver W/ Black Stripe");
        textureDescriptionMap.put(2, "Factory Moss Green");
        textureDescriptionMap.put(3, "Bida's Truc");
        textureDescriptionMap.put(4, "Factory Mustard Yellow");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelWorkday_1980();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/workday/workday_1980_blank", "textures/workday/workday_1980_greyblack", "textures/workday/workday_1980_moss",
                "textures/workday/workday_1980_bida", "textures/workday/workday_1980_mustard"};
    }

    @Override
    public CarType type(){
        return CarType.WORKDAY_1980;
    }

}
