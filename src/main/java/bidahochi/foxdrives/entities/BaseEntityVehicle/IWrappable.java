package bidahochi.foxdrives.entities.BaseEntityVehicle;

import net.minecraft.entity.DataWatcher;
import net.minecraft.world.World;

import java.util.Map;

public interface IWrappable {

    float getGuiRenderScale();

    String[] getSkins();

    DataWatcher getDataWatcher();

    World getWorld();

    Map<Integer, String> getTextureDescriptionMap();

    int getEntityId();

}
