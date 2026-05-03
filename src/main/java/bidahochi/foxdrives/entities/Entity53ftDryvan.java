package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.TrailerType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChild;
import bidahochi.foxdrives.models.ModelDryvan53Foot;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.world.World;

public class Entity53ftDryvan extends AbstractTowingChild {


    public Entity53ftDryvan(World world) {
        super(world);
        textureDescriptionMap.put(0, "Blank Trailer");
        textureDescriptionMap.put(1, "Fern Rock Trailer");
        setGuiRenderScale(getGuiRenderScale());
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
        return new String[] {"textures/53ft_dryvan/53ft_dryvan_2", "textures/53ft_dryvan/53ft_dryvan_fernrock"};
    }

    @Override
    public Vec3f getHitchOffset() { return new Vec3f(0, -0.5f, 3.55); }
}
