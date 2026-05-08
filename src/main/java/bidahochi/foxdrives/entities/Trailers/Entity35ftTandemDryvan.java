package bidahochi.foxdrives.entities.Trailers;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChild;
import bidahochi.foxdrives.models.trailers.Modeltandemdryvan35ft;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class Entity35ftTandemDryvan extends AbstractTowingChild {


    public Entity35ftTandemDryvan(World world) {
        super(world);
        textureDescriptionMap.put(0, "Blandsville Transportation Services");
        textureDescriptionMap.put(1, "Generic Silvery");
        textureDescriptionMap.put(2, "Coyote Truck Lines");
        textureDescriptionMap.put(3, "Generic (Side Door)");
        textureDescriptionMap.put(4, "Generic (Evergreen)");
        textureDescriptionMap.put(5, "Generic (Redsy)");
        textureDescriptionMap.put(6, "Colonel's Western Truck Lines");
        setGuiRenderScale(15);
    }

    @Override
    public ModelBase getModel() {
        return new Modeltandemdryvan35ft();
    }

    @Override
    public TrailerType type() {
        return TrailerType.TANDEMDRYVAN35FT;
    }

    @Override
    public String[] getSkins() {
        return new String[] {"textures/35ft_tandem/frehauf_35ft_tandem_blank", "textures/35ft_tandem/frehauf_35ft_tandem_silvery",
                "textures/35ft_tandem/frehauf_35ft_tandem_coyotetrucklines2", "textures/35ft_tandem/frehauf_35ft_tandem_doorside",
                "textures/35ft_tandem/frehauf_35ft_tandem_evergreen", "textures/35ft_tandem/frehauf_35ft_tandem_redsy",
                "textures/35ft_tandem/frehauf_35ft_tandem_cwtl"};
    }

    @Override
    public Vec3f getHitchOffset() { return new Vec3f(0, -0.5f, 2.525); }
}
