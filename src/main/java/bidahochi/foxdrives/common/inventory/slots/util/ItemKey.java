package bidahochi.foxdrives.common.inventory.slots.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemKey
{
    public final Item item;
    public final int meta; // -1 wildcard

    public ItemKey(Item item, int meta) {
        this.item = item;
        this.meta = meta;
    }

    public boolean matches(ItemStack stack) {
        if (stack == null) return false;
        if (stack.getItem() != item) return false;
        return meta == -1 || meta == stack.getItemDamage();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ItemKey)) return false;
        ItemKey other = (ItemKey) o;
        return item == other.item && meta == other.meta;
    }

    @Override
    public int hashCode() {
        return item.hashCode() * 31 + meta;
    }
}
