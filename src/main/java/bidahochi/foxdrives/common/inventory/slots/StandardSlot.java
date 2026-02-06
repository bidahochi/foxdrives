package bidahochi.foxdrives.common.inventory.slots;

import bidahochi.foxdrives.common.handlers.ItemHandler;
import bidahochi.foxdrives.util.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class StandardSlot extends Slot {
    public StandardSlot(IInventory inventory, int slotIndex, int xDisplayPosition, int yDisplayPosition)
    {
        super(inventory, slotIndex, xDisplayPosition, yDisplayPosition);
    }

    @Override
    public boolean isItemValid(ItemStack itemStack)
    {
        if(itemStack == null)
        {
            return false;
        }

        Block block = Block.getBlockFromItem(itemStack.getItem());
        if (block == null || ItemHandler.isBanned(itemStack))
        {
            return false;
        }

        if (ConfigHandler.TRANSPORT_INVENTORY_BAN_OPEN_FLUID_CONTAINERS && FluidContainerRegistry.isFilledContainer(itemStack))
        {
            return false;
        }

        return true;
    }
}
