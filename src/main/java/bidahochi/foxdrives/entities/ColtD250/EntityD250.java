package bidahochi.foxdrives.entities.ColtD250;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.models.ModelD250;
import fdfexcraft.tmt_slim.ModelBase;
import net.minecraft.world.World;


public class EntityD250 extends EntityCarChest
{

    public EntityD250(World world) {
        super(world);
        textureDescriptionMap.put(0, "Dark Blue");
        textureDescriptionMap.put(1, "Red");
        textureDescriptionMap.put(2, "Red (Two-Tone)");
        textureDescriptionMap.put(3, "Sand (Two-Tone)");
        textureDescriptionMap.put(4, "Sand");
        textureDescriptionMap.put(5, "White (Chrome)");
        textureDescriptionMap.put(6, "White");
        textureDescriptionMap.put(7, "White (Two-Tone)");
        setGuiRenderScale(getGuiRenderScale() + 0f);
    }


    /**
     * Returns the model for the entity
     */
    @Override
    public ModelBase getModel() {
        return new ModelD250();
    }

    /**
     * returns a list of skin texture addresses for the entity, the MODID is presumed to be the one defined in FoxDrives.java
     * example:
     * String[] getSkins(){return new String[]{"textures/skin1", "textures/skin2"};}
     */
    @Override
    public String[] getSkins() {
        return new String[]{"textures/Colt_D250/f250blue", "textures/Colt_D250/f250 red (Low trim) - stock", "textures/Colt_D250/f250 red Special (high trim) - stock", "textures/Colt_D250/f250 sand (high trim) - stock", "textures/Colt_D250/f250 sand (Low trim) - stock", "textures/Colt_D250/f250 White (high trim) - stock", "textures/Colt_D250/f250 White (Low trim) - stock", "textures/Colt_D250/f250 White Special (high trim) - stock" };
    }

    @Override
    public CarType type(){
        return CarType.D250;
    }

}
