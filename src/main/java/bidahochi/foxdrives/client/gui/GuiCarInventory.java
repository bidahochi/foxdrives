package bidahochi.foxdrives.client.gui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.genericButtons.GuiCustomButton;
import bidahochi.foxdrives.client.gui.specialButtons.TransportLockGuiHandler;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.common.inventory.containers.ContainerStyleOneInventory;
import bidahochi.foxdrives.common.inventory.enums.InventorySize;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiCarInventory extends BaseGuiContainer
{
    public EntityCarChest car;
    public static int guiTop;
    public static int guiLeft;

    public GuiCarInventory(IInventory player, EntityCarChest transport)
    {
        super(new ContainerStyleOneInventory(player, transport), player);
        this.car = transport;
        this.allowUserInput = false;
        setBaseGui(new ResourceLocation(FoxDrives.MODID, "textures/gui/gui_car/style1/" + getBackgroundImage(transport.type().inventorySize) + ".png"));
        setBaseButtonStyle(new ResourceLocation(FoxDrives.MODID, "textures/gui/buttons/gui_buttons_style1.png"));
        xSize = 225;
        ySize = 185;
    }

    private String getBackgroundImage(InventorySize inventorySize)
    {
        switch (inventorySize)
        {
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
    public EntityCar getEntityCar()
    {
        return car;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        // Vehicle Name
        this.fontRendererObj.drawString(this.car.hasCustomInventoryName() ? this.car.getInventoryName() : I18n.format(this.car.getInventoryName(), new Object[0]), 75, 7, 4210752);

        // Inventory Name
        this.fontRendererObj.drawString(this.Player.hasCustomInventoryName() ? this.Player.getInventoryName() : I18n.format(this.Player.getInventoryName(), new Object[0]),8, 90, 4210752);

        if (getEntityCar().getTurnSignalTick() == 1)
        {
            switch (getEntityCar().getTurnSignalDirection())
            {
                case -1:
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    this.mc.getTextureManager().bindTexture(baseButtonStyle);
                    this.drawTexturedModalRect(8, 7,  0, 0, 7, 7);
                    break;
                case 1:
                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                    this.mc.getTextureManager().bindTexture(baseButtonStyle);
                    this.drawTexturedModalRect(62, 7,  54, 0, 7, 7);
                    break;
            }
        }

        if (getEntityCar().isBeaconEnabled())
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(baseButtonStyle);
            this.drawTexturedModalRect(26, 7,  18, 0, 7, 7);
        }

        if (getEntityCar().isAuxLightsEnabled())
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(baseButtonStyle);
            this.drawTexturedModalRect(35, 7,  27, 0, 7, 7);
        }

        if (getEntityCar().isLightsEnabled())
        {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.mc.getTextureManager().bindTexture(baseButtonStyle);
            this.drawTexturedModalRect(44, 7,  36, 0, 7, 7);
        }
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

        //buttonList.add(new GuiCustomButton(11, topRowX, topRowY, 7, 7, "", baseButtonStyle, getEntityCar().isBeaconEnabled() ? 0 : 54, 22));

        int buttonColumnX = rowX + 176;
        int buttonColumnY = rowY + 90;
        short buttonSpace = 13 + 1;

        buttonList.add(new GuiCustomButton(1, buttonColumnX, buttonColumnY, 54, 13, "", baseButtonStyle, getEntityCar().getDataWatcher().getWatchableObjectByte(17)==(byte) 1? 0 : 54, 8));

        buttonList.add(new GuiCustomButton(11, buttonColumnX, buttonColumnY += buttonSpace, 54, 13, "", baseButtonStyle, getEntityCar().isBeaconEnabled() ? 0 : 54, 22));
        buttonList.add(new GuiCustomButton(10, buttonColumnX, buttonColumnY += buttonSpace, 54, 13, "", baseButtonStyle, getEntityCar().isLightsEnabled() ? 0 : 54, 50));
        buttonList.add(new GuiCustomButton(12, buttonColumnX, buttonColumnY += buttonSpace, 54, 13, "", baseButtonStyle, getEntityCar().isAuxLightsEnabled() ? 0 : 54, 36));
        GuiButton lockbutton = TransportLockGuiHandler.createLockButton(car, mc.thePlayer, baseButtonStyle, buttonColumnX, buttonColumnY, 0, buttonSpace, 60);
        if (lockbutton != null)
        {
            buttonList.add(lockbutton);
        }
    }
}
