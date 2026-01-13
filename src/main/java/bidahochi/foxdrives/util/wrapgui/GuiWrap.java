package bidahochi.foxdrives.util.wrapgui;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.util.ConfigHandler;
import bidahochi.foxdrives.util.PacketWrapColor;
import bidahochi.foxdrives.util.RenderCar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import static bidahochi.foxdrives.util.FoxDrivesConstants.DW_SKIN;

/**
 * @author 02skaplan
 * <p>GUI for Wrap Item</p>
 */
@SuppressWarnings("unchecked")
@SideOnly(Side.CLIENT)
public class GuiWrap extends GuiScreen {
    private final EntityPlayer editingPlayer;
    private final EntityCar car;
    private final EntityCar renderEntity;
    private float yaw = 0.0f;
    final private int MENU_TEXTURE_WIDTH = 206;
    final private int MENU_TEXTURE_HEIGHT = 200;
    final private int RESULTS_PER_PAGE = 8;
    /**
     * X-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_X;
    /**
     * X-coordinate of top center of GUI.
     */
    private int GUI_ANCHOR_MID_X;
    /**
     * Y-coordinate of top left of GUI.
     */
    private int GUI_ANCHOR_Y;
    private boolean hasNextPage;

    private GuiButtonWrap arrowUp;
    private GuiButtonWrap arrowDown;
    private GuiButtonWrap textureOne;
    private GuiButtonWrap textureTwo;
    private GuiButtonWrap textureThree;
    private GuiButtonWrap textureFour;
    private GuiButtonWrap textureFive;
    private GuiButtonWrap textureSix;
    private GuiButtonWrap textureSeven;
    private GuiButtonWrap textureEight;
    private GuiButtonWrap closeMenuButton;
    private GuiButtonWrap playPauseButton;
    private GuiButtonWrap lightControlButton;
    private GuiButtonWrap renderModelsButton;
    private boolean renderModels;
    private boolean disableLighting = true;
    private int optionsOnCurrentPage;
    private final int totalOptions;
    private int currentPage = 0;
    private boolean doAnimation;
    ResourceLocation rightMenuTexture = new ResourceLocation(FoxDrives.MODID + ":textures/gui/gui_paintbrush_menu_right.png");
    ResourceLocation leftMenuTexture = new ResourceLocation(FoxDrives.MODID + ":textures/gui/gui_paintbrush_menu_left.png");
    private final float renderScale;

    public GuiWrap(EntityPlayer editingPlayer, EntityCar car) {
        this.editingPlayer = editingPlayer;
        this.car = car;
        renderScale = car.getGuiRenderScale();
        totalOptions = car.getSkins().length;
        currentPage = (car.getDataWatcher().getWatchableObjectInt(DW_SKIN)) / RESULTS_PER_PAGE;
        try {
            renderEntity = (EntityCar) car.getClass().getConstructor(World.class).newInstance(car.worldObj);
        }
        catch (NoSuchMethodException noSuchMethodException)
        {
            FoxDrives.fdLog.fatal("YOU ARE MISSING THE CONSTRUCTOR THAT PASSES WORLD " + car.getClass().getName());
            throw new RuntimeException(noSuchMethodException);
        }
        catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
        hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
        renderModels = true;
        doAnimation = ConfigHandler.DO_WRAP_ANIMATION;
    }

