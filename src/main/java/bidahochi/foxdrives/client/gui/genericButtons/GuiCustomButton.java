package bidahochi.foxdrives.client.gui.genericButtons;

import bidahochi.foxdrives.FoxDrives;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiCustomButton extends GuiButton {

    private ResourceLocation texture;
    private int textureX = 0;
    private int textureY = 46;

    public GuiCustomButton(int par1, int par2, int par3, String par4Str, ResourceLocation texture, int textureX, int textureY) {
        this(par1, par2, par3, 200, 20, par4Str, texture, textureX, textureY);
    }

    /**
     *
     * @param par1
     * @param par2
     * @param par3
     * @param buttonImageWidth
     * @param buttonImageHeight
     * @param par6Str
     * @param texture
     * @param textureX looks across x axis in image to then include everything after this point for the buttonImageWidth amount of pixels
     * @param textureY looks down to y amount then everything after this for buttonImageHeight amount of pixels will be included
     */
    public GuiCustomButton(int par1, int par2, int par3, int buttonImageWidth, int buttonImageHeight, String par6Str, ResourceLocation texture, int textureX, int textureY) {
        super(par1, par2, par3, buttonImageWidth, buttonImageHeight, par6Str);
        this.width = 200;
        this.height = 20;
        this.enabled = true;
        this.visible = true;
        this.id = par1;
        this.xPosition = par2;
        this.yPosition = par3;
        this.width = buttonImageWidth;
        this.height = buttonImageHeight;
        this.displayString = par6Str;
        this.texture = texture;
        this.textureX = textureX;
        this.textureY = textureY;
    }

    public void setTexture(ResourceLocation texture, int textureX, int textureY) {
        this.texture = texture;
        this.textureX = textureX;
        this.textureY = textureY;
    }

    @Override
    public void drawButton(Minecraft mc, int par2, int par3) {
        if (this.visible)
        {
            FontRenderer var4 = mc.fontRenderer;
            mc.getTextureManager().bindTexture(this.texture);
            //GL11.glBindTexture(GL11.GL_TEXTURE_2D, textureInt);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            boolean var5 = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            this.drawTexturedModalRect(this.xPosition, this.yPosition, textureX, textureY, this.width, this.height);
            this.mouseDragged(mc, par2, par3);
            int var7 = 14737632;

            if (!this.enabled) {
                var7 = -6250336;
            }
            else if (var5) {
                var7 = 16777120;
            }
            this.drawCenteredString(var4, this.displayString, this.xPosition + this.width / 2, this.yPosition + (this.height - 8) / 2, var7);
        }
    }
}