package bidahochi.foxdrives.client;


import bidahochi.foxdrives.client.gui.GuiIDs;
import bidahochi.foxdrives.client.gui.GuiTrailerInventory;
import bidahochi.foxdrives.client.gui.lockGui.GuiLockMenu;
import bidahochi.foxdrives.entities.BaseEntityVehicle.*;
import bidahochi.foxdrives.entities.EntitySeat;
import bidahochi.foxdrives.client.gui.GuiCarInventory;
import bidahochi.foxdrives.util.CommonProxy;
import bidahochi.foxdrives.util.RenderCar;
import bidahochi.foxdrives.util.RenderSeat;
import bidahochi.foxdrives.util.wrapgui.GuiWrap;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import foxmods.playerscale.DelegatingRenderPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy
{

    public static final RenderCar transportRenderer = new RenderCar();
    /**the keybind for opening the inventory*/
    public static KeyBinding KeyInventory = new KeyBinding("Open vehicle GUI",  Keyboard.KEY_X, "FoxDrives");
    public static KeyBinding KeyBrake = new KeyBinding("Brakelights",  Keyboard.KEY_C, "FoxDrives");
    public static KeyBinding KeyLeftTurn = new KeyBinding("Left Turn Indicator",  Keyboard.KEY_LEFT, "FoxDrives");
    public static KeyBinding KeyRightTurn = new KeyBinding("Right Turn Indicator",  Keyboard.KEY_RIGHT, "FoxDrives");
    public static KeyBinding KeyHitch = new KeyBinding("Toggle Hitch",  Keyboard.KEY_L, "FoxDrives");

    @Override
    public Object getEntityRender(){return transportRenderer;}

    @Override
    public boolean isClient(){return true;}

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        System.out.println("Open client");
        Entity entity = world.getEntityByID(x);
        switch (ID)
        {
            case GuiIDs.WRAP_MENU:
                return entity != null ? new GuiWrap(player, (IWrappable) entity) : null;
            case GuiIDs.LOCK_MENU:
                if (entity != null) { // If player is riding the entity (locomotives).
                    return new GuiLockMenu(player, (IInventoryEntity) entity);
                } else { // If player is not riding the entity (freight).
                    return entity != null ? new GuiLockMenu(player, ((IInventoryEntity) entity)) : null;
                }
            default:
                if (player.worldObj.getEntityByID(ID) instanceof EntityCarChest) {
                    System.out.println("Open client");
                    return new GuiCarInventory(player.inventory, (IInventoryEntity) player.worldObj.getEntityByID(ID));
                } else if (player.worldObj.getEntityByID(ID) instanceof AbstractTowingChildChest) {
                    System.out.println("Open client");
                    return new GuiTrailerInventory(player.inventory, (AbstractTowingChildChest) player.worldObj.getEntityByID(ID));
                }
                return null;
        }
    }

    @Override
    public void registerCarRenderer(Class<? extends EntityCar> clazz){
        RenderingRegistry.registerEntityRenderingHandler(clazz, transportRenderer);
    }

    @Override
    public void registerTrailerRenderer(Class<? extends EntityTrailer> clazz){
        RenderingRegistry.registerEntityRenderingHandler(clazz, transportRenderer);
    }

    @Override
    public void registerPlayerScaler()
    {
        //RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, playerRender);
        DelegatingRenderPlayer.registerRenderer();

        DelegatingRenderPlayer.registerDelegate(new DelegatingRenderPlayer.Delegate()
        {
            EntityCar car;
            @Override
            public boolean doRender(net.minecraft.client.entity.AbstractClientPlayer player, double x, double y, double z, float f0, float f1){
                if(player.ridingEntity instanceof EntitySeat || player.ridingEntity instanceof EntityCar)
                {
                    car = (EntityCar)(player.ridingEntity instanceof EntityCar ? player.ridingEntity : ((EntitySeat)player.ridingEntity).car);
                    if(car != null){
                        GL11.glPushMatrix();
                        float scale = car.type().rider_scale;
                        scale = player.height * scale / player.height;
                        GL11.glTranslated(x, (y + .35), z);
                        GL11.glScalef(scale, scale, scale);
                        GL11.glTranslated(-x, -(y + .35), -z);
                        if (player != Minecraft.getMinecraft().thePlayer && car.type().rider_scale != 1) {
                            GL11.glTranslated(0, 1 - (car.type().rider_scale + 0.2), 0); //rough approx. but gets the job done for everything in range 0.5-1
                        } else {
                            GL11.glTranslated(0, (0.6 - car.type().rider_scale) * -1, 0); //rough approx. but gets the job done for everything in range 0.5-1
                        }

                        return true;
                    }

                }

                return false;
            }

        });


        RenderingRegistry.registerEntityRenderingHandler(EntitySeat.class, new RenderSeat());
        //RenderingRegistry.registerEntityRenderingHandler(EntityReceiver.class, new RenderSeat());
    }

}
