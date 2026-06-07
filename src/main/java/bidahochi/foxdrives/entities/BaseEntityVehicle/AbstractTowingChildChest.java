package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.common.handlers.ItemHandler;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.inventory.IInvBasic;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

public abstract class AbstractTowingChildChest extends AbstractTowingChild implements IInventory, IInvBasic, IInventoryEntity {

    AnimalChest inv;

    /**
     * client side entity spawn
     *
     * @param world
     */
    public AbstractTowingChildChest(World world) {
        super(world);
        this.func_110226_cD();
    }

    public final int getMaxSlots() { return type().inventorySize.SlotCount; }

    private void func_110226_cD() {
        AnimalChest oldChest = this.inv;

        this.inv = new AnimalChest("inv", this.getMaxSlots());
        this.inv.func_110133_a(this.getCommandSenderName());

        if (oldChest != null) {
            oldChest.func_110132_b(this);

            int copyCount = Math.min(oldChest.getSizeInventory(), this.inv.getSizeInventory());

            for (int j = 0; j < copyCount; ++j)
            {
                ItemStack itemstack = oldChest.getStackInSlot(j);

                if (itemstack != null)
                {
                    this.inv.setInventorySlotContents(j, itemstack.copy());
                }
            }

            oldChest = null;
        }

        this.inv.func_110134_a(this);
    }


    /**
     * Called by InventoryBasic.onInventoryChanged() on a array that is never filled.
     */
    public void onInventoryChanged(InventoryBasic p_76316_1_) {}

    @Override
    public void onEntityDestruction(DamageSource damagesource) {
        if (inv != null) {
            for (int i = 0; i < inv.getSizeInventory(); ++i) {
                ItemStack itemstack = inv.getStackInSlot(i);

                if (itemstack != null) {
                    this.entityDropItem(itemstack, 0.0F);
                }
            }
        }
    }


    @Override
    public void writeToNBT(NBTTagCompound tag){
        super.writeToNBT(tag);

        NBTTagList nbttaglist = new NBTTagList();

        if(inv!=null) {
            for (int i = 0; i < this.inv.getSizeInventory(); ++i) {
                ItemStack itemstack = this.inv.getStackInSlot(i);

                if (itemstack != null) {
                    NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                    nbttagcompound1.setByte("Slot", (byte) i);
                    itemstack.writeToNBT(nbttagcompound1);
                    nbttaglist.appendTag(nbttagcompound1);
                }
            }

            tag.setTag("Items", nbttaglist);
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound tag){
        super.readFromNBT(tag);
        if (tag.hasKey("Items")) {
            NBTTagList nbttaglist = tag.getTagList("Items", Constants.NBT.TAG_COMPOUND);

            for (int i = 0; i < nbttaglist.tagCount(); ++i) {
                NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
                int slot = nbttagcompound1.getByte("Slot") & 255;

                if (slot >= 0 && slot < getMaxSlots()) {
                    this.inv.setInventorySlotContents(slot, ItemStack.loadItemStackFromNBT(nbttagcompound1));
                }
            }
        }
    }

    @Override
    public boolean interactFirst(EntityPlayer player) {
        if (super.interactFirst(player)) return true;

        player.openGui(FoxDrives.instance, getEntityId(), worldObj, 0, 0, 0);
        return true;
    }

    //redirect all inventory logic to the AnimalChest
    public int getSizeInventory() { return inv.getSizeInventory(); }

    public ItemStack getStackInSlot(int slotNum) {return inv.getStackInSlot(slotNum); }

    public ItemStack decrStackSize(int slotNUm, int amt) { return inv.decrStackSize(slotNUm, amt); }

    public ItemStack getStackInSlotOnClosing(int slotNum) { return inv.getStackInSlotOnClosing(slotNum); }

    public void setInventorySlotContents(int slotNum, ItemStack itemStack) { inv.setInventorySlotContents(slotNum,itemStack); }

    public final String getInventoryName() { return inv.getInventoryName(); }

    public boolean hasCustomInventoryName() { return inv.hasCustomInventoryName(); }

    public int getInventoryStackLimit() { return inv.getInventoryStackLimit(); }

    public void markDirty() { inv.markDirty(); }

    public boolean isUseableByPlayer(EntityPlayer player) { return inv.isUseableByPlayer(player); }

    public void openInventory() { inv.openInventory(); }

    public void closeInventory() { inv.closeInventory(); }
    public boolean isItemValidForSlot(int i, ItemStack itemStack) { return ItemHandler.handleFreight(this, itemStack); }


    // implements IInventoryEntity
    public boolean transportHasCustomInventoryName(){return inv.hasCustomInventoryName();}

    @Override
    public final float getDistanceToTransport(Entity entity)
    {
        return ((float) this.getDistanceSqToEntity(entity));
    }

    public final boolean isTransportAlive()
    {
        return super.isEntityAlive();
    }

    public String getTransportInventoryName(){return inv.getInventoryName();}
    public int getTransportSizeInventory(){return getSizeInventory();}
    public IInventory getTransportInventory() { return inv; }
}
