package bidahochi.foxdrives.entities.Trailers;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChild;
import bidahochi.foxdrives.models.trailers.ModelDryvan53Foot;
import bidahochi.foxdrives.models.trailers.Modelfueltanker53ft;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class Entity53ftFuelTanker extends AbstractTowingChild {


    public Entity53ftFuelTanker(World world) {
        super(world);
        textureDescriptionMap.put(0, "Blandsville Transportation Services");
        textureDescriptionMap.put(1, "Generic 1");
        textureDescriptionMap.put(2, "Generic 2");
        textureDescriptionMap.put(3, "Alaska West Express");
        setGuiRenderScale(15);
    }

    @Override
    public ModelBase getModel() {
        return new Modelfueltanker53ft();
    }

    @Override
    public TrailerType type() {
        return TrailerType.FUELTANKER53FT;
    }

    @Override
    public String[] getSkins() {
        return new String[] {"textures/53ft_fueltanker/Skin53ft_GasolineTankerBlank", "textures/53ft_fueltanker/Skin53ft_GasolineTankerGeneric1",
                "textures/53ft_fueltanker/Skin53ft_GasolineTankerGeneric2", "textures/53ft_fueltanker/Skin53ft_GasolineTanker_AWE"};
    }

    @Override
    public Vec3f getHitchOffset() { return new Vec3f(0, -0.5f, 4.05); }
}
