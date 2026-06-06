package bidahochi.foxdrives.entities.Trailers;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChildChest;
import bidahochi.foxdrives.entities.util.HitchType;
import bidahochi.foxdrives.models.trailers.Modeldryvan40ft;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class Entity40ftDryvan extends AbstractTowingChildChest {


    public Entity40ftDryvan(World world) {
        super(world);
        textureDescriptionMap.put(0, "Blandsville Transportation Services");
        textureDescriptionMap.put(1, "Robin Postal Service");
        textureDescriptionMap.put(2, "Lynden Transport");
        textureDescriptionMap.put(3, "Alaska Marine Lines");
        textureDescriptionMap.put(4, "Alaska West Express");
        setGuiRenderScale(15);
        receiverPos = new Vec3f(0, -0.5f, 2.87);
    }

    @Override
    public ModelBase getModel() {
        return new Modeldryvan40ft();
    }

    @Override
    public TrailerType type() {
        return TrailerType.DRYVAN40FT;
    }

    @Override
    public String[] getSkins() {
        return new String[] {"textures/40ft_dryvan/Skin_Rollup40ft_Blank", "textures/40ft_dryvan/Skin_Rollup40ft_RobinPostal",
                "textures/40ft_dryvan/Skin_Rollup40ft_LyndenTransport", "textures/40ft_dryvan/Skin_Rollup40ft_AML", "textures/40ft_dryvan/Skin_Rollup40ft_AWE"};
    }

    @Override
    public HitchType getReceiverType() { return HitchType.FIFTH_WHEEL; }
}
