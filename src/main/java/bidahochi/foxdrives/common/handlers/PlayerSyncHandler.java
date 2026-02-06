package bidahochi.foxdrives.common.handlers;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.util.Packet.PacketSyncBannedItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.entity.player.EntityPlayerMP;

public class PlayerSyncHandler
{
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.player instanceof EntityPlayerMP)) return;

        EntityPlayerMP player = (EntityPlayerMP) event.player;

        FoxDrives.BannedItems_CHANNEL.sendTo(
                new PacketSyncBannedItems(ItemHandler.BANNED_ITEMS),
                player
        );
    }
}