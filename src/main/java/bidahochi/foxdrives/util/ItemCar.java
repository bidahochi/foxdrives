package bidahochi.foxdrives.util;

import bidahochi.foxdrives.CarType;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemCar extends Item {
    /**the class for the entity*/
    private final CarType transport;


    /**the main constructor.
     * @param cart the class for the entity*/
    public ItemCar(CarType cart, String MODID, CreativeTabs tabs) {
        super();
        transport=cart;
        setTextureName(MODID+":transports/"+getUnlocalizedName());
        setCreativeTab(tabs);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("\u00a77" + "Pack: " + GetContentPackName());

        if (transport.year != null)
        {
            par3List.add("\u00a77" + "Year: " + transport.year);
        }

        if (transport.country != null)
        {
            par3List.add("\u00a77" + "Country: " + transport.country);
        }


        if (par1ItemStack.hasTagCompound())
        {
            NBTTagCompound var5 = par1ItemStack.getTagCompound();
            String creator = var5.getString("trainCreator");

			/*if (id > 0)
				par3List.add("\u00a77" + "ID: " + id);*/
            if (creator.length() > 0) {
                par3List.add("\u00a77" + "Creator: " + creator);
            }
            int color = var5.getInteger("skin");
            if (var5.hasKey("skin"))
            {
                int actualPos = 0;

                if (false)
                {
                    par3List.add("\u00a77" + "Scheme: " + "BIT");
                }
                else
                {
                    par3List.add("\u00a77" + "Color: " + color);
                }
            }
        }
    }

    @Override
    public boolean onItemUse(ItemStack itemStack, EntityPlayer playerEntity, World worldObj, int posX, int posY, int posZ, int blockSide, float pointToRayX, float pointToRayY, float pointToRayZ) {
        if(worldObj.isRemote)
        {
            return true;
        }
        try
        {
            EntityCar ent = transport.clazz.getConstructor(World.class)
                    .newInstance(worldObj);

            ent.setPosition(posX + 0.5D, posY+1, posZ + 0.5D);
            ent.motionX = 0.0D;
            ent.motionY = 0.0D;
            ent.motionZ = 0.0D;
            ent.prevPosX = posX;
            ent.prevPosY = posY;
            ent.prevPosZ = posZ;

            ent.rotationYaw = playerEntity.rotationYaw;
            ent.getDataWatcher().updateObject(21, ent.rotationYaw);

            ent.setTransportOwner(playerEntity.getDisplayName());

            if (itemStack.hasTagCompound())
            {
                NBTTagCompound nbt = itemStack.getTagCompound();

                if (nbt.hasKey("skin"))
                {
                    ent.getDataWatcher().updateObject(FoxDrivesConstants.DW_SKIN, nbt.getInteger("skin"));
                }

                ent.importTrustedListFromNBT(nbt);
            }

            ent.getDataWatcher().updateObject(FoxDrivesConstants.DW_VEHICLEDATAJSON, ent.vehicleDataJSON());
            worldObj.spawnEntityInWorld(ent);

            if (!playerEntity.capabilities.isCreativeMode) {
                itemStack.stackSize--;
                if (itemStack.stackSize <= 0) {
                    itemStack = null;
                }
            }
            return true;
        } catch (Exception ignored){ignored.printStackTrace();}
        return true;
    }

    private void onEntitySpawn()
    {

    }

    public static ItemStack setPersistentData(@Nullable ItemStack oldStack, @Nullable EntityCar car)
    {
        ItemStack stack = oldStack;
        if (stack != null)
        {
            NBTTagCompound tag = stack.getTagCompound();
            if (tag == null) {
                tag = new NBTTagCompound();
            }

            if (car != null)
            {
                tag.setString("vehicleCreator", car.vehicleCreator == null ? car.getEntityData().getString("theCreator") : car.vehicleCreator);
                if (car.getSkin() != -1)
                {
                    tag.setInteger("skin",  car.getSkin());
                }

            }
            stack.setTagCompound(tag);
            return stack;
        }

        return null;
    }


    // Data Grab
    public String GetContentPackName()
    {
        return "FoxDrives - Base";
    }
}
