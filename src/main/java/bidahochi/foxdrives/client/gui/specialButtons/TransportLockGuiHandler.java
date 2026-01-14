package bidahochi.foxdrives.client.gui.specialButtons;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.GuiIDs;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.util.Packet.PacketSetTransportLockedToClient;
import bidahochi.foxdrives.util.TranslationUtil;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;

public class TransportLockGuiHandler
{
    private TransportLockGuiHandler()
    {
    }

    public static GuiButton createLockButton(
            EntityCar stock,
            EntityPlayer player,
            int baseX,
            int baseY,
            int offsetX,
            int offsetY,
            int buttonWidth
    )
    {
        if (!stock.getTransportLockedFromPacket())
        {
            return new GuiButton(50, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.unlocked.name"));
        }

        if (stock.getTransportOwner().equalsIgnoreCase(player.getDisplayName()))
        {
            return new GuiButton(50, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.locked.name"));
        }

        if (stock.isPlayerTrusted(player.getDisplayName()))
        {
            if (stock.isPlayerTrustedToBreak(player.getDisplayName()))
            {
                return new GuiButton(50, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.trustedplus.name"));
            }

            return new GuiButton(50, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.trusted.name"));
        }

        return new GuiButton(50, baseX + offsetX, baseY + offsetY, buttonWidth, 10, TranslationUtil.translate("train.locked.name"));
    }

    public static void handleLockButton(
            GuiScreen gui,
            GuiButton button,
            EntityPlayer player,
            EntityCar stock,
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
        }

        if (!shiftDown) {
            sendLockPacket(stock);
        }
        else {
            openLockMenu(gui, player, stock);
        }
    }

    private static void toggleLock(EntityCar stock, GuiButton button, GuiScreen gui)
    {
        if (!stock.getTransportLockedFromPacket()) {
            stock.setTransportLockedFromPacket(true);
            button.displayString = TranslationUtil.translate("train.locked.name");
        }
        else {
            stock.setTransportLockedFromPacket(false);
            button.displayString = TranslationUtil.translate("train.unlocked.name");
        }
        gui.initGui();
    }

    private static void sendLockPacket(EntityCar transport)
    {
        FoxDrives.lockChannel.sendToServer(
                new PacketSetTransportLockedToClient(
                        transport.getTransportLockedFromPacket(),
                        transport.getTrustedList(),
                        transport.getEntityId(),
                        false
                )
        );
    }

    private static void openLockMenu(GuiScreen gui, EntityPlayer player, EntityCar stock)
    {
        gui.mc.thePlayer.closeScreen();
        player.openGui(
                FoxDrives.instance,
                GuiIDs.LOCK_MENU,
                player.getEntityWorld(),
                stock.getEntityId(),
                -1,
                (int) stock.posZ
        );
    }
}
