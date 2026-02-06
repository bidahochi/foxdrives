package bidahochi.foxdrives.util;

import bidahochi.foxdrives.common.handlers.PlayerSyncHandler;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.common.inventory.containers.ContainerStyleOneInventory;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy implements IGuiHandler {

    public static String configDirectory = "";

    /**
     * Returns a Server side Container to be displayed to the user.
     *
     * @param ID     The Gui ID Number
     * @param player The player viewing the Gui
     * @param world  The current world
     * @param x      X Position
     * @param y      Y Position
     * @param z      Z Position
     * @return A GuiScreen/Container to be displayed to the user, null if none.
     */
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        //System.out.println("Open client");
        EntityPlayer riddenByEntity = null;
        Entity entity = player.ridingEntity;

        if (player.ridingEntity != null) {
            riddenByEntity = (EntityPlayer) entity.riddenByEntity;
        }

        if(player.worldObj.getEntityByID(ID) instanceof EntityCarChest)
        {
            System.out.println("OpenServer");
            return riddenByEntity != null ? new ContainerStyleOneInventory(riddenByEntity.inventory, (EntityCarChest) player.worldObj.getEntityByID(ID)) : null;
        }
        else
        {
            return new Container()
            {
                @Override
                public boolean canInteractWith(EntityPlayer player){
                    return !player.isDead;
                }
            };
        }
        //return null;
    }

    /**
     * Returns a Container to be displayed to the user. On the client side, this
     * needs to return a instance of GuiScreen On the server side, this needs to
     * return a instance of Container
     *
     * @param ID     The Gui ID Number
     * @param player The player viewing the Gui
     * @param world  The current world
     * @param x      X Position
     * @param y      Y Position
     * @param z      Z Position
     * @return A GuiScreen/Container to be displayed to the user, null if none.
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }


    public boolean isClient(){return false;}

    public Object getEntityRender(){return null;}

    public void registerCarRenderer(Class<? extends EntityCar> clazz){}

    public void registerPlayerScaler(){}

    public void registerPlayerSyncHandler()
    {
        PlayerSyncHandler playerSyncHandler = new PlayerSyncHandler();
        FMLCommonHandler.instance().bus().register(playerSyncHandler);
        MinecraftForge.EVENT_BUS.register(playerSyncHandler);
    }

}
