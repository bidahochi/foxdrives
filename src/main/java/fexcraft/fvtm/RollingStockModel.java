package fexcraft.fvtm;

import fexcraft.tmt_slim.ModelBase;
import fexcraft.tmt_slim.ModelRendererTurbo;
import fexcraft.tmt_slim.Tessellator;
import fexcraft.tmt_slim.TexturedPolygon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

import static bidahochi.foxdrives.FoxDrives.disableCache;

/**
 * A compatibility class for "FVTM Scheme/Format" models.
 * @Author Eternal BlueFlame
 *
 * @OriginalAuthor Ferdinand Calo' (FEX___96)
 */

public class RollingStockModel extends ModelBase {
	
    public List<FDTurboList> groups = new ArrayList<>();
    public int textureX, textureY;
    public RollingStockModel(){}

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
        for(FDTurboList list :groups) {
            if(list.init){
                list.initAllParts();
            }
        }

        if(!disableCache && staticPartMap.get(this.getClass().getName())!=null &&
                !org.lwjgl.opengl.GL11.glIsList(staticPartMap.get(this.getClass().getName()))){
            staticPartMap.remove(this.getClass().getName());
        }

        GL11.glPushMatrix();
        if(disableCache){
            for(FDTurboList list :groups) {
                list.render(list.boxList);
            }
        } else if(staticPartMap.get(this.getClass().getName())==null) {
            staticPartMap.put(this.getClass().getName(), GLAllocation.generateDisplayLists(1));
            GL11.glNewList(staticPartMap.get(this.getClass().getName()), GL11.GL_COMPILE);
            for(FDTurboList list :groups) {
                list.render(list.boxList);
            }
            GL11.glEndList();
            for(FDTurboList list :groups) {
                list.boxList=null;
            }
        } else {
            GL11.glCallList(staticPartMap.get(this.getClass().getName()));
        }
        GL11.glPopMatrix();

        ModelRendererTurbo part;
        for(FDTurboList list :groups) {
            if (list.animatedList != null) {
                for (int i = 0; i < list.animatedList.size(); i++) {
                    if(list.displayList.size()>i && list.displayList.get(i)!=null){
                        part=list.animatedList.get(i);
                        if(!part.showModel){
                            continue;
                        }
                        GL11.glPushMatrix();
                        if (part.ignoresLighting){
                            Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
                        }
                        if (part.noCull){
                            GL11.glDisable(GL11.GL_CULL_FACE);
                        }
                        GL11.glTranslatef(part.rotationPointX * 0.0625F, part.rotationPointY * 0.0625F, part.rotationPointZ * 0.0625F);
                        GL11.glRotatef(part.rotateAngleY, 0.0F, 1.0F, 0.0F);
                        GL11.glRotatef(part.rotateAngleZ, 0.0F, 0.0F, 1.0F);
                        GL11.glRotatef(part.rotateAngleX, 1.0F, 0.0F, 0.0F);

                        if(!org.lwjgl.opengl.GL11.glIsList(list.displayList.get(i))){
                            list.displayList=new ArrayList<>();
                            GL11.glPopMatrix();
                            return;
                        }
                        GL11.glCallList(list.displayList.get(i));

                        GL11.glTranslatef(-part.rotationPointX * 0.0625F, -part.rotationPointY * 0.0625F, -part.rotationPointZ * 0.0625F);
                        if (part.ignoresLighting){
                            Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
                        }
                        if (part.noCull){
                            GL11.glEnable(GL11.GL_CULL_FACE);
                        }
                        GL11.glPopMatrix();
                        if(disableCache){
                            GL11.glDeleteLists(list.displayList.get(i),1);
                            list.displayList.set(i, null);
                        }

                    }
                    if(list.animatedList.get(i)!=null &&(list.displayList.size()<=i ||disableCache)) {
                        int disp = GLAllocation.generateDisplayLists(1);
                        if(list.displayList.size()>i){
                            list.displayList.set(i, disp);
                        } else {
                            list.displayList.add(disp);
                        }
                        GL11.glNewList(disp, GL11.GL_COMPILE);
                        for (TexturedPolygon poly : list.animatedList.get(i).faces) {
                            Tessellator.getInstance().drawTexturedVertsWithNormal(poly, 0.0625F);
                        }
                        GL11.glEndList();
                    }
                }
            }
        }
    }

    @Override
    public List<ModelRendererTurbo> getParts(){
        List<ModelRendererTurbo> turboList = new ArrayList<ModelRendererTurbo>();
        for(FDTurboList g: groups){
            turboList.addAll(g.boxList);
            turboList.addAll(g.animatedList);
        }
        return turboList;
    }
    
}
