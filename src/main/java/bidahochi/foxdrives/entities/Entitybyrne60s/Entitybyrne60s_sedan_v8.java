package bidahochi.foxdrives.entities.Entitybyrne60s;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.Modelbyrne60s_sedan;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class Entitybyrne60s_sedan_v8 extends EntityCarChest
{
    public Entitybyrne60s_sedan_v8(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Roadsport Green Top");
        textureDescriptionMap.put(1, "Cubed's Car");
        textureDescriptionMap.put(2, "Police Trim");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new Modelbyrne60s_sedan();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/byrne/byrne_sedan_roadsport_blank", "textures/byrne/byrne_sedan_roadsport_cubedcar", "textures/byrne/byrne_sedan_detectivespecial_blank"};
    }

    @Override
    public CarType type(){
        return CarType.BYRNE60S_SEDAN_V8;
    }

}
