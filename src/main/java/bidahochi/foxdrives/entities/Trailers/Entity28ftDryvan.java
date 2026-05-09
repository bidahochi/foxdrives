package bidahochi.foxdrives.entities.Trailers;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChild;
import bidahochi.foxdrives.entities.util.HitchType;
import bidahochi.foxdrives.models.trailers.Modeldryvan28ft;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class Entity28ftDryvan extends AbstractTowingChild {

    public Entity28ftDryvan(World world) {
        super(world);
        textureDescriptionMap.put(0, "Blandsville Transportation Services");
        textureDescriptionMap.put(1, "Coyote Truck Lines");
        textureDescriptionMap.put(2, "PXO Logistics");
        setGuiRenderScale(15);
        receiverPos = new Vec3f(0, -0.5f, 1.95);
    }

    @Override
    public ModelBase getModel() {
        return new Modeldryvan28ft();
    }

    @Override
    public TrailerType type() {
        return TrailerType.DRYVAN28FT;
    }

    @Override
    public String[] getSkins() {
        return new String[] {"textures/28ft_dryvan/Skin_Rollup28ft_Blank", "textures/28ft_dryvan/Skin_Rollup28ft_coyotetrucklines",
                "textures/28ft_dryvan/Skin_Rollup28ft_PXO"};
    }

    @Override
    public HitchType getReceiverType() { return HitchType.FIFTH_WHEEL; }
}
