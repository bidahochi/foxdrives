package bidahochi.foxdrives.client.gui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.specialButtons.TransportLockGuiHandler;
import bidahochi.foxdrives.common.inventory.containers.ContainerStyleOneInventory;
import bidahochi.foxdrives.common.inventory.enums.InventorySize;
import bidahochi.foxdrives.entities.BaseEntityVehicle.IInventoryEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiTrailerInventory extends BaseGuiContainer {
    public IInventoryEntity trailer;
    public static int guiTop;
    public static int guiLeft;

    public GuiTrailerInventory(IInventory player, IInventoryEntity transport) {
        super(new ContainerStyleOneInventory(player, transport), player);
        this.trailer = transport;
        this.allowUserInput = false;
        setBaseGui(new ResourceLocation(FoxDrives.MODID, "textures/gui/gui_car/style1/" + getBackgroundImage(transport.type().getInventorySize()) + ".png"));
        setBaseButtonStyle(new ResourceLocation(FoxDrives.MODID, "textures/gui/buttons/gui_buttons_style1.png"));
        xSize = 225;
        ySize = 185;
    }

    private String getBackgroundImage(InventorySize inventorySize) {
        switch (inventorySize) {
            case STYLE_PROFILE_3x3:
                return "3x3_gui_car";
            case STYLE_PROFILE_3x5:
                return "3x5_gui_car";
            case STYLE_PROFILE_3x7:
                return "3x7_gui_car";
            case STYLE_PROFILE_3x9:
                return "3x9_gui_car";
        }

        return "0x0_gui_car";
    }

    @Override
    public IInventoryEntity getEntityCar() { return trailer; }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        // Vehicle Name
        this.fontRendererObj.drawString(this.trailer.transportHasCustomInventoryName() ? this.trailer.getTransportInventoryName() : I18n.format(this.trailer.getTransportInventoryName(), new Object[0]), 75, 7, 4210752);

        // Inventory Name
        this.fontRendererObj.drawString(this.Player.hasCustomInventoryName() ? this.Player.getInventoryName() : I18n.format(this.Player.getInventoryName(), new Object[0]),8, 90, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float screenWidth, int screenHeight, int p_146976_3_) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(baseGui);

        guiLeft = (this.width - this.xSize) / 2;
        guiTop = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);

        //these fix positions for the scaled position
        guiLeft = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledWidth();
        guiTop = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight).getScaledHeight();
    }

    @Override
    public void initGui() {
        super.initGui();
        buttonList.clear();
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
        int rowX = (this.width - xSize) / 2;
        int rowY = (this.height - ySize) / 2;
        buttonList.clear();

        int buttonColumnX = rowX + 176;
        int buttonColumnY = rowY + 90;
        short buttonSpace = 13 + 1;

        GuiButton lockbutton = TransportLockGuiHandler.createLockButton(trailer, mc.thePlayer, baseButtonStyle, buttonColumnX, buttonColumnY, 0, buttonSpace, 60);

        if (lockbutton != null) {
            buttonList.add(lockbutton);
        }
    }
}
