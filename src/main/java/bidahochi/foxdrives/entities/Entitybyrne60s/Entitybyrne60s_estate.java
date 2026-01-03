package bidahochi.foxdrives.entities.Entitybyrne60s;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.Modelbyrne60s_estate;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class Entitybyrne60s_estate extends EntityCarChest
{

    public Entitybyrne60s_estate(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Baby Blue");
        textureDescriptionMap.put(1, "Green");
        textureDescriptionMap.put(2, "Fleetpower Trim");
        textureDescriptionMap.put(3, "Fleetpower Trim (HiRail Equipped)");
        textureDescriptionMap.put(4, "Woody Special Red");
        textureDescriptionMap.put(5, "Woody Special Blue");
        textureDescriptionMap.put(6, "FNCC Crewvan");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new Modelbyrne60s_estate();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/byrne/byrne_estate_base_blank", "textures/byrne/byrne_estate_base_greene",
                "textures/byrne/byrne_estate_fleetpower_blank", "textures/byrne/byrne_estate_fleetpower_hirail",
                "textures/byrne/byrne_estate_woodyspecial1", "textures/byrne/byrne_estate_woodyspecial2", "textures/byrne/byrne_estate_fncc_crewmow"};
    }

    @Override
    public CarType type(){
        return CarType.BYRNE60S_ESTATE;
    }

}
