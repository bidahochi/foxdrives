package bidahochi.foxdrives.util.Packet;

import bidahochi.foxdrives.common.handlers.ItemHandler;
import bidahochi.foxdrives.common.inventory.slots.util.ItemKey;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PacketSyncBannedItems implements IMessage {

    private List<ItemKey> banned;

    public PacketSyncBannedItems()
    {
    }

    public PacketSyncBannedItems(Set<ItemKey> banned)
    {
        this.banned = new ArrayList<>(banned);
    }

    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(banned.size());
        for (ItemKey key : banned) {
            buf.writeInt(Item.getIdFromItem(key.item));
            buf.writeInt(key.meta);
        }
    }

    @Override
    public void fromBytes(ByteBuf buf)
    {
        int size = buf.readInt();
        banned = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Item item = Item.getItemById(buf.readInt());
            int meta = buf.readInt();
            banned.add(new ItemKey(item, meta));
        }
    }

    public static class Handler implements IMessageHandler<PacketSyncBannedItems, IMessage> {

        @Override
        public IMessage onMessage(PacketSyncBannedItems msg, MessageContext ctx)
        {
            ItemHandler.BANNED_ITEMS.clear();
            ItemHandler.BANNED_ITEMS.addAll(msg.banned);
            return null;
        }
    }
}
