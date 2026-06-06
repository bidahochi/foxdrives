package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.entities.util.TrustedPlayer;
import bidahochi.foxdrives.util.ITypeHolder;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.Vec3;

import java.util.List;

public interface IInventoryEntity {

    IInventory getTransportInventory();

    boolean isTransportAlive();

    float getDistanceToTransport(Entity player);

    ITypeHolder type();

    int getTransportSizeInventory();

    boolean transportHasCustomInventoryName();

    String getTransportInventoryName();

    boolean getTransportLocked();

    String getTransportOwner();

    boolean isPlayerTrusted(String playerName);

    boolean isPlayerTrustedToBreak(String playerName);

    default byte getTurnSignalTick() { return 0; }

    default byte getTurnSignalDirection() { return 0; }

    default boolean isBeaconEnabled() { return false; }

    default boolean isAuxLightsEnabled() { return false; }

    default boolean isLightsEnabled() { return false; }

    boolean isLocked();

    void setLocked(boolean locked);

    List<TrustedPlayer> getTrustedList();

    int getTransportEntityID();

    Vec3 getPosition();

    void setTransportLocked(boolean locked);

    void setTrustedList(List<TrustedPlayer> trustedList);
}
