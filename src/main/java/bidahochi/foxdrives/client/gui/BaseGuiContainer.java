package bidahochi.foxdrives.client.gui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.gui.specialButtons.TransportLockGuiHandler;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.util.PacketInteract;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public abstract class BaseGuiContainer extends GuiContainer
{
    public static int guiTop;
    public static int guiLeft;

    protected IInventory Player;

    protected ResourceLocation baseGui;
    protected ResourceLocation baseButtonStyle;

    public abstract EntityCar getEntityCar();

    public BaseGuiContainer(Container container, IInventory player)
    {
        super(container);
        Player = player;
    }

    public void setBaseGui(ResourceLocation resourceLocation)
    {
        baseGui = resourceLocation;
    }

    public void setBaseButtonStyle(ResourceLocation resourceLocation)
    {
        baseButtonStyle = resourceLocation;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {

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
                TransportLockGuiHandler.handleLockButton(this, button, Minecraft.getMinecraft().thePlayer, getEntityCar(), isShiftKeyDown());
                break;

        }
    }

    @Override
    public boolean doesGuiPauseGame()
    {
        return false;
    }
}
