package fexcraft.tmt_slim;

import bidahochi.foxdrives.FoxDrives;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.world.World;
import org.apache.logging.log4j.Level;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.*;
import java.util.List;

import static org.lwjgl.opengl.GL11.*;

public class TextureManager {


    //public static ByteBuffer renderPixels = ByteBuffer.allocateDirect((4096*4096)*4);
    private static int  skyLight;
    private static Set<?> MCResourcePacks;
    public static Map<String, Integer> tmtBoundTextures = new HashMap<>();
    private static Integer currentKey;

    public static Map<ItemStack,int[]> ingotColors = new HashMap<>();


    private static Map<ResourceLocation, Integer> tmtMap = new HashMap<>();

    private static ITextureObject object;
    private static Integer id;

    private static final float guiScaler = 0.00390625F;
    /**
     * custom texture binding method, generally same as vanilla, but possible to improve performance later.
     * @param textureURI
     */
    public static int bindTexture(ResourceLocation textureURI) {
        if (textureURI == null){
            Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(FoxDrives.MODID,"null texture"));
            return 0;
        }
        //clean out the texture bind map when texturepacks are reloaded.
        if(MCResourcePacks!= Minecraft.getMinecraft().getResourceManager().getResourceDomains()){
            MCResourcePacks= Minecraft.getMinecraft().getResourceManager().getResourceDomains();
            tmtMap=new HashMap<>();
            tmtBoundTextures = new HashMap<>();
        }
        id= tmtMap.get(textureURI);
        if (id==null){
            object = Minecraft.getMinecraft().getTextureManager().getTexture(textureURI);
            if (object == null) {
                object = new SimpleTexture(textureURI);
                Minecraft.getMinecraft().getTextureManager().loadTexture(textureURI, object);
            }
            id=object.getGlTextureId();
            tmtMap.put(textureURI, id);
        }
        if(GL11.glGetInteger(GL_TEXTURE_2D) !=id) {
            GL11.glBindTexture(GL_TEXTURE_2D, id);
        }
        return -1;
    }

    //most compilers should process this type of function faster than a normal typecast.
    public static byte b(int i){return (byte) i;}

    public static boolean colorInRange(int r, int g, int b, int oldR, int oldG, int oldB){
        return oldR-r>-17 && oldR-r <17 &&
                oldG-g>-17 && oldG-g <17 &&
                oldB-b>-17 && oldB-b <17;
    }


    /**Lighting fix*/
    public static void adjustLightFixture(World world, int i, int j, int k) {
        skyLight = world.getSkyBlockTypeBrightness(EnumSkyBlock.Block, i, j, k);
        skyLight=world.getSkyBlockTypeBrightness(EnumSkyBlock.Sky, i, j, k) << 20 | (skyLight<0?0:skyLight) << 4;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit,  skyLight % 65536,  skyLight * 0.00001525878f);
        GL11.glColor4f(1, 1, 1, 1);//fixes alpha layering bugs with other mods that don't clear their GL cache
    }

    private static FloatBuffer colorBuffer = GLAllocation.createDirectFloatBuffer(16);

    private static FloatBuffer setColorBuffer(float p_74521_0_, float p_74521_1_, float p_74521_2_, float p_74521_3_)
    {
        colorBuffer.clear();
        colorBuffer.put(p_74521_0_).put(p_74521_1_).put(p_74521_2_).put(p_74521_3_);
        colorBuffer.flip();
        /** Float buffer used to set OpenGL material colors */
        return colorBuffer;
    }

    public static void fixEntityLighting(){

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_LIGHT0);
        GL11.glEnable(GL11.GL_LIGHT1);
        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        GL11.glColorMaterial(GL11.GL_FRONT_AND_BACK, GL11.GL_AMBIENT_AND_DIFFUSE);
        GL11.glLight(GL11.GL_LIGHT0, GL11.GL_POSITION, setColorBuffer(0.16169041989141428f, 0.8084520874101966f, -0.5659164515496377f, 0.0f));
        GL11.glLight(GL11.GL_LIGHT0, GL11.GL_DIFFUSE, setColorBuffer(0.6F,0.6F,0.6F, 1.0F));
        GL11.glLight(GL11.GL_LIGHT0, GL11.GL_AMBIENT, setColorBuffer(0.0F, 0.0F, 0.0F, 1.0F));
        GL11.glLight(GL11.GL_LIGHT0, GL11.GL_SPECULAR, setColorBuffer(0.0F,0.0F,0.0F, 1.0F));
        GL11.glLight(GL11.GL_LIGHT1, GL11.GL_POSITION, setColorBuffer(-0.16169041989141428f, 0.8084520874101966f,0.5659164515496377f, 0.0f));
        GL11.glLight(GL11.GL_LIGHT1, GL11.GL_DIFFUSE, setColorBuffer(0.6F,0.6F,0.6F, 1.0F));
        GL11.glLight(GL11.GL_LIGHT1, GL11.GL_AMBIENT, setColorBuffer(0.0F, 0.0F, 0.0F, 1.0F));
        GL11.glLight(GL11.GL_LIGHT1, GL11.GL_SPECULAR, setColorBuffer(0.0F,0.0F,0.0F, 1.0F));
        GL11.glShadeModel(GL11.GL_FLAT);
        GL11.glLightModel(GL11.GL_LIGHT_MODEL_AMBIENT, setColorBuffer(0.4F,0.4F,0.4F, 1.0F));

    }



    public static TextureAtlasSprite bindBlockTextureFromSide(int side, ItemStack b){
        if (RenderBlocks.getInstance().hasOverrideBlockTexture()) {
            return (TextureAtlasSprite)RenderBlocks.getInstance().overrideBlockTexture;
        }
        return (TextureAtlasSprite) RenderBlocks.getInstance().getBlockIconFromSideAndMetadata(Block.getBlockFromItem(b.getItem()), side,b.getItemDamage());
        //1.8.9+ version:
        //IBlockState state = Block.getBlockFromItem(b.getItem()).getDefaultState();
        //Minecraft.getMinecraft().getBlockRendererDispatcher().getModelForState(state).getQuads(state,side,0l).get(0).getSprite()
    }

    public static int[] hexTorgba(int hex){
        return new int[]{hex&0xFF, (hex>>8)&0xFF, (hex>>16)&0xFF, (hex>>24)&0xFF};
    }

    public static int[] hexTorgb(int hex){
        return new int[]{hex&0xFF, (hex>>8)&0xFF, (hex>>16)&0xFF};
    }



    public  static int[] postProcessColor(int newColor, int r, int g, int b){
        int[] ret =hexTorgb(newColor);

        ret[0] += ret[0]-b;
        ret[1] += ret[1]-g;
        ret[2] += ret[2]-r;
        return ret;
    }




    public static boolean textureExists(ResourceLocation textureURI){

        object = Minecraft.getMinecraft().getTextureManager().getTexture(textureURI);
        if (object == null) {
            object = new SimpleTexture(textureURI);
            Minecraft.getMinecraft().getTextureManager().loadTexture(textureURI, object);
        }
        return object.getGlTextureId()!=TextureUtil.missingTexture.getGlTextureId();
    }




    public static void bindTexture(ResourceLocation textureURI, int[] skinColorsFrom, int[] skinColorsTo, List<Integer> colorsFrom, List<Integer> colorsTo){
        //clean out the texture bind map when texturepacks are reloaded.
        if (MCResourcePacks != Minecraft.getMinecraft().getResourceManager().getResourceDomains()) {
            MCResourcePacks = Minecraft.getMinecraft().getResourceManager().getResourceDomains();
            tmtMap = new HashMap<>();
            tmtBoundTextures = new HashMap<>();
        }

        GL11.glEnable(GL_TEXTURE_2D);
        if (!tmtBoundTextures.containsKey(getID(textureURI, skinColorsFrom, skinColorsTo, colorsFrom, colorsTo, false))) {
            if (createAWT(textureURI, skinColorsFrom, skinColorsTo, colorsFrom, colorsTo) &&
                    new File(getID(textureURI,skinColorsFrom, skinColorsTo, colorsFrom,colorsTo,true)).exists()) {
                try {
                    BufferedImage image = ImageIO.read(new File(getID(textureURI, skinColorsFrom, skinColorsTo, colorsFrom, colorsTo, true)));

                    currentKey = tmtBoundTextures.put(getID(textureURI, skinColorsFrom, skinColorsTo, colorsFrom, colorsTo, false),
                            Minecraft.getMinecraft().getTextureManager().getTexture(
                                    Minecraft.getMinecraft().getTextureManager().getDynamicTextureLocation(
                                            getID(textureURI, skinColorsFrom, skinColorsTo, colorsFrom, colorsTo, true),
                                            new DynamicTexture(image))).getGlTextureId());
                } catch (IOException exception) {
                    FoxDrives.fdLog.log(Level.DEBUG,"AWT FAILED");
                    exception.printStackTrace();
                }
            }
        } else {
            currentKey = tmtBoundTextures.get(getID(textureURI, skinColorsFrom, skinColorsTo, colorsFrom, colorsTo, false));
        }

        //if for some reason the texture couldn't be written to I/O, which should never be an issue.
        if (currentKey == null) {
            bindTexture(textureURI);
        } else {
            if (GL11.glGetInteger(GL_TEXTURE_2D) != currentKey) {
                GL11.glBindTexture(GL_TEXTURE_2D, currentKey);
            }
        }

    }



    public static boolean createAWT(ResourceLocation textureURI, int[] skinColorsFrom, int[] skinColorsTo, List<Integer> colorsFrom, List<Integer> colorsTo){
        int GLtexture = bindTexture(textureURI);
        if(GLtexture==-1){
            return true;
        }

        //get image data from the currently bound image
        int width =glGetTexLevelParameteri(GL_TEXTURE_2D, 0, GL_TEXTURE_WIDTH);
        int height =glGetTexLevelParameteri(GL_TEXTURE_2D, 0, GL_TEXTURE_HEIGHT);
        if(width*height<4){
            return false;
        }

        ByteBuffer buffer = BufferUtils.createByteBuffer(width * height * 4);

        GL11.glGetTexImage(GL_TEXTURE_2D, 0, GL11.GL_RGBA, GL_UNSIGNED_BYTE, buffer);

        //create a buffered image and push the data to it
        BufferedImage skin = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        int i,r,g,b,a, y,ii;
        int[] col;

        for (int x = 0; x < width; x++) {
            for (y = 0; y < height; y++) {

                i = (x + (width * y)) * 4;
                r = buffer.get(i) & 0xff;
                g = buffer.get(i + 1) & 0xff;
                b = buffer.get(i + 2) & 0xff;
                a = buffer.get(i + 3) & 0xff;
                if(a<10){
                    skin.setRGB(x,y,0x00000000);
                    continue;
                }

                //recolor from skin
                if(skinColorsFrom!=null&&skinColorsFrom.length>0){
                    for (ii=0;ii<skinColorsFrom.length;ii++){
                        col = hexTorgb(skinColorsFrom[ii]);
                        if(colorInRange(r,g,b,col[2],col[1],col[1])){
                            col=postProcessColor(skinColorsTo[ii],r,g,b);
                            r=col[0];
                            g=col[1];
                            b=col[2];
                        }
                    }
                }
                //recolor from player settings. ORDER IS IMPORTANT
                if(colorsFrom!=null && colorsFrom.size()>0) {
                    for (ii=0;ii<colorsFrom.size();ii++){
                        col = hexTorgba(colorsFrom.get(ii));
                        if(colorInRange(r,g,b,col[2],col[1],col[0])){
                            col=postProcessColor(skinColorsTo[ii],r,g,b);
                            r=col[0];
                            g=col[1];
                            b=col[2];
                        }
                    }
                }

                skin.setRGB(x, y, (a << 24) | (r << 16) | (g << 8) | b);
            }
        }
        return true;
    }

    private static String getID(ResourceLocation textureURI, int[] skinColorsFrom, int[] skinColorsTo, List<Integer> colorsFrom, List<Integer> colorsTo, boolean isFile){
        StringBuilder filePath = new StringBuilder();
        if(isFile) {
            filePath.append(new ResourceLocation(FoxDrives.MODID));
            filePath.append(resourceLocation(textureURI));
            filePath.append("/");
            if(skinColorsFrom!=null && skinColorsTo!=null && skinColorsFrom.length>0 && skinColorsTo.length>0) {
                for (Integer i : skinColorsFrom) {
                    filePath.append(Integer.toHexString(i));
                }
                filePath.append("_");
                for (Integer i : skinColorsTo) {
                    filePath.append(Integer.toHexString(i));
                }
                filePath.append("+");
            }
            if(colorsFrom==null || colorsTo==null || colorsFrom.size()+colorsTo.size()==0){
                filePath.append("000_000");
            } else {
                for (Integer i : colorsFrom) {
                    filePath.append(Integer.toHexString(i));
                }
                filePath.append("_");
                for (Integer i : colorsTo) {
                    filePath.append(Integer.toHexString(i));
                }
            }
            filePath.append(".png");
        }
        else {
            filePath.append(resourceLocation(textureURI));
            filePath.append(".");
            if(skinColorsFrom!=null && skinColorsTo!=null && skinColorsFrom.length>0 && skinColorsTo.length>0) {
                for (Integer i : skinColorsFrom) {
                    filePath.append(Integer.toHexString(i));
                }
                filePath.append("_");
                for (Integer i : skinColorsTo) {
                    filePath.append(Integer.toHexString(i));
                }
                if(colorsFrom!=null && colorsTo!=null && colorsFrom.size()+colorsTo.size()>1) {
                    filePath.append("+");
                }
            }
            if(colorsFrom!=null && colorsTo!=null && colorsFrom.size()+colorsTo.size()>1){
                for (Integer i : colorsFrom) {
                    filePath.append(Integer.toHexString(i));
                }
                for (Integer i : colorsTo) {
                    filePath.append(Integer.toHexString(i));
                }
            }
        }
        return filePath.toString();
    }

    private static String resourceLocation(ResourceLocation res){
        return (res.getResourceDomain() + "/"
                +res.getResourcePath().
                substring(0, res.getResourcePath().lastIndexOf(".")));
    }

    /**
     * <h2>Draw Texture</h2>
     * This replaces the base class and allows us to draw textures that are stretched to the shape defined in a more efficient manner.
     * NOTE: all textures must be divisible by 256x256
     * @param posX the X position on screen to draw at.
     * @param posY the Y position on screen to draw at.
     * @param posU the X position of the texture to start from.
     * @param posV the Y position of the texture to start from.
     * @param width the width of the box.
     * @param height the height of the box.
     * @param widthUV defines the X size of the texture part used
     * @param heightUV defines the X Y size of the texture part used
     */
    public static void drawTexturedRect(float posX, float posY, int posU, int posV, int width, int height, int widthUV, int heightUV) {
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.startDrawing(GL11.GL_QUADS);
        tessellator.addVertexWithUV(posX, posY + height, 0, posU * guiScaler, (posV + heightUV) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY + height, 0, (posU + widthUV) * guiScaler, (posV + heightUV) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY, 0, (posU + widthUV) * guiScaler, posV * guiScaler);
        tessellator.addVertexWithUV(posX, posY, 0, posU * guiScaler, posV * guiScaler);
        tessellator.draw();
    }
    public static void drawTexturedRect(float posX, float posY, int posU, int posV, int width, int height) {
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.startDrawing(GL11.GL_QUADS);
        tessellator.addVertexWithUV(posX, posY + height, 0, posU * guiScaler, (posV + height) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY + height, 0, (posU + width) * guiScaler, (posV + height) * guiScaler);
        tessellator.addVertexWithUV(posX + width, posY, 0, (posU + width) * guiScaler, posV * guiScaler);
        tessellator.addVertexWithUV(posX, posY, 0, posU * guiScaler, posV * guiScaler);
        tessellator.draw();
    }
}
