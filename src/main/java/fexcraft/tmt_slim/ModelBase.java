package fexcraft.tmt_slim;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static bidahochi.foxdrives.FoxDrives.disableCache;
/**
* Similar to 'FlansMod'-type Models, for a fast convert.
* @Author Ferdinand Calo' (FEX___96)
*/
public class ModelBase extends ArrayList<ModelRendererTurbo> {

	@Deprecated //box list for static parts should be completley unnecessary by making a displaylist of it as a whole.
	//improvements can be further made by having a Map<Class, GLID> for the static parts, so each intance ever only
	//    exists once on GPU, so 40 boxcar bases would still be the animated parts
	//    and a single static to cover all of them.
	public List<ModelRendererTurbo> boxList = new ArrayList<>();
	public List<ModelRendererTurbo> animatedList = new ArrayList<>();
	public List<String> creators = new ArrayList<>();
	public boolean init=true;
	public ModelRendererTurbo[] base;
	public ModelRendererTurbo[] bodyModel;
	public ModelRendererTurbo[] open;
	public ModelRendererTurbo[] closed;
	public ModelRendererTurbo[] r0;
	public ModelRendererTurbo[] r1;
	public ModelRendererTurbo[] r2;
	public ModelRendererTurbo[] r3;
	public ModelRendererTurbo[] r4;
	public ModelRendererTurbo[] r5;
	public ModelRendererTurbo[] r6;
	public ModelRendererTurbo[] r7;
	public List<ModelRendererTurbo> frontWheels = new ArrayList<>();
	public List<ModelRendererTurbo> frontWheels2 = new ArrayList<>();
	public List<ModelRendererTurbo> backWheels = new ArrayList<>();
	public List<ModelRendererTurbo> ignoreLightObjects = new ArrayList<>();

	public List<Integer> displayList=new ArrayList<>();

	public static Map<String,Integer> staticPartMap = new HashMap<>();
	public Integer localGLID = null;

	public void render(){
		if(init){
		    initAllParts();
		}

		if(disableCache) {
			render(boxList);
		} else if(localGLID!=null && GL11.glIsList(localGLID)) {
			GL11.glCallList(localGLID);
		} else if(staticPartMap.get(this.getClass().getName())==null) {
			localGLID=GLAllocation.generateDisplayLists(1);
			staticPartMap.put(this.getClass().getName(), localGLID);
			GL11.glNewList(localGLID, GL11.GL_COMPILE);
			render(boxList);
			GL11.glEndList();
			boxList=null;
		} else {
			localGLID=staticPartMap.get(this.getClass().getName());
			GL11.glCallList(localGLID);
		}

		if(animatedList==null){return;}
		ModelRendererTurbo part;
		for(int i=0;i<animatedList.size();i++){
			//for animations to work we have to limit the displaylist cache to ONLY the geometry, and then
			//    the position and offsets must be done manually every frame.
			if(displayList.size()>i){
				part=animatedList.get(i);
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

				if(GL11.glIsList(displayList.get(i))) {
					GL11.glCallList(displayList.get(i));
				} else {
					int disp = GLAllocation.generateDisplayLists(1);
					displayList.set(i,disp);
					GL11.glNewList(disp, GL11.GL_COMPILE);
					for (TexturedPolygon poly : animatedList.get(i).faces) {
						Tessellator.getInstance().drawTexturedVertsWithNormal(poly, 0.0625F);
					}
					GL11.glEndList();
				}

				GL11.glTranslatef(-part.rotationPointX * 0.0625F, -part.rotationPointY * 0.0625F, -part.rotationPointZ * 0.0625F);
				if (part.ignoresLighting){
					Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
				}
				if (part.noCull){
					GL11.glEnable(GL11.GL_CULL_FACE);
				}
				GL11.glPopMatrix();
				if(disableCache){
					GL11.glDeleteLists(displayList.get(i),1);
					displayList.set(i, null);
				}
			}
			if(animatedList.get(i)!=null &&(displayList.size()<=i || disableCache)) {
				int disp = GLAllocation.generateDisplayLists(1);
				if(displayList.size()>i){
					displayList.set(i, disp);
				} else {
					displayList.add(disp);
				}
				GL11.glNewList(disp, GL11.GL_COMPILE);
				for (TexturedPolygon poly : animatedList.get(i).faces) {
					Tessellator.getInstance().drawTexturedVertsWithNormal(poly, 0.0625F);
				}
				GL11.glEndList();
			}
		}
	}

	/** render sub-model array */
	public void render(List<ModelRendererTurbo> model){
		if(model==null){return;}
		for(ModelRendererTurbo sub : model){
			if(sub!=null) {
				GL11.glPushMatrix();
				sub.render();
				GL11.glPopMatrix();
			}
		}
	}



	public void render(Object type, Entity ent){render(); }

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {render();}
	

	public void translateAll(float x, float y, float z){
		translate(base, x, y, z);
		translate(open, x, y, z);
		translate(closed, x, y, z);
		translate(r0, x, y, z);
		translate(r1, x, y, z);
		translate(r2, x, y, z);
		translate(r3, x, y, z);
		translate(r4, x, y, z);
		translate(r5, x, y, z);
		translate(r6, x, y, z);
		translate(r7, x, y, z);
		translate(backWheels, x, y, z);
		translate(frontWheels, x, y, z);
		translate(frontWheels2, x, y, z);
		translate(bodyModel,x,y,z);
		translate(boxList,x,y,z);
		translate(animatedList,x,y,z);
		translate(ignoreLightObjects, x, y, z);
	}


