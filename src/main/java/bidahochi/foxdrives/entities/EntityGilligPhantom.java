package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.models.ModelGilligPhantom;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityGilligPhantom extends EntityCar
{

    public EntityGilligPhantom(World p_i1685_1_) {
        super(p_i1685_1_);
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelGilligPhantom();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/gillig/GILLIG_BUSSIN_generic"};
    }

    @Override
    public CarType type(){
        return CarType.GILLIG_PHANTOM;
    }

}
