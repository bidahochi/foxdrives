package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingParent;
import bidahochi.foxdrives.entities.util.HitchType;
import bidahochi.foxdrives.models.ModelHTT;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class EntityHTT extends AbstractTowingParent
{

    public EntityHTT(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Reddy");
        textureDescriptionMap.put(1, "Bluey");
        textureDescriptionMap.put(2, "Yellowe");
        textureDescriptionMap.put(3, "Greeno");
        textureDescriptionMap.put(4, "White");
        textureDescriptionMap.put(5, "CWTL");
        textureDescriptionMap.put(6, "Magnolia RCM");
        textureDescriptionMap.put(7, "Railcar Mover");
        textureDescriptionMap.put(8, "");

        setGuiRenderScale(getGuiRenderScale() + 0f);
        hitchPos.put(HitchType.FIFTH_WHEEL, new Vec3f(0,-0.5,-1.15));
        //hitchPos.put(HitchType.BALL, new Vec3f(0, 1.5, -0.75));
    }

    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelHTT();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/htt/mcc_htt_i6_reddy", "textures/htt/mcc_htt_i6_sf_bluey", "textures/htt/mcc_htt_i6_sf_yellowe",
                "textures/htt/mcc_htt_i6_sf_greeno", "textures/htt/mcc_htt_i6_sf_blank", "textures/htt/mcc_htt_i6_sf_CWTL",
                "textures/htt/mcc_htt_i6_rcm_magnolier", "textures/htt/mcc_htt_i6_railcarmover"};
    }

    @Override
    public CarType type() { return CarType.HTT; }

    @Override
    public HitchType getHitchType() { return HitchType.FIFTH_WHEEL; }

}