	public void rotateAll(float x, float y, float z){
		rotate(base, x, y, z);
		rotate(open, x, y, z);
		rotate(closed, x, y, z);
		rotate(r0, x, y, z);
		rotate(r1, x, y, z);
		rotate(r2, x, y, z);
		rotate(r3, x, y, z);
		rotate(r4, x, y, z);
		rotate(r5, x, y, z);
		rotate(r6, x, y, z);
		rotate(r7, x, y, z);
		rotate(backWheels, x, y, z);
		rotate(frontWheels, x, y, z);
		rotate(frontWheels2, x, y, z);
		rotate(bodyModel,x,y,z);
		rotate(boxList,x,y,z);
		rotate(animatedList,x,y,z);
		rotate(ignoreLightObjects, x, y, z);
	}
    public void flipAll(){
        flip(base);
        flip(open);
        flip(closed);
        flip(r0);
        flip(r1);
        flip(r2);
        flip(r3);
        flip(r4);
        flip(r5);
        flip(r6);
        flip(r7);
        flip(backWheels);
        flip(frontWheels);
        flip(frontWheels2);
		flip(bodyModel);
		flip(boxList);
		flip(animatedList);
		flip(ignoreLightObjects);
    }


	protected final void fixRotation(ModelRendererTurbo[] model, boolean flipX, boolean flipY, boolean flipZ){
		if(!flipX && !flipY && !flipZ){return;}
		for(ModelRendererTurbo mod : model){
			if(mod==null){continue;}
			if(flipX){mod.rotateAngleX = -mod.rotateAngleX;}
			if(flipY){mod.rotateAngleY = -mod.rotateAngleY;}
			if(flipZ){mod.rotateAngleZ = -mod.rotateAngleZ;}
		}
	}


	protected void translate(ModelRendererTurbo[] model, float x, float y, float z){
		if(model==null){return;}
		for(ModelRendererTurbo mod : model){
			if(mod==null){continue;}
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}
	protected void translate(List<ModelRendererTurbo> model, float x, float y, float z){
		if(model==null){return;}
		for(ModelRendererTurbo mod : model){
			if(mod==null){continue;}
			mod.rotationPointX += x;
			mod.rotationPointY += y;
			mod.rotationPointZ += z;
		}
	}

	protected void rotate(ModelRendererTurbo[] model, float x, float y, float z) {
		if(model==null){return;}
		for(ModelRendererTurbo mod : model){
			if(mod==null){continue;}
			mod.rotateAngleX += x;
			mod.rotateAngleY += y;
			mod.rotateAngleZ += z;
		}
	}
	protected void rotate(List<ModelRendererTurbo> model, float x, float y, float z) {
		if(model==null){return;}
		for(ModelRendererTurbo mod : model){
			if(mod==null){continue;}
			mod.rotateAngleX += x;
			mod.rotateAngleY += y;
			mod.rotateAngleZ += z;
		}
	}

    public void flip(ModelRendererTurbo[] model) {
        if(model==null){return;}
		for(ModelRendererTurbo mod : model){
			if(mod==null){continue;}
			mod.rotateAngleY = -mod.rotateAngleY * 57.29578F;
			mod.rotateAngleZ = -mod.rotateAngleZ * 57.29578F;
			mod.rotateAngleX *= 57.29578F;
		}
    }
	public void flip(List<ModelRendererTurbo> model) {
		if(model==null){return;}
		for(ModelRendererTurbo sub : model){
			if(sub==null){continue;}
			sub.doMirror(false, true, true);
			sub.setRotationPoint(sub.rotationPointX, -sub.rotationPointY, -sub.rotationPointZ);
		}
	}

	public List<ModelRendererTurbo> getParts(){

		if(init){
			initAllParts();
		}
	    List<ModelRendererTurbo> ret = new ArrayList<>();
	    ret.addAll(boxList);
	    ret.addAll(animatedList);
		return ret;
	}

	public void addPart(ModelRendererTurbo part){
		if(part==null) {
			return;
		}if(part.boxName!=null && part.boxName.length()>2){
			animatedList.add(part);
		} else {
			boxList.add(part);
		}
	}

	public void addToCreators(String s){
		creators.add(s);
	}


	public void initAllParts(){
        base=initList(base);
        open=initList(open);
        closed=initList(closed);
        bodyModel=initList(bodyModel);
        r0=initList(r0);
        r1=initList(r1);
        r2=initList(r2);
        r3=initList(r3);
        r4=initList(r4);
        r5=initList(r5);
        r6=initList(r6);
        r7=initList(r7);
        //backWheels = initList(backWheels);
        //frontWheels = initList(frontWheels);
        //frontWheels2 = initList(frontWheels2);
        init=false;
    }

	public ModelRendererTurbo[] initList(ModelRendererTurbo[] list){
	    if(list==null){return null;}
        for(ModelRendererTurbo model : list){
            addPart(model);
        }
        return null;
    }
}
