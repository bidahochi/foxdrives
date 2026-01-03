package bidahochi.foxdrives.entities.Entitybyrne40s;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.Modelbyrne40s_sedan;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class Entitybyrne40s_sedan_v8 extends EntityCarChest
{
    public Entitybyrne40s_sedan_v8(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Bayview Blue");
        textureDescriptionMap.put(1, "1948 Police Package");
        textureDescriptionMap.put(2, "1950 Police Package");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new Modelbyrne40s_sedan();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/byrne/byrne_sedan_4852_v8_48bayviewbleu", "textures/byrne/byrne_sedan_4852_v8_1948_v8policespecial", "textures/byrne/byrne_sedan_4852_v8_1950_v8policespecial"};
    }

    @Override
    public CarType type(){
        return CarType.BYRNE40S_SEDAN_V8;
    }

}
