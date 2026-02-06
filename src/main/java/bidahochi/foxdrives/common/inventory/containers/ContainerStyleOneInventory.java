package bidahochi.foxdrives.common.inventory.containers;

import bidahochi.foxdrives.common.inventory.slots.StandardSlot;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.common.inventory.enums.InventorySize;
import net.minecraft.inventory.IInventory;

public class ContainerStyleOneInventory extends ContainerBaseInventory {
    public ContainerStyleOneInventory(IInventory invPlayer, final EntityCarChest transport)
    {
        super(invPlayer, transport);

        buildStandardInventory(transport.type().inventorySize);

        buildPlayerInventory();
    }

    private void buildStandardInventory(InventorySize size)
    {
        switch (size)
        {
            case STYLE_PROFILE_3x3:
                basicInventorySlotGenerator(3, 3, 8, 26);
                break;
            case STYLE_PROFILE_3x5:
                basicInventorySlotGenerator(3, 5, 8, 26);
                break;
            case STYLE_PROFILE_3x7:
                basicInventorySlotGenerator(3, 7, 8, 26);
                break;
            case STYLE_PROFILE_3x9:
                basicInventorySlotGenerator(3, 9, 8, 26);
                break;
            default:
            {

            }
        }
    }

    private void basicInventorySlotGenerator(int carRows,
                                             int carCol,
                                             int manualXAdjust,
                                             int manualYAdjust)
    {
        for (int row = 0; row < carRows; row++)
        {
            for (int col = 0; col < carCol; col++)
            {
                int slot = 2 + col + row * carCol;

                if (slot >= car.getSizeInventory()) {
                    throw new RuntimeException(
                            "Slot out of bounds: " + slot +
                                    " (inv size=" + car.getSizeInventory() + ")"
                    );
                }

                int x = (col * 18) + manualXAdjust;
                int y = (row * 18) + manualYAdjust;

                this.addSlotToContainer(new StandardSlot(car, slot, x, y));
            }
        }
    }
}
