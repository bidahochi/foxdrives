package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.models.ModelRedmund1972;
import bidahochi.foxdrives.models.Modelmkds_standard;
import fexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityMKDS_Standard extends EntityCarChest {

    public EntityMKDS_Standard(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityMKDS_Standard(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Mario");
        textureDescriptionMap.put(1, "Luigi");
        textureDescriptionMap.put(2, "Peach");
        textureDescriptionMap.put(6, "Wario");
        setGuiRenderScale(getGuiRenderScale() + 5f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new Modelmkds_standard();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/mkds/mkds_standard_mr", "textures/mkds/mkds_standard_lg", "textures/mkds/mkds_standard_pc", "textures/mkds/mkds_standard_ys",
                "textures/mkds/mkds_standard_td", "textures/mkds/mkds_standard_dk", "textures/mkds/mkds_standard_wr", "textures/mkds/mkds_standard_bw",
                "textures/mkds/mkds_standard_ds", "textures/mkds/mkds_standard_db", "textures/mkds/mkds_standard_wl", "textures/mkds/mkds_standard_rb",
                "textures/mkds/mkds_standard_sg", "textures/mkds/mkds_standard_bd", "textures/mkds/mkds_standard_cb"};
    }

    @Override
    public CarType type(){
        return CarType.MKDS_Standard;
    }


}
