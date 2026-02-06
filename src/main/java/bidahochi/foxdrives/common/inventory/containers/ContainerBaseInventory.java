package bidahochi.foxdrives.common.inventory.containers;

import bidahochi.foxdrives.common.inventory.slots.DisabledSlot;
import bidahochi.foxdrives.common.inventory.slots.FuelSlot;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBaseInventory extends Container
{
    protected IInventory playerInventory;
    protected EntityCarChest car;

    public ContainerBaseInventory(IInventory invPlayer, final EntityCarChest transport)
    {
        this.car = transport;
        this.playerInventory = invPlayer;

        // --- Car slots ---
        this.addSlotToContainer(new FuelSlot(car, 0, 204 , 26));
        this.addSlotToContainer(new DisabledSlot(car, 1, 204 , 64));
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(p_82846_2_);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (p_82846_2_ < this.playerInventory.getSizeInventory()) {
                if (!this.mergeItemStack(itemstack1, this.playerInventory.getSizeInventory(), this.inventorySlots.size(), true)) {
                    return null;
                }
            }
            else if (this.getSlot(1).isItemValid(itemstack1) && !this.getSlot(1).getHasStack()) {
                if (!this.mergeItemStack(itemstack1, 1, 2, false)) {
                    return null;
                }
            }
            else if (this.getSlot(0).isItemValid(itemstack1)) {
                if (!this.mergeItemStack(itemstack1, 0, 1, false)) {
                    return null;
                }
            }
            else if (this.playerInventory.getSizeInventory() <= 2 || !this.mergeItemStack(itemstack1, 2, this.playerInventory.getSizeInventory(), false)) {
                return null;
            }

            if (itemstack1.stackSize == 0) {
                slot.putStack((ItemStack)null);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return this.playerInventory.isUseableByPlayer(entityPlayer) && this.car.isEntityAlive()
                && this.car.getDistanceToEntity(entityPlayer) < 8.0F;
    }

    /**
     * Called when the container is closed.
     */
    public void onContainerClosed(EntityPlayer p_75134_1_)
    {
        super.onContainerClosed(p_75134_1_);
        this.playerInventory.closeInventory();
    }

    public void buildPlayerInventory()
    {
        // --- Player inventory ---
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlotToContainer(new Slot(
                        playerInventory,
                        col + row * 9 + 9,
                        8 + col * 18,
                        102 + row * 18
                ));
            }
        }

        // --- Hotbar ---
        for (int col = 0; col < 9; col++) {
            this.addSlotToContainer(new Slot(
                    playerInventory,
                    col,
                    8 + col * 18,
                    160
            ));
        }
    }
}
