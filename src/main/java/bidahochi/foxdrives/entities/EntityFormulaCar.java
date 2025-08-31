package bidahochi.foxdrives.entities;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelFormulaCar;
import fdfexcraft.tmt_slim.ModelBase;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;


public class EntityFormulaCar extends EntityCarChest
{

    public EntityFormulaCar(World world, double xPos, double yPos, double zPos) {
        super(world, xPos, yPos, zPos);
    }
    public EntityFormulaCar(World p_i1685_1_) {
        super(p_i1685_1_);
        textureDescriptionMap.put(0, "Racing Point");
        textureDescriptionMap.put(1, "Alfa Romeo");
        setGuiRenderScale(getGuiRenderScale() + 5f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelFormulaCar();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/formula/bwt", "textures/formula/alfa"};
    }

    @Override
    public Vec3f getModelScale() { return new Vec3f(1.125f,1.125f,1.125f); }

    @Override
    public CarType type(){
        return CarType.FORMULA_CAR;
    }

    @Override
    public void clampTopSpeed(double velocity) {

        //clamp top speed
        if(velocity > type().max_forward_speed){
            this.velocity = type().max_forward_speed;
        }
        else if(velocity < -type().max_backward_speed){
            this.velocity = -type().max_backward_speed;
        }

        if (isSlowBlock(worldObj.getBlock((int) this.posX, (int) this.posY-1, (int) this.posZ))) {
            this.velocity *= 0.7f;
        }
    }

    public boolean isSlowBlock(Block block) {
        return block.getMaterial() == Material.grass || block.getMaterial() == Material.sand || block.getMaterial() == Material.ground;
    }

}
