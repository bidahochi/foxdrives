package bidahochi.foxdrives.client.gui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.specialButtons.TransportLockGuiHandler;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.util.ContainerCarInventory;
import bidahochi.foxdrives.util.PacketInteract;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiCarInventory extends GuiContainer {
    private static final ResourceLocation horseGuiTextures = new ResourceLocation("textures/gui/container/horse.png");
    private IInventory player;
    public EntityCarChest car;
    public static int guiTop;
    public static int guiLeft;

    public GuiCarInventory(IInventory p_i1093_1_, EntityCarChest p_i1093_3_) {
        super(new ContainerCarInventory(p_i1093_1_, p_i1093_3_));
        this.player = p_i1093_1_;
        this.car = p_i1093_3_;
        this.allowUserInput = false;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        this.fontRendererObj.drawString(this.car.hasCustomInventoryName() ? this.car.getInventoryName() : I18n.format(this.car.getInventoryName(), new Object[0]), 8, 6, 4210752);
        this.fontRendererObj.drawString(this.player.hasCustomInventoryName() ? this.player.getInventoryName() : I18n.format(this.player.getInventoryName(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float screenWidth, int screenHeight, int p_146976_3_) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(horseGuiTextures);
        guiLeft = (this.width - this.xSize) / 2;
        guiTop = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(guiLeft,guiTop,  0, 0, this.xSize, this.ySize);

        this.drawTexturedModalRect(guiLeft + 79, guiTop + 17, 0, this.ySize, 90, 54);

        this.drawTexturedModalRect(guiLeft + 7, guiTop + 35, 0, this.ySize + 54, 18, 18);

        //GuiInventory.func_147046_a(guiLeft + 51, guiTop + 60, 17, (float)(guiLeft + 51) -
          //      screenWidth, (float)(guiTop + 75 - 50) - screenHeight, this.car);

        //these fix positions for the scaled position
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();

    }

    @Override
    public void initGui()
    {
        super.initGui();
        buttonList.clear();

    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
    {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
        int rowX = (this.width - xSize) / 2;
        int rowY = (this.height - ySize) / 2;
        buttonList.clear();
        int buttonHeight = 14;

        int topRowX = rowX + 108;
        int topRowY = rowY + -13;


        buttonList.add(
                new GuiButton( 1,topRowX,topRowY, 60,buttonHeight,
                        car.getDataWatcher().getWatchableObjectByte(17)==(byte) 1 ?"Turn Off" : "Turn On"));

        int rowOneX = rowX;
        int rowOneY = rowY + 166;
        int rowTwoY = rowY + 166 + buttonHeight;
        buttonList.add(
                new GuiButton( 10,rowOneX,rowOneY, 80,buttonHeight,
                        car.isLightsEnabled() ? "Headlights On" : "Headlights Off"));
        buttonList.add(
                new GuiButton( 12,rowOneX += 80,rowTwoY, 80,buttonHeight,
                        car.isDitchLightsEnabled() ? "DitchLights On" : "DitchLights Off"));
        buttonList.add(
                new GuiButton( 11,rowOneX,rowOneY, 80,buttonHeight,
                        car.isBeaconEnabled() ? "Beacons On" : "Beacons Off"));
        buttonList.add(
                TransportLockGuiHandler.createLockButton(car, mc.thePlayer, topRowX, topRowY, 0, -10, 60));;



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
                FoxDrives.interactChannel.sendToServer(new PacketInteract(button.id, Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            break;
            case 50:
                TransportLockGuiHandler.handleLockButton(this, button, Minecraft.getMinecraft().thePlayer, car, isShiftKeyDown());
                break;
        }
    }

    public static int percentTop(int value){return (int)(guiTop*(value*0.01f));}
    public static int percentLeft(int value){return (int)(guiLeft*(value*0.01f));}

    @Override
    public boolean doesGuiPauseGame() {
        return false;
    }
}
