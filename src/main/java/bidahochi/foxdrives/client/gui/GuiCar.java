package bidahochi.foxdrives.client.gui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.specialButtons.TransportLockGuiHandler;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.util.PacketInteract;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class GuiCar extends GuiContainer {
    public static int guiTop;
    public static int guiLeft;
    public EntityCar entity;
    private GuiButton button;

    public GuiCar(EntityCar car){
        super(new Container() {
            @Override
            public boolean canInteractWith(EntityPlayer player){
                return !player.isDead;
            }
        });
        entity = car;
    }

    @Override
    public void initGui() {
        buttonList.clear();
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();


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
                        entity.isDitchLightsEnabled() ? "DitchLights On" : "DitchLights Off"));
        buttonList.add(
                TransportLockGuiHandler.createLockButton(entity, mc.thePlayer, rowOnePos1, rowOnePos2, 0, 20, 51));

    }

    @Override
    protected void actionPerformed(GuiButton button)
    {
        switch (button.id)
        {
            case 1:
            case 10:
            case 11:
            case 12:
                FoxDrives.interactChannel.sendToServer(new PacketInteract(button.id,Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            break;
            case 50:
                TransportLockGuiHandler.handleLockButton(this, button, Minecraft.getMinecraft().thePlayer, entity, isShiftKeyDown());
                break;

        }
    }


    public static int percentTop(int value)
    {
        return (int)
            (guiTop*(value*0.01f));
    }
    public static int percentLeft(int value)
    {
        return (int) (guiLeft*(value*0.01f));}

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
