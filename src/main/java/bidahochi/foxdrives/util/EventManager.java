package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.client.ClientProxy;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCarChest;
import bidahochi.foxdrives.entities.EntitySeat;
import bidahochi.foxdrives.client.gui.GuiCar;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import foxmods.unifiedcontrols.client.SharedKeyState;
import foxmods.unifiedcontrols.client.UnifiedKeyRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;

public class EventManager {

    public static EventManager instance = new EventManager();

    //handles user inputs, mainly just meant for opening the GUI
    //if an inventory is to be managed, this will require a send to server entity command
    //    which opens the GUI through the proxy.
    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onClientKeyPress(TickEvent.ClientTickEvent event)
    {
        if(event.phase == TickEvent.Phase.END) return;
        if(Minecraft.getMinecraft().currentScreen != null) return;
        if(!(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCar)) return;

        UnifiedKeyRegistry.init();
        SharedKeyState.poll();

        if(SharedKeyState.gui()){
            if(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCarChest)
            {
                FoxDrives.interactChannel.sendToServer(new PacketInteract(
                        2,Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            } else {
                //FMLCommonHandler.instance().showGuiScreen(new GuiCar((EntityCar) Minecraft.getMinecraft().thePlayer.ridingEntity));
            }
        }

        if (SharedKeyState.left())
        {
            if(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCar){
                FoxDrives.interactChannel.sendToServer(new PacketInteract(4, Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            }
        }

        if (SharedKeyState.right())
        {
            if(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCar){
                FoxDrives.interactChannel.sendToServer(new PacketInteract(5, Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            }
        }

        if(SharedKeyState.brake())
        {
            if(Minecraft.getMinecraft().thePlayer.ridingEntity instanceof EntityCar){
                FoxDrives.interactChannel.sendToServer(new PacketInteract(3, Minecraft.getMinecraft().thePlayer.ridingEntity.getEntityId()));
            }
        }
    }

    public void onKeyInput(InputEvent.KeyInputEvent event) {

    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onRenderOverlay(RenderGameOverlayEvent.Post event){
        if(Minecraft.getMinecraft().thePlayer == null) return;
        if(event.type != RenderGameOverlayEvent.ElementType.CROSSHAIRS) return;
        EntityPlayer player = Minecraft.getMinecraft().thePlayer;
        if(player.ridingEntity instanceof EntityCar == false) return;
        EntityCar car = null;
        if(MinecraftServer.getServer() != null){
            if (MinecraftServer.getServer().worldServers != null && MinecraftServer.getServer().worldServers.length > 0
                    && MinecraftServer.getServer().getEntityWorld() != null
                    && MinecraftServer.getServer().getEntityWorld().getEntityByID(player.ridingEntity.getEntityId()) instanceof EntityCar) {
                car = (EntityCar) MinecraftServer.getServer().getEntityWorld().getEntityByID(player.ridingEntity.getEntityId());
            }
        }
        else{
            car =player.ridingEntity instanceof EntityCar ? (EntityCar)player.ridingEntity : player.ridingEntity instanceof EntitySeat ? ((EntitySeat)player.ridingEntity).car : null;
        }
        if(car == null )
        {
            return;
        }

        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Yaw: " + car.rotationYaw, 5, 5, 0xffff00);
        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Vel: " + car.velocity, 5, 15, 0xffff00);
        Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Owner: " + car.getTransportOwner(), 5, 35, 0xffff00);

        car.setRollingVel(car.velocity);
        if(!car.worldObj.isRemote) Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Local Server", 5, 25, 0xffff00);

        if (car.worldObj.isRemote == false)
        {
            renderSkillHUD(event, car, Minecraft.getMinecraft());
        }
    }

    private int windowWidth, windowHeight;
    public void renderSkillHUD(RenderGameOverlayEvent event, EntityCar transport, Minecraft mc)
    {
        windowWidth = event.resolution.getScaledWidth();
        windowHeight = event.resolution.getScaledHeight() - 100;
        GL11.glColor4f(255, 255, 255, 255);

        ResourceLocation baseStyle =new ResourceLocation(FoxDrives.MODID,"textures/gui/gui_hud.png");
        mc.getTextureManager().bindTexture(baseStyle);
        drawTexturedModalRect(10, windowHeight, 0, 150, 137, 90, -90);
        int windowHeightAdditional = 7;

        mc.getTextureManager().bindTexture(baseStyle);



        float angle =
                (MathHelper.clamp_float(Math.abs(transport.velocity) * 39.333333F, 0F, 140F) / 140F) * 180F - 90F;


        this.drawTexturedModalRectRotated( 8 + 46, windowHeight + 25,  0, 112, 7, 36, -89, angle);

        if (transport.getTurnSignalTick() == 1)
        {
            switch (transport.getTurnSignalDirection())
            {
                case -1:

                    mc.getTextureManager().bindTexture(baseStyle);
                    this.drawTexturedModalRect( 8 + 10, windowHeight + windowHeightAdditional,  0 + 8, 141, 7, 7, -89);
                    break;
                case 1:
                    mc.getTextureManager().bindTexture(baseStyle);
                    this.drawTexturedModalRect(62 + 10, windowHeight + windowHeightAdditional,  54 + 8, 141, 7, 7, -89);
                    break;
            }
        }

        if (transport.isBeaconEnabled())
        {
            mc.getTextureManager().bindTexture(baseStyle);
            this.drawTexturedModalRect(26 + 10, windowHeight + windowHeightAdditional,  18 + 8, 141, 7, 7, -89);
        }

        if (transport.isAuxLightsEnabled())
        {
            mc.getTextureManager().bindTexture(baseStyle);
            this.drawTexturedModalRect(35 + 10, windowHeight + windowHeightAdditional,  27 + 8, 141, 7, 7, -89);
        }

        if (transport.isLightsEnabled())
        {
            mc.getTextureManager().bindTexture(baseStyle);
            this.drawTexturedModalRect(44 + 10, windowHeight + windowHeightAdditional,  36 + 8, 141, 7, 7, -89);
        }

        if (transport.isRunning() == false)
        {
            mc.getTextureManager().bindTexture(baseStyle);
            this.drawTexturedModalRect(23, windowHeight + 65,  0, 240, 16, 16, -89);
        }
    }


    /**
     *
     * @param x
     * @param y
     * @param u
     * @param v
     * @param width
     * @param height
     * @param zLevel
     */
    public void drawTexturedModalRect(int x, int y, int u, int v, int width, int height, int zLevel)
    {
        float f = 0.00390625F;
        float f1 = 0.00390625F;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double)(x + 0), (double)(y + height), (double)zLevel, (double)((float)(u + 0) * f), (double)((float)(v + height) * f1));
        tessellator.addVertexWithUV((double)(x + width), (double)(y + height), (double)zLevel, (double)((float)(u + width) * f), (double)((float)(v + height) * f1));
        tessellator.addVertexWithUV((double)(x + width), (double)(y + 0), (double)zLevel, (double)((float)(u + width) * f), (double)((float)(v + 0) * f1));
        tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)zLevel, (double)((float)(u + 0) * f), (double)((float)(v + 0) * f1));
        tessellator.draw();
    }

    public static void drawTexturedModalRectRotated(
            int x, int y,
            int u, int v,
            int width, int height,
            int zLevel,
            float rotationDegrees
    ) {
        float f = 1F / 256F;
        float f1 = 1F / 256F;

        // Pivot point: bottom center
        float px = x + width / 2.0F;
        float py = y + height;

        GL11.glPushMatrix();

        // Move pivot to origin → rotate → move back
        GL11.glTranslatef(px, py, 0F);
        GL11.glRotatef(rotationDegrees, 0F, 0F, 1F);
        GL11.glTranslatef(-px, -py, 0F);

        Tessellator t = Tessellator.instance;
        t.startDrawingQuads();
        t.addVertexWithUV(x, y + height, zLevel, (u) * f, (v + height) * f1);
        t.addVertexWithUV(x + width, y + height, zLevel, (u + width) * f, (v + height) * f1);
        t.addVertexWithUV(x + width, y, zLevel, (u + width) * f, (v) * f1);
        t.addVertexWithUV(x, y, zLevel, (u) * f, (v) * f1);
        t.draw();

        GL11.glPopMatrix();
    }

}
