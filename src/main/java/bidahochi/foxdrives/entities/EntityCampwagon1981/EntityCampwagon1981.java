package bidahochi.foxdrives.entities.EntityCampwagon1981;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelCampwagon_1981;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityCampwagon1981 extends EntityCarChest
{

    public EntityCampwagon1981(World world) {
        super(world);
        textureDescriptionMap.put(0, "Base Trim");
        textureDescriptionMap.put(1, "Premium Trim (Generic Orange)");
        textureDescriptionMap.put(2, "Fleet Trim (Cargo Variant)");
        textureDescriptionMap.put(3, "Colonel-Western Delivery Scheme");
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
        return new String[]{"textures/campwagon/campwagon_1981_cw10b", "textures/campwagon/campwagon_1981_cw10c_generic1", "textures/campwagon/campwagon_1981_cw10d_cargo", "textures/campwagon/campwagon_1981_cw10d_CWTL"};
    }

    @Override
    public CarType type(){
        return CarType.CAMPWAGON_1981;
    }

}
