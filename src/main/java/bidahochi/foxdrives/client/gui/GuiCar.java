package bidahochi.foxdrives.client.gui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

@Deprecated
public class GuiCar extends BaseGuiContainer {
    public static int guiTop;
    public static int guiLeft;
    public EntityCar entity;
    private GuiButton button;

    public GuiCar(EntityCar car)
    {
        super(new Container()
        {
            @Override
            public boolean canInteractWith(EntityPlayer player){
                return !player.isDead;
            }
        }, null);
        entity = car;
        setBaseGui(new ResourceLocation(FoxDrives.MODID, "textures/gui/gui_car.png"));
    }

    @Override
    public void initGui() {
        buttonList.clear();
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();


    }

    @Override
    public EntityCar getEntityCar()
    {
        return entity;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float t, int x, int y){
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
    {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
        int pos1 = (this.width - xSize) / 2;
        int pos2 = (this.height - ySize) / 2;
        buttonList.clear();
        int buttonHeight = 14;
        int rowOnePos1 = pos1 - 40;
        int rowOnePos2 = pos2 + 166;
        buttonList.add(
                new GuiButton( 1,rowOnePos1,rowOnePos2, 50,buttonHeight,
                        entity.getDataWatcher().getWatchableObjectByte(17)==(byte) 1 ?"Turn Off":"Turn On"));
        buttonList.add(
                new GuiButton( 10,rowOnePos1 += 50,rowOnePos2, 80,buttonHeight,
                        entity.isLightsEnabled() ? "Headlights On" : "Headlights Off"));
        buttonList.add(
                new GuiButton( 11,rowOnePos1 += 80,rowOnePos2, 80,buttonHeight,
                        entity.isBeaconEnabled() ? "Beacons On" : "Beacons Off"));
        buttonList.add(
                new GuiButton( 12,rowOnePos1 += 80,rowOnePos2, 80,buttonHeight,
                        entity.isAuxLightsEnabled() ? "DitchLights On" : "DitchLights Off"));
       // GuiButton lockbutton = TransportLockGuiHandler.createLockButton(entity, mc.thePlayer, rowOnePos1, rowOnePos2, 0, 20, 51);

       //if (lockbutton != null)
       //{
       //    buttonList.add(lockbutton);
       //}
    }

    public static int percentTop(int value)
    {
        return (int)
            (guiTop*(value*0.01f));
    }
    public static int percentLeft(int value)
    {
        return (int) (guiLeft*(value*0.01f));}
}
