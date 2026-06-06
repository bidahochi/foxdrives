package bidahochi.foxdrives.entities.BaseEntityVehicle;

import net.minecraft.entity.DataWatcher;
import net.minecraft.world.World;

import java.util.Map;

public interface IWrappable {

    float getGuiRenderScale();

    String[] getSkins();

    int getSkin();

    void setSkin(int skinID);

    Map<Integer, String> getTextureDescriptionMap();

    int getTransportEntityID();

}
