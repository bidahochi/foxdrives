package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelCruisegoer;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityCruisegoer extends EntityCarChest
{

    public EntityCruisegoer(World world) {
        super(world);
        textureDescriptionMap.put(0, "Factory White");
        textureDescriptionMap.put(1, "Ordinary Life");
        textureDescriptionMap.put(2, "Factory Verdigris");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelCruisegoer();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/cruisegoer/jmc_cruisegoer_white", "textures/cruisegoer/jmc_cruisegoer_cyan", "textures/cruisegoer/jmc_cruisegoer_lime"};
    }

    @Override
    public CarType type(){
        return CarType.CRUISEGOER;
    }

}
