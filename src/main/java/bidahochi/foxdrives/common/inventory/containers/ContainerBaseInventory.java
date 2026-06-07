package bidahochi.foxdrives.common.inventory.containers;

import bidahochi.foxdrives.common.inventory.slots.DisabledSlot;
import bidahochi.foxdrives.common.inventory.slots.FuelSlot;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.BaseEntityVehicle.IInventoryEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ContainerBaseInventory extends Container
{
    protected IInventory playerInventory;
    protected IInventoryEntity entityTransport;

    public ContainerBaseInventory(IInventory invPlayer, final IInventoryEntity transport)
    {
        this.entityTransport = transport;
        this.playerInventory = invPlayer;

        // --- Car slots ---
        if (entityTransport instanceof EntityCar) {
            this.addSlotToContainer(new FuelSlot(entityTransport.getTransportInventory(), 0, 204, 26));
            this.addSlotToContainer(new DisabledSlot(entityTransport.getTransportInventory(), 1, 204, 64));
        }
    }

    /**
     * Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
     */
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int slotIndex)
    {
        ItemStack copiedStack = null;

        if (slotIndex < 0 || slotIndex >= this.inventorySlots.size())
        {
            return null;
        }

        Slot sourceSlot = (Slot)this.inventorySlots.get(slotIndex);

        if (sourceSlot != null && sourceSlot.getHasStack())
        {
            ItemStack stack = sourceSlot.getStack();
            copiedStack = stack.copy();

            boolean sourceIsPlayerInventory = isPlayerInventorySlot(sourceSlot);

            /*
             * Player inventory -> vehicle/transport inventory
             */
            if (sourceIsPlayerInventory)
            {
                if (!mergeIntoNonPlayerSlots(stack))
                {
                    return null;
                }
            }
            /*
             * Vehicle/transport inventory -> player inventory
             */
            else
            {
                if (!mergeIntoPlayerSlots(stack))
                {
                    return null;
                }
            }

            if (stack.stackSize == 0)
            {
                sourceSlot.putStack(null);
            }
            else
            {
                sourceSlot.onSlotChanged();
            }

            if (stack.stackSize == copiedStack.stackSize)
            {
                return null;
            }

            sourceSlot.onPickupFromSlot(player, stack);
        }

        return copiedStack;
    }

    private boolean isPlayerInventorySlot(Slot slot)
    {
        return slot != null && slot.inventory == this.playerInventory;
    }

    private boolean mergeIntoPlayerSlots(ItemStack stack)
    {
        boolean movedAny = false;

        for (int i = this.inventorySlots.size() - 1; i >= 0; i--)
        {
            Slot targetSlot = (Slot)this.inventorySlots.get(i);

            if (!isPlayerInventorySlot(targetSlot))
            {
                continue;
            }

            int before = stack.stackSize;

            if (this.mergeItemStack(stack, i, i + 1, false))
            {
                if (stack.stackSize != before)
                {
                    movedAny = true;
                }

                if (stack.stackSize == 0)
                {
                    break;
                }
            }
        }

        return movedAny;
    }

    private boolean mergeIntoNonPlayerSlots(ItemStack stack)
    {
        boolean movedAny = false;

        for (int i = 0; i < this.inventorySlots.size(); i++)
        {
            Slot targetSlot = (Slot)this.inventorySlots.get(i);

            if (targetSlot == null)
            {
                continue;
            }

            if (isPlayerInventorySlot(targetSlot))
            {
                continue;
            }

            if (!targetSlot.isItemValid(stack))
            {
                continue;
            }

            int before = stack.stackSize;

            if (this.mergeItemStack(stack, i, i + 1, false))
            {
                if (stack.stackSize != before)
                {
                    movedAny = true;
                }

                if (stack.stackSize == 0)
                {
                    break;
                }
            }
        }

        return movedAny;
    }

    @Override
    public boolean canInteractWith(EntityPlayer entityPlayer) {
        return this.playerInventory.isUseableByPlayer(entityPlayer) && this.entityTransport.isTransportAlive()
                && this.entityTransport.getDistanceToTransport(entityPlayer) < 8.0F;
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
