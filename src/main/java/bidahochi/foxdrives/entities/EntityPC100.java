package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingParent;
import bidahochi.foxdrives.entities.util.HitchType;
import bidahochi.foxdrives.models.Modelpc100;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class EntityPC100 extends AbstractTowingParent
{

    public EntityPC100(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Factory Green (Early)");
        textureDescriptionMap.put(1, "Factory Eggshell White (Early)");
        textureDescriptionMap.put(2, "Generic 1 (Late)");
        textureDescriptionMap.put(3, "Generic 2 (Late)");
        textureDescriptionMap.put(4, "Generic 3 (Late)");
        textureDescriptionMap.put(5, "Generic 4 (Environtech Industries, Late Aero)");
        textureDescriptionMap.put(6, "Coyote Truck Lines");
        setGuiRenderScale(getGuiRenderScale() + 0f);

        hitchPos.put(HitchType.FIFTH_WHEEL, new Vec3f(0,-0.5,-0.75)); // 0, -0.5, f/b
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new Modelpc100();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/focks/pc100s_6x4_blank_early", "textures/focks/pc100s_6x4_blank_early2", "textures/focks/pc100s_6x4_blank2_kingroad"
                , "textures/focks/pc100s_6x4_blanka", "textures/focks/pc100s_6x4_genrics_again", "textures/focks/pc100sa_6x4_blank_environ_industries"
                , "textures/focks/pc100sa_6x4_CTL2"};
    }

    @Override
    public CarType type(){
        return CarType.PC100;
    }

    @Override
    public HitchType getHitchType() { return HitchType.FIFTH_WHEEL; }
}
