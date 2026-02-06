package bidahochi.foxdrives.entities.BaseEntityVehicle;

import bidahochi.foxdrives.FoxDrives;
import cpw.mods.fml.common.gameevent.InputEvent;
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

public abstract class EntityCarChest extends EntityCar implements IInventory, IInvBasic {

    AnimalChest inv;

    /**
     * client side entity spawn
     *
     * @param world
     */
    public EntityCarChest(World world)
    {
        super(world);
        this.func_110226_cD();
    }

    public final int getMaxSlots()
    {
        return 2 + type().inventorySize.SlotCount;
    }

    private void func_110226_cD() {
        AnimalChest animalchest = this.inv;
        this.inv = new AnimalChest("inv", this.getMaxSlots());
        this.inv.func_110133_a(this.getCommandSenderName());

        if (animalchest != null) {
            animalchest.func_110132_b(this);
            int i = Math.min(animalchest.getSizeInventory(), this.inv.getSizeInventory());

            for (int j = 0; j < i; ++j)
            {
                ItemStack itemstack = animalchest.getStackInSlot(j);

                if (itemstack != null)
                {
                    this.inv.setInventorySlotContents(j, itemstack.copy());
                }
            }

            animalchest = null;
        }

        this.inv.func_110134_a(this);
    }


    /**
     * Called by InventoryBasic.onInventoryChanged() on a array that is never filled.
     */
    public void onInventoryChanged(InventoryBasic p_76316_1_) {}

    @Override
    public void onEntityDestruction(DamageSource damagesource)
    {
        if (inv != null)
        {
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
            for (int i = 2; i < this.inv.getSizeInventory(); ++i) {
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
        if(tag.hasKey("Items")) {
            NBTTagList nbttaglist = tag.getTagList("Items", 10);
            this.func_110226_cD();

            for (int i = 0; i < nbttaglist.tagCount(); ++i) {
                NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
                int j = nbttagcompound1.getByte("Slot") & 255;

                if (j >= 2 && j < getMaxSlots()) {
                    this.inv.setInventorySlotContents(j, ItemStack.loadItemStackFromNBT(nbttagcompound1));
                }
            }
        }
    }

    /**
     * handles interaction from client over network.
     * @see bidahochi.foxdrives.util.PacketInteract
     * @see bidahochi.foxdrives.util.EventManager#onClientKeyPress(InputEvent.MouseInputEvent) */
    @Override
    public void networkInteract(int player, int key) {
        if (!worldObj.isRemote) {
            if(key==2){//open inventory
                System.out.println("Open inv");
                ((EntityPlayer)worldObj.getEntityByID(player)).openGui(FoxDrives.instance, getEntityId(), worldObj, 0, 0, 0);
            }
            else super.networkInteract(player, key);
        }
    }



    //redirect all inventory logic to the AnimalChest
    public int getSizeInventory(){return inv.getSizeInventory();}
    public ItemStack getStackInSlot(int p_70301_1_){return inv.getStackInSlot(p_70301_1_);}
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_){return inv.decrStackSize(p_70298_1_,p_70298_2_);}
    public ItemStack getStackInSlotOnClosing(int p_70304_1_){return inv.getStackInSlotOnClosing(p_70304_1_);}
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_){inv.setInventorySlotContents(p_70299_1_,p_70299_2_);}
    public String getInventoryName(){return inv.getInventoryName();}
    public boolean hasCustomInventoryName(){return inv.hasCustomInventoryName();}
    public int getInventoryStackLimit(){return inv.getInventoryStackLimit();}
    public void markDirty(){inv.markDirty();}
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_){return inv.isUseableByPlayer(p_70300_1_);}
    public void openInventory(){inv.openInventory();}
    public void closeInventory(){inv.closeInventory();}
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_){return inv.isItemValidForSlot(p_94041_1_,p_94041_2_);}
}
