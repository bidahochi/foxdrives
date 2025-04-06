package bidahochi.foxdrives.entities.EntityCampwagon1981;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelCampwagon_1981;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityCampwagon1981_v8 extends EntityCarChest
{

    public EntityCampwagon1981_v8(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityCampwagon1981_v8(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Base Trim");
        textureDescriptionMap.put(1, "Premium Trim (Generic Blue)");
        textureDescriptionMap.put(2, "Fleet Trim (Public Service W/ Plow)");
        textureDescriptionMap.put(3, "Fleet Trim (Generic Police Service)");
        textureDescriptionMap.put(4, "Exploration Trim (Factory Stock Paint)");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelCampwagon_1981();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/campwagon/campwagon_1981_cw15b_generic1", "textures/campwagon/campwagon_1981_cw15c_blue"
                , "textures/campwagon/campwagon_1981_cw15d_snow", "textures/campwagon/campwagon_1981_cw15d_popo", "textures/campwagon/campwagon_1981_cw15e_factory"};
    }

    @Override
    public CarType type(){
        return CarType.CAMPWAGON_1981_V8;
    }

}
