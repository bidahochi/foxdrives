package bidahochi.foxdrives.entities.Entitybyrne40s;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.Modelbyrne40s_sedan;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class Entitybyrne40s_sedan extends EntityCarChest
{
    public Entitybyrne40s_sedan(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "1948 Base Trim");
        textureDescriptionMap.put(1, "1950 Base Trim");
        textureDescriptionMap.put(2, "Taxicab A");
        textureDescriptionMap.put(3, "Minty Two-Tone");
        textureDescriptionMap.put(4, "Tan");
        textureDescriptionMap.put(5, "Evergreen");
        textureDescriptionMap.put(6, "Cherry Red");
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
        return new String[]{"textures/byrne/byrne_sedan_4852_1948_baseblank", "textures/byrne/byrne_sedan_4852_1950_baseblank", "textures/byrne/byrne_sedan_4852_1948_taxicab", "textures/byrne/byrne_sedan_4852_1950_minty_twotone", "textures/byrne/byrne_sedan_4852_1950_tan", "textures/byrne/byrne_sedan_4852_48_evergreen", "textures/byrne/byrne_sedan_4852_48cherryred"};
    }

    @Override
    public CarType type(){
        return CarType.BYRNE40S_SEDAN;
    }

}
