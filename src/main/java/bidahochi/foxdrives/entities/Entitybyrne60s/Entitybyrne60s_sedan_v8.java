package bidahochi.foxdrives.entities.Entitybyrne60s;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.Modelbyrne60s_sedan;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class Entitybyrne60s_sedan_v8 extends EntityCarChest
{
    public Entitybyrne60s_sedan_v8(World world) {
        super(world);
        textureDescriptionMap.put(0, "Roadsport Green Top");
        textureDescriptionMap.put(1, "Cubed's Car");
        textureDescriptionMap.put(2, "Police Trim");
        textureDescriptionMap.put(3, "Evergreen");
        textureDescriptionMap.put(4, "Post-Dusk Grey");
        textureDescriptionMap.put(5, "Citrus Yellow");
        textureDescriptionMap.put(6, "Minty Two-Tone");
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
        return new String[]{"textures/byrne/byrne_sedan_roadsport_blank", "textures/byrne/byrne_sedan_roadsport_cubedcar", "textures/byrne/byrne_sedan_detectivespecial_blank",
                "textures/byrne/byrne_sedan_1963_69_v8_gren","textures/byrne/byrne_sedan_1963_69_postdusk","textures/byrne/byrne_sedan_1963_69_citrus_yeller",
                "textures/byrne/byrne_sedan_1963_69_v8_minty",};
    }

    @Override
    public CarType type(){
        return CarType.BYRNE60S_SEDAN_V8;
    }

}
