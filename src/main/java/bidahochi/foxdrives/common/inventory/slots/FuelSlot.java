package bidahochi.foxdrives.common.inventory.slots;

import bidahochi.foxdrives.common.handlers.ItemHandler;
import bidahochi.foxdrives.util.ConfigHandler;
import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

public class FuelSlot extends Slot {

    public FuelSlot(IInventory inventory, int slotIndex, int xDisplayPosition, int yDisplayPosition)
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
        if (block == null)
        {
            return false;
        }

        return FluidContainerRegistry.isFilledContainer(itemStack);
    }
}