    /**
     * Initial setup for buttons and GUI anchors.
     */
    @Override
    public void initGui() {
        GUI_ANCHOR_MID_X = (this.width) / 2;
        GUI_ANCHOR_Y = (this.height) / 2 - ((MENU_TEXTURE_HEIGHT) / 2);
        GUI_ANCHOR_X = GUI_ANCHOR_MID_X - MENU_TEXTURE_WIDTH;
        this.buttonList.clear();
        this.buttonList.add(this.arrowUp = new GuiButtonWrap(0, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 37, 12, 38, GuiButtonWrap.Type.ARROWUP));
        this.buttonList.add(this.arrowDown = new GuiButtonWrap(1, GUI_ANCHOR_X + 388, GUI_ANCHOR_Y + 79, 12, 38, GuiButtonWrap.Type.ARROWDOWN));
        this.buttonList.add(this.renderModelsButton = new GuiButtonWrap(2, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 53, 22, 22, GuiButtonWrap.Type.STOPRENDER));

        this.buttonList.add(this.textureOne = new GuiButtonWrap(3, GUI_ANCHOR_X + 10, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.textureTwo = new GuiButtonWrap(4, GUI_ANCHOR_X + 104, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.textureThree = new GuiButtonWrap(5, GUI_ANCHOR_X + 198, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.textureFour = new GuiButtonWrap(6, GUI_ANCHOR_X + 292, GUI_ANCHOR_Y + 12, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.textureFive = new GuiButtonWrap(7, GUI_ANCHOR_X + 10, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.textureSix = new GuiButtonWrap(8, GUI_ANCHOR_X + 104, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.textureSeven = new GuiButtonWrap(9, GUI_ANCHOR_X + 198, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.textureEight = new GuiButtonWrap(10, GUI_ANCHOR_X + 292, GUI_ANCHOR_Y + 103, 85, 85, GuiButtonWrap.Type.SELECTIONBOX));
        this.buttonList.add(this.closeMenuButton = new GuiButtonWrap(14, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + 10, 22, 22, GuiButtonWrap.Type.CLOSE));
        this.buttonList.add(this.playPauseButton = new GuiButtonWrap(15, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 29, 22, 22, GuiButtonWrap.Type.PLAY));
        this.buttonList.add(this.lightControlButton = new GuiButtonWrap(16, GUI_ANCHOR_X + 382, GUI_ANCHOR_Y + MENU_TEXTURE_HEIGHT - 77, 22, 22, GuiButtonWrap.Type.LIGHTSOFF));
        this.updateButtons();
    }

    private void updateButtons() {
        this.arrowUp.visible = (currentPage != 0);
        this.arrowUp.showButton = (currentPage != 0);
        this.arrowDown.visible = hasNextPage;
        this.arrowDown.showButton = hasNextPage;
        this.textureOne.showButton = true;
        this.textureOne.visible = true;
        this.textureTwo.showButton = optionsOnCurrentPage > 1;
        this.textureTwo.visible = optionsOnCurrentPage > 1;
        this.textureThree.showButton = optionsOnCurrentPage > 2;
        this.textureThree.visible = optionsOnCurrentPage > 2;
        this.textureFour.showButton = optionsOnCurrentPage > 3;
        this.textureFour.visible = optionsOnCurrentPage > 3;
        this.textureFive.showButton = optionsOnCurrentPage > 4;
        this.textureFive.visible = optionsOnCurrentPage > 4;
        this.textureSix.showButton = optionsOnCurrentPage > 5;
        this.textureSix.visible = optionsOnCurrentPage > 5;
        this.textureSeven.showButton = optionsOnCurrentPage > 6;
        this.textureSeven.visible = optionsOnCurrentPage > 6;
        this.textureEight.showButton = optionsOnCurrentPage > 7;
        this.textureEight.visible = optionsOnCurrentPage > 7;
        this.closeMenuButton.visible = true;
        this.closeMenuButton.showButton = true;
        this.playPauseButton.visible = renderModels;
        this.playPauseButton.showButton = renderModels;
        this.playPauseButton.setType(doAnimation ? GuiButtonWrap.Type.PLAY : GuiButtonWrap.Type.PAUSE, playPauseButton.getTexture());
        this.lightControlButton.showButton = renderModels;
        this.lightControlButton.visible = renderModels;
        this.lightControlButton.setType(disableLighting ? GuiButtonWrap.Type.LIGHTSON : GuiButtonWrap.Type.LIGHTSOFF, lightControlButton.getTexture());

        this.renderModelsButton.visible = true;
        this.renderModelsButton.showButton = true;
        this.renderModelsButton.setType(renderModels ? GuiButtonWrap.Type.STOPRENDER : GuiButtonWrap.Type.PLAY, renderModelsButton.getTexture());
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float par3) {
        RenderHelper.disableStandardItemLighting();
        // Draw background.
        mc.renderEngine.bindTexture(rightMenuTexture);
        this.drawTexturedModalRect(GUI_ANCHOR_MID_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);
        mc.renderEngine.bindTexture(leftMenuTexture);
        this.drawTexturedModalRect(GUI_ANCHOR_X, GUI_ANCHOR_Y, 0, 0, MENU_TEXTURE_WIDTH, MENU_TEXTURE_HEIGHT);

        super.drawScreen(mouseX, mouseY, par3);

        int loopRenderColor;
        if (renderModels) {
            RenderCar.setRenderModeGUI(true);
            RenderCar.setRenderGUIFullBright(disableLighting);
            // Rolling stock pieces with more than one bogie need offset based on bogie position to render properly.
            float offsetX = GUI_ANCHOR_X;
            float offsetY = GUI_ANCHOR_Y + 12;
            // Display the model with each texture.

            for (int i = 0; i < optionsOnCurrentPage; i++) {
                loopRenderColor = i + RESULTS_PER_PAGE * currentPage;
                renderEntity.getDataWatcher().updateObject(DW_SKIN, loopRenderColor);
                // Set the button to active or inactive depending on whether the texture is active.
                ((GuiButtonWrap) this.buttonList.get(i + 3)).setType(GuiButtonWrap.Type.SELECTIONBOX, (loopRenderColor == car.getDataWatcher().getWatchableObjectInt(DW_SKIN)) ? GuiButtonWrap.Texture.ACTIVE : GuiButtonWrap.Texture.INACTIVE);
                GL11.glColor4f(1, 1, 1, 1);
                GL11.glPushMatrix();
                GL11.glTranslated(offsetX + 50, offsetY + 60, 400);
                GL11.glScalef(-renderScale, renderScale, renderScale);
                GL11.glRotatef(180, 0, 0, 1);
                GL11.glRotatef(yaw, 0, 1, 0);
                RenderManager.instance.renderEntityWithPosYaw(renderEntity, car.yOffset, 0, 0, 0, 0);
                GL11.glPopMatrix();

                offsetX += 95;
                if (offsetX > GUI_ANCHOR_X + 292) {
                    offsetX = GUI_ANCHOR_X;
                    offsetY += 92;
                }
            }
            RenderCar.setRenderModeGUI(false);

            // Handle rotation of entity(s) in GUI.
            if (doAnimation) {
                yaw += 0.5F;
            }
        }

        if (!renderModels) {
            float offsetX = GUI_ANCHOR_X + 13;
            float offsetY = GUI_ANCHOR_Y + 44;
            String colorName;
            final int fontColor = new Color(0, 0, 0).getRGB();
            for (int i = 0; i < optionsOnCurrentPage; i++) {
                loopRenderColor = i + RESULTS_PER_PAGE * currentPage;
                ((GuiButtonWrap) this.buttonList.get(i + 3)).setType(GuiButtonWrap.Type.SELECTIONBOX, (loopRenderColor == car.getDataWatcher().getWatchableObjectInt(DW_SKIN)) ? GuiButtonWrap.Texture.ACTIVE : GuiButtonWrap.Texture.INACTIVE);
                if (car.textureDescriptionMap.containsKey(loopRenderColor))
                    colorName = car.textureDescriptionMap.get(loopRenderColor);
                else
                    colorName = car.getSkins()[car.getDataWatcher().getWatchableObjectInt(DW_SKIN)];
                fontRendererObj.drawSplitString(colorName, (int) ((offsetX + 14) - (0.5 * fontRendererObj.splitStringWidth(colorName, 82))), (int) offsetY, 82, fontColor);

                offsetX += 94;
                if (offsetX > GUI_ANCHOR_X + 322) {
                    offsetX = GUI_ANCHOR_X + 13;
                    offsetY += 92;
                }

            }
        }

        // Draw Hovering Tooltips
        // I split this up to hopefully reduce the amount of statements it has to process.
        if (mouseX > closeMenuButton.xPosition - 5) { // If mouse is on the right-hand side after the textures.
            if (closeMenuButton.getTexture() == GuiButtonWrap.Texture.ACTIVE)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Close Menu.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowUp.getTexture() == GuiButtonWrap.Texture.ACTIVE && arrowUp.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Previous Page.name")), mouseX, mouseY, fontRendererObj);
            else if (arrowDown.getTexture() == GuiButtonWrap.Texture.ACTIVE && arrowDown.visible)
                drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Next Page.name")), mouseX, mouseY, fontRendererObj);
            else if (playPauseButton.getTexture() == GuiButtonWrap.Texture.ACTIVE) {
                if (doAnimation)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Pause.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Play.name")), mouseX, mouseY, fontRendererObj);
            } else if (lightControlButton.getTexture() == GuiButtonWrap.Texture.ACTIVE) {
                if (!disableLighting)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Lights On.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Lights Off.name")), mouseX, mouseY, fontRendererObj);
            } else if (renderModelsButton.getTexture() == GuiButtonWrap.Texture.ACTIVE) {
                if (renderModels)
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Hide Models.name")), mouseX, mouseY, fontRendererObj);
                else
                    drawHoveringText(Collections.singletonList(StatCollector.translateToLocal("wrapmenu.Show Models.name")), mouseX, mouseY, fontRendererObj);
            }
        } else { // If the mouse is anywhere else on the screen...
            if (renderModels) {
                // Draw texture descriptions if they exist...
                if (!car.textureDescriptionMap.isEmpty()) {
                    GuiButtonWrap loopButton;
                    for (int i = 0; i < optionsOnCurrentPage; i++) {
                        loopRenderColor = i + RESULTS_PER_PAGE * currentPage;
                        loopButton = ((GuiButtonWrap) buttonList.get(i + 3));
                        if (mouseX > loopButton.xPosition && mouseX < loopButton.xPosition + loopButton.width && mouseY > loopButton.yPosition && mouseY < loopButton.yPosition + loopButton.height)
                            if (car.textureDescriptionMap.containsKey(loopRenderColor))
                                drawHoveringText(Collections.singletonList(car.textureDescriptionMap.get(loopRenderColor)), mouseX, mouseY, fontRendererObj);
                    }
                }
            }
        }
        RenderHelper.enableStandardItemLighting();
    }

    @Override
    protected void actionPerformed(GuiButton clickedButton) {
        if (clickedButton.enabled) {
            editingPlayer.playSound("random.click", 1f, 1f);
            // Select Color
            switch (clickedButton.id) {
                case 0:
                case 1: // Page up or down button.
                    if (clickedButton.id == 0) { // If page up...
                        currentPage--;
                    } else { // If page down...
                        currentPage++;
                    }
                    optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
                    hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
                    updateButtons();
                    break;
                case 2:
                    renderModels = !renderModels;
                    updateButtons();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10: // Color selection button.
                    int newColor = (currentPage * RESULTS_PER_PAGE) + (clickedButton.id - 3);
                    FoxDrives.wrapColorChannel.sendToServer(new PacketWrapColor(newColor, car.getEntityId()));
                    car.getDataWatcher().updateObject(DW_SKIN, newColor);
                    break;
                case 14:
                    this.mc.thePlayer.closeScreen();
                    break;
                case 15:
                    doAnimation = !doAnimation;
                    updateButtons();
                    break;
                case 16:
                    disableLighting = !disableLighting;
                    updateButtons();
                    break;
            }
        }
    }

    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
    }

    @Override
    protected void keyTyped(char eventChar, int eventKey) {
        if (eventKey == 1 || eventChar == 'e') { // If ESC...
            this.mc.thePlayer.closeScreen();
        } else {
            switch (eventChar) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8': {
                    if (Character.getNumericValue(eventChar) <= optionsOnCurrentPage) {
                        editingPlayer.playSound("random.click", 1f, 1f);
                        int newColor = (currentPage * RESULTS_PER_PAGE) + (Character.getNumericValue(eventChar) - 1);
                        FoxDrives.wrapColorChannel.sendToServer(new PacketWrapColor(newColor, car.getEntityId()));
                        car.getDataWatcher().updateObject(DW_SKIN, newColor);
                    }
                }
            }
        }
    }

    @Override
    public void handleMouseInput() {
        int mouseEvent = Mouse.getEventDWheel();
        if (mouseEvent != 0) {
            if (mouseEvent > 0) { // Scroll up.
                if (currentPage != 0) {
                    currentPage--;
                }
            } else { // Scroll down.
                if (hasNextPage) {
                    currentPage++;
                }
            }
            optionsOnCurrentPage = Math.min(RESULTS_PER_PAGE, totalOptions - currentPage * RESULTS_PER_PAGE);
            hasNextPage = optionsOnCurrentPage + RESULTS_PER_PAGE * currentPage < totalOptions;
            updateButtons();
        }
        super.handleMouseInput();
    }
}
