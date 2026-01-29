package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.models.ModelID6400daycab;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;

public class EntityID6400daycab extends EntityCar
{

    public EntityID6400daycab(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Stock Configuration");
        textureDescriptionMap.put(1, "Facelift Stock Configuration");
        textureDescriptionMap.put(2, "Generic White");
        textureDescriptionMap.put(3, "Generic Orange");
        textureDescriptionMap.put(4, "Generic Green");
        textureDescriptionMap.put(5, "Generic Red");
        textureDescriptionMap.put(6, "Magnolia Acres MFG.");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelID6400daycab();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/id/ID6400_blank", "textures/id/ID6400_facelift_blank", "textures/id/ID6400_blank2", "textures/id/ID6400_generic_whiteorange"
                , "textures/id/ID6400_facelift_greeny", "textures/id/ID6400_facelift_reddyo", "textures/id/ID6400_magnolia_acres1"};
    }

    @Override
    public CarType type(){
        return CarType.ID6400daycab;
    }

}
