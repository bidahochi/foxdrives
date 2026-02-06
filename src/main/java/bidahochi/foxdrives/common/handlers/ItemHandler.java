package bidahochi.foxdrives.common.handlers;

import bidahochi.foxdrives.common.inventory.slots.util.ItemKey;
import bidahochi.foxdrives.util.ConfigHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.HashSet;
import java.util.Set;

public class ItemHandler
{
    public static final Set<ItemKey> BANNED_ITEMS = new HashSet<>();

    public static void parseBannedItems(String[] entries) {

        for (String line : entries)
        {
            if (line == null)
            {
                continue;
            }

            line = line.trim();
            if (line.isEmpty())
            {
                continue;
            }

            String modid = "minecraft";
            String name;
            String metaPart = null;

            String[] split = line.split(":");

            if (split.length == 1) {
                name = split[0];
            } else if (split.length == 2) {
                modid = split[0];
                name  = split[1];
            } else {
                modid = split[0];
                name  = split[1];
                metaPart = split[2];
            }

            Item item = GameRegistry.findItem(modid, name);
            if (item == null)
            {
                continue;
            }

            // No meta → wildcard
            if (metaPart == null) {
                BANNED_ITEMS.add(new ItemKey(item, -1));
                continue;
            }

            // Range: 0-15
            if (metaPart.contains("-")) {
                String[] r = metaPart.split("-");
                int start = Integer.parseInt(r[0]);
                int end   = Integer.parseInt(r[1]);

                for (int i = start; i <= end; i++) {
                    BANNED_ITEMS.add(new ItemKey(item, i));
                }
                continue;
            }

            // List: 1,2,3,5
            if (metaPart.contains(",")) {
                for (String s : metaPart.split(",")) {
                    BANNED_ITEMS.add(new ItemKey(item, Integer.parseInt(s)));
                }
                continue;
            }

            // Single meta
            BANNED_ITEMS.add(new ItemKey(item, Integer.parseInt(metaPart)));
        }

        ConfigHandler.TRANSPORT_INVENTORY_BLACKLIST_RAW = null;
    }

    public static boolean handleFreight(Entity entity, ItemStack itemstack)
    {
        if (itemstack == null) {
            return false;
        }

        Block block = Block.getBlockFromItem(itemstack.getItem());
        if (block == null) {
            return false;
        }

        if (isBanned(itemstack)) {
            return false;
        }

        return true;
    }

    public static boolean isBanned(ItemStack stack)
    {
        for (ItemKey key : BANNED_ITEMS)
        {
            if (key.matches(stack)) {
                return true;
            }
        }
        return false;
    }
}
