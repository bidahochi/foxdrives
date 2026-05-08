package bidahochi.foxdrives.entities.Trailers;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChild;
import bidahochi.foxdrives.models.trailers.Modelflatbed53Foot;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class Entity53ftFlatbed extends AbstractTowingChild {

    public Entity53ftFlatbed(World world) {
        super(world);
        textureDescriptionMap.put(0, "Blandsville Transportation Services");
        textureDescriptionMap.put(1, "Generic 1");
        textureDescriptionMap.put(2, "Generic 2");
        textureDescriptionMap.put(3, "Generic 3");
        textureDescriptionMap.put(4, "Generic 4 (oversized banner)");
        setGuiRenderScale(15);
    }

    @Override
    public ModelBase getModel() {
        return new Modelflatbed53Foot();
    }

    @Override
    public TrailerType type() {
        return TrailerType.FLATBED53FT;
    }

    @Override
    public String[] getSkins() {
        return new String[] {"textures/53ft_flatbed/Skin53ft_FlatbedBlank", "textures/53ft_flatbed/Skin53ft_FlatbedGeneric1", "textures/53ft_flatbed/Skin53ft_FlatbedGeneric2",
                "textures/53ft_flatbed/Skin53ft_FlatbedGeneric3", "textures/53ft_flatbed/Skin53ft_FlatbedGeneric4"};
    }

    @Override
    public Vec3f getHitchOffset() { return new Vec3f(0.0f, -0.5f, 4.0); }//dont touch, vertical, frontback
}
