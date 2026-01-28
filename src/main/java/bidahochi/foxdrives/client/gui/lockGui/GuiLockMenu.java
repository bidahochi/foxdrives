package bidahochi.foxdrives.client.gui.lockGui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.util.Packet.PacketSetTransportLockedToClient;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;

/**
 * @author 02skaplan
 * <p>Lock and Trusted Players Menu</p>
 * <p>Allows players to lock and unlock a piece of rolling stock and add & remove trusted individuals from using the rolling stock.</p>
 */
@SideOnly(Side.CLIENT)
public class GuiLockMenu extends GuiLockMenuAbstract {
    private final EntityCar rollingStock;

    /**
     * @author 02skaplan
     */
    public GuiLockMenu(EntityPlayer editingPlayer, EntityCar rollingStock) {
        super(editingPlayer);
        this.rollingStock = rollingStock;
        currentTrustees.addAll(rollingStock.getTrustedList());
    }

    @Override
    public boolean getLocked() {
        return rollingStock.getTransportLocked();
    }

    @Override
    public void setLocked(boolean locked) {
        rollingStock.setTransportLocked(locked);
    }

    @Override
    public void sendUpdatePacket(boolean propagate) {
        FoxDrives.lockChannel.sendToServer(new PacketSetTransportLockedToClient(rollingStock.getTransportLocked(), currentTrustees, rollingStock.getEntityId(), propagate));
    }
}
