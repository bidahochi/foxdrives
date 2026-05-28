package bidahochi.foxdrives.entities.Trailers;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChildChest;
import bidahochi.foxdrives.entities.util.HitchType;
import bidahochi.foxdrives.models.trailers.ModelDryvan53Foot;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class Entity53ftDryvan extends AbstractTowingChildChest {


    public Entity53ftDryvan(World world) {
        super(world);
        textureDescriptionMap.put(0, "Blandsville Transportation Services");
        textureDescriptionMap.put(1, "Blandsville Transportation Services (DOT C2 reflectors)");
        textureDescriptionMap.put(2, "Fernrock Foods Company");
        textureDescriptionMap.put(3, "Alaska Marine Lines (dirty)");
        textureDescriptionMap.put(4, "Alaska Marine Lines (absolutely beyond soiled)");
        textureDescriptionMap.put(5, "PXO Logistics");
        textureDescriptionMap.put(6, "INTERSTATE Trucking");

        setGuiRenderScale(15);
        receiverPos = new Vec3f(0, -0.5f, 3.55);
    }

    @Override
    public ModelBase getModel() {
        return new ModelDryvan53Foot();
    }

    @Override
    public TrailerType type() {
        return TrailerType.DRYVAN53FT;
    }

    @Override
    public String[] getSkins() {
        return new String[] {"textures/53ft_dryvan/53ft_dryvan_2", "textures/53ft_dryvan/53ft_dryvan_dotc2", "textures/53ft_dryvan/53ft_dryvan_fernrock",
                "textures/53ft_dryvan/PropTrailerDryvan_ALASKAMARINELINES", "textures/53ft_dryvan/PropTrailerDryvan_ALASKAMARINELINES_CAR_CRASH_EJECTION_CHALLENGE",
                "textures/53ft_dryvan/53ft_dryvan_pxo", "textures/53ft_dryvan/53ft_dryvan_interstate"};
    }

    @Override
    public HitchType getReceiverType() { return HitchType.FIFTH_WHEEL; }
}
