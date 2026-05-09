package bidahochi.foxdrives.client.gui.specialButtons;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.GuiIDs;
import bidahochi.foxdrives.client.gui.genericButtons.GuiCustomButton;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.BaseEntityVehicle.IInventoryEntity;
import bidahochi.foxdrives.util.Packet.PacketSetTransportLockedToClient;
import bidahochi.foxdrives.util.PacketInteract;
import bidahochi.foxdrives.util.TranslationUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ResourceLocation;

public class TransportLockGuiHandler
{
    private TransportLockGuiHandler()
    {
    }

    public static GuiButton createLockButton(IInventoryEntity stock, EntityPlayer player, ResourceLocation buttonStyle,
                                             int baseX, int baseY, int offsetX, int offsetY, int buttonWidth)
    {
        if (!stock.getTransportLocked())
        {
            return new GuiCustomButton(50, baseX + offsetX, baseY + offsetY, 54, 13, "", buttonStyle,  54, 64);
        }

        if (stock.getTransportOwner().equalsIgnoreCase(player.getDisplayName()))
        {
            return new GuiCustomButton(50, baseX + offsetX, baseY + offsetY, 54, 13, "", buttonStyle,  0, 64);
        }

        if (stock.isPlayerTrusted(player.getDisplayName()))
        {
            if (stock.isPlayerTrustedToBreak(player.getDisplayName()))
            {
                return new GuiCustomButton(50, baseX + offsetX, baseY + offsetY, 54, 13, "", buttonStyle,  0, 92);
            }

            return new GuiCustomButton(50, baseX + offsetX, baseY + offsetY, 54, 13, "", buttonStyle,  0, 78);
        }

        return new GuiCustomButton(50, baseX + offsetX, baseY + offsetY, 54, 13, "", buttonStyle,  0, 64);
    }

    public static void handleLockButton(
            GuiScreen gui,
            GuiButton button,
            EntityPlayer player,
            IInventoryEntity stock,
            boolean shiftDown
    )
    {
        if (player == null || stock == null) return;

        // Ownership check
        if (!player.getCommandSenderName().equalsIgnoreCase(stock.getTransportOwner())) {
            player.addChatMessage(new ChatComponentText(TranslationUtil.translate("train.owner.name")));
            return;
        }

        // Toggle lock (non-shift)
        if (!shiftDown) {
            toggleLock(stock, button, gui);
            sendLockPacket(stock);
        }

        else {
            openLockMenu(gui, player, stock);
        }
    }

    private static void toggleLock(IInventoryEntity stock, GuiButton button, GuiScreen gui)
    {
        if (!stock.getTransportLocked())
        {
            stock.setLocked(true);
        }
        else
        {
            stock.setLocked(false);
        }
    }

    private static void sendLockPacket(IInventoryEntity transport)
    {
        FoxDrives.lockChannel.sendToServer(
                new PacketSetTransportLockedToClient(
                        transport.isLocked(),
                        transport.getTrustedList(),
                        transport.getEntityId(),
                        false
                )
        );
        //FoxDrives.interactChannel.sendToServer(new PacketInteract(50, Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
    }

    private static void openLockMenu(GuiScreen gui, EntityPlayer player, IInventoryEntity stock)
    {
        gui.mc.thePlayer.closeScreen();
        player.openGui(
                FoxDrives.instance,
                GuiIDs.LOCK_MENU,
                player.getEntityWorld(),
                stock.getEntityId(),
                -1,
                (int) stock.getPosition().zCoord
        );
    }
}
