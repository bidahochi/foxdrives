package bidahochi.foxdrives.client.gui.genericButtons;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiUVAdjustCustomButton extends GuiButton {

    //private String texture = Info.guiPrefix + "customButton.png";
    // UV position in texture
    private final ResourceLocation texture;
    private final int u;
    private final int v;

    // Actual texture size (IMPORTANT)
    private final float textureWidth;
    private final float textureHeight;

    public GuiUVAdjustCustomButton(
            int id,
            int x,
            int y,
            int width,
            int height,
            String text,
            ResourceLocation texture,
            int u,
            int v,
            float textureWidth,
            float textureHeight
    ) {
        super(id, x, y, width, height, text);
        this.texture = texture;
        this.u = u;
        this.v = v;
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
    }

    @Override
    public void drawButton(Minecraft mc, int mouseX, int mouseY) {
        if (!this.visible) return;

        mc.getTextureManager().bindTexture(texture);
        GL11.glColor4f(1F, 1F, 1F, 1F);

        boolean hovered = mouseX >= xPosition
                && mouseY >= yPosition
                && mouseX < xPosition + width
                && mouseY < yPosition + height;

        // Draw the button texture (1:1 pixel perfect)
        drawTexturedRect(
                xPosition,
                yPosition,
                width,
                height,
                u,
                v,
                width,
                height,
                textureWidth,
                textureHeight
        );

        // Optional text rendering
        if (!displayString.isEmpty()) {
            FontRenderer fr = mc.fontRenderer;
            int color = !enabled ? 0xA0A0A0 : (hovered ? 0xFFFFA0 : 0xE0E0E0);
            drawCenteredString(
                    fr,
                    displayString,
                    xPosition + width / 2,
                    yPosition + (height - 8) / 2,
                    color
            );
        }
    }

    /**
     * Draws a textured rectangle with custom UV scaling (1.7.10-safe)
     */
    private void drawTexturedRect(
            int x, int y,
            int w, int h,
            float u, float v,
            float uw, float vh,
            float texW, float texH
    ) {
        float f = 1F / texW;
        float f1 = 1F / texH;

        Tessellator t = Tessellator.instance;
        t.startDrawingQuads();
        t.addVertexWithUV(x,     y + h, 0, u * f,        (v + vh) * f1);
        t.addVertexWithUV(x + w, y + h, 0, (u + uw) * f, (v + vh) * f1);
        t.addVertexWithUV(x + w, y,     0, (u + uw) * f, v * f1);
        t.addVertexWithUV(x,     y,     0, u * f,        v * f1);
        t.draw();
    }

}