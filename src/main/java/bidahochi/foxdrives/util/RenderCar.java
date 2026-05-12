package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.BaseEntityVehicle.*;
import com.google.gson.JsonObject;
import fdfexcraft.tmt_slim.ModelRendererTurbo;
import fdfexcraft.tmt_slim.Tessellator;
import fdfexcraft.tmt_slim.Vec3f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static bidahochi.foxdrives.util.FoxDrivesConstants.DW_YAW;
import static org.lwjgl.opengl.GL11.*;

public class RenderCar extends Render {
    private static boolean renderGUIFullBright = false;
    private static boolean renderModeGUI = false;

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     *
     * @param p_76986_1_
     * @param p_76986_2_
     * @param p_76986_4_
     * @param p_76986_6_
     * @param p_76986_8_
     * @param p_76986_9_
     */
    @Override
    public void doRender(Entity p_76986_1_, double p_76986_2_, double p_76986_4_, double p_76986_6_, float p_76986_8_, float p_76986_9_) {
        if (p_76986_1_ instanceof EntityCar) {
            doRender((EntityCar) p_76986_1_, p_76986_2_,p_76986_4_,p_76986_6_, p_76986_9_, renderModeGUI);
        }
        if (p_76986_1_ instanceof EntityTrailer) {
            doRenderPre((EntityTrailer) p_76986_1_, p_76986_2_,p_76986_4_,p_76986_6_, p_76986_9_, renderModeGUI);
        }
    }

    public void doRender(EntityCar car, double x, double y, double z, float ticks, boolean renderModeGUI){
        //init model if necessary
        if(car.modelInstance == null)
        {
            car.modelInstance=car.getModel();
            for (ModelRendererTurbo render : car.modelInstance.getParts())
            {
                if (render.boxName == null || render.boxName.isEmpty())
                {
                    continue;
                }

                //handle culling
                if (render.boxName.toLowerCase().contains("cull"))
                {
                    //render.boxName=render.boxName.replace("nocull","").replace("Nocull", "").replace("NoCull", "").replace("cull", "");
                    render.noCull = true;
                }

                //handle glow stuff
                if(BoxName.isLightBox(render.boxName))
                {
                    car.modelInstance.ignoreLightObjects.add(render);
                }

                //handle wheels
                if(render.boxName.toLowerCase().contains("wheel"))
                {
                    if(render.boxName.toLowerCase().contains("front"))
                    {
                        car.modelInstance.frontWheels.add(render);
                    }
                    else if (render.boxName.toLowerCase().contains("front2"))//rear steering
                    {
                        car.modelInstance.frontWheels2.add(render);
                    }
                    else
                    {
                        car.modelInstance.backWheels.add(render);
                    }
                }
                //handle cullwheels
                if(render.boxName.toLowerCase().contains("cullwheel"))
                {
                    if(render.boxName.toLowerCase().contains("front"))
                    {
                        car.modelInstance.frontWheels.add(render);
                        render.noCull = true;
                    }
                    else if (render.boxName.toLowerCase().contains("front2"))//rear steering
                    {
                        car.modelInstance.frontWheels2.add(render);
                        render.noCull = true;
                    }
                    else
                    {
                        car.modelInstance.backWheels.add(render);
                        render.noCull = true;
                    }
                }
            }
        }

        // render objects that change lighting:
        JsonObject lightDetails = car.vehicleDataAsJsonObjectDW();
        for (ModelRendererTurbo lighting : car.modelInstance.ignoreLightObjects)
        {
            switch (lighting.boxName)
            {
                case "lamp":
                    // BoxName.headLight
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.isHeadlightsEnabled.AsString()).getAsBoolean();
                break;
                case "brakeLight":
                    // BoxName.areBrakeLightsOn
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.areBrakeLightsOn.AsString()).getAsBoolean();
                break;
                case "leftTurnLight":
                    // BoxName.turnSignal
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.turnSignal.AsString()).getAsByte() == -1 && (lightDetails.get(DataMemberName.turnSignalTick.AsString()).getAsByte() == 1);
                break;
                case "rightTurnLight":
                    // BoxName.turnSignal
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.turnSignal.AsString()).getAsByte() == 1 && (lightDetails.get(DataMemberName.turnSignalTick.AsString()).getAsByte() == 1);
                break;
                case "runningLights":
                    // BoxName.runningLight
                    lighting.ignoresLighting = car.running > 0;
                break;
                case "reverseLight":
                    lighting.ignoresLighting = car.getVelocity() < 0f;
                break;
                case "commander":
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean() && car.ticksExisted % 30 == 0;
                break;
                case "ditch":
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.ditchLightMode.AsString()).getAsByte() > 0;
                break;
                default:
                    if (lightDetails.get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean() && lighting.boxName.contains("prime"))
                    {
                        switch (lightDetails.get(DataMemberName.beaconCycleIndex.AsString()).getAsByte())
                        {
                            case 0:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime1"));
                            break;
                            case 1:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime2"));
                            break;
                            case 2:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime3"));
                            break;
                            case 3:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime4"));
                            break;
                        }
                    }
                    else
                    {
                        lighting.ignoresLighting = false;
                    }
                break;
            }
        }

        if(car.riddenByEntity!=null && car.running > 0) {
            // define the rotation angle, scale based on framerate.
            double rotation = (car.velocity/*throttle*/ * car.type().max_forward_speed * 0.000001) * (System.currentTimeMillis() - car.lastFrame) * 60;
            //rotate back wheels
            for (ModelRendererTurbo wheel : car.modelInstance.backWheels) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*car.wheelSpinMultiplier();
            }

            //rotate front wheels
            //todo: turn front wheels
            for (ModelRendererTurbo wheel : car.modelInstance.frontWheels) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*car.wheelSpinMultiplier();
                if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(true));
                } else if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(false));
                } else {
                    wheel.rotateAngleY = 0;
                }
            }

            //rotate front wheels, if they are actually on the back (forklift nonsense)
            //todo: turn front wheels
            for (ModelRendererTurbo wheel : car.modelInstance.frontWheels2) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*car.wheelSpinMultiplier();

                if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(!car.type().rear_steer));
                } else if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0) {
                    wheel.rotateAngleY = (car.turnRenderDegree(car.type().rear_steer));
                } else {
                    wheel.rotateAngleY = 0;
                }
            }
        }

        //apply GL effects
        GL11.glPushMatrix();
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1f);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glLightModelf(GL_LIGHT_MODEL_TWO_SIDE, GL_FALSE);
        GL11.glLightModelf(GL_LIGHT_MODEL_LOCAL_VIEWER, GL_TRUE);
        GL11.glShadeModel(GL_SMOOTH);
        GL11.glEnable(GL_NORMALIZE);
        //apply texture
        Tessellator.bindTexture(new ResourceLocation(FoxDrives.MODID,
                car.getSkins()[car.getDataWatcher().getWatchableObjectInt(20)]+".png"));
        //Minecraft.getMinecraft().getTextureManager().bindTexture();
        //reposition and rotation
        GL11.glTranslated(x,y+(0.625f*car.getModelScale().yCoord),z);

        if (car.getModelOffset() != null) {
            if (car.rotationYaw != 0.0F) {
                float cos = MathHelper.cos((car.rotationYaw) * ((float) Math.PI / 180.0f));
                float sin = MathHelper.sin((car.rotationYaw) * ((float) Math.PI / 180.0f));

                GL11.glTranslatef(car.getModelOffset().xCoord * cos - car.getModelOffset().zCoord * sin,
                        car.getModelOffset().yCoord,
                        car.getModelOffset().xCoord * sin - car.getModelOffset().zCoord * cos);
            } else {
                GL11.glTranslatef(car.getModelOffset().xCoord, car.getModelOffset().yCoord, car.getModelOffset().zCoord);
            }
        }
        if (car.getModelRotation() != null) {
            GL11.glRotatef(car.getModelRotation().xCoord, 1, 0, 0);
            GL11.glRotatef(car.getModelRotation().yCoord, 0, 1, 0);
            GL11.glRotatef(car.getModelRotation().zCoord, 0, 0, 1);
        }
        GL11.glRotatef(-(car.rotationYaw + (car.rotationYaw - car.prevRotationYaw) * ticks) + 90, 0, 1, 0);
        GL11.glRotatef(180,1,0,0);
        GL11.glRotatef(car.getRollingDirection(),0,0,1);
        GL11.glScalef(car.getModelScale().xCoord,car.getModelScale().yCoord,car.getModelScale().zCoord);

        int skyLight = car.worldObj.getLightBrightnessForSkyBlocks(MathHelper.floor_double(car.posX), MathHelper.floor_double(car.posY), MathHelper.floor_double(car.posZ), 0);
        if (!renderModeGUI) {
            GL11.glEnable(GL11.GL_LIGHTING);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, skyLight % 65536,
                    skyLight / 65536f);
        } else {
            if (renderGUIFullBright)
                GL11.glDisable(GL11.GL_LIGHTING);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f,
                    240f);
        }

        //render
        car.modelInstance.render(car, 0,0,0,0,0, 0.625f);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }

    public void doRenderPre(EntityTrailer trailer, double x, double y, double z, float ticks, boolean renderModeGUI) {
        if (renderModeGUI) {
            doRender(trailer, x, y, z, trailer.rotationYaw, ticks, renderModeGUI);
            return;
        }

        ITowingParent parent = ((AbstractTowingChild) trailer).resolveParentVehicle();
        if (parent == null) {
            doRender(trailer, x, y, z, trailer.rotationYaw, ticks, renderModeGUI);
            return;
        }

        Entity parentEntity = parent.getEntity();

        //Get the parent's position this frame.
        double parentRenderX = parentEntity.lastTickPosX + (parentEntity.posX - parentEntity.lastTickPosX) * ticks;
        double parentRenderY = parentEntity.lastTickPosY + (parentEntity.posY - parentEntity.lastTickPosY) * ticks;
        double parentRenderZ = parentEntity.lastTickPosZ + (parentEntity.posZ - parentEntity.lastTickPosZ) * ticks;

        //Get the parent's rotation this frame.
        float parentYawDelta = parentEntity.rotationYaw - parentEntity.prevRotationYaw;
        while (parentYawDelta > 180)  parentYawDelta -= 360;
        while (parentYawDelta < -180) parentYawDelta += 360;
        float parentRenderYaw = parentEntity.prevRotationYaw + parentYawDelta * ticks;

        //Find world pos of the receiver on the parent for this frame.
        double pRad = Math.toRadians(parentRenderYaw);
        double pSin = Math.sin(pRad);
        double pCos = Math.cos(pRad);

        Vec3f receiverPos = ((AbstractTowingParent) parentEntity).getHitchOffsets().get(((AbstractTowingChild) trailer).getReceiverType());
        double receiverX = parentRenderX + (pCos * receiverPos.xCoord - pSin * receiverPos.zCoord);
        double receiverY = parentRenderY + receiverPos.yCoord;
        double receiverZ = parentRenderZ + (pSin * receiverPos.xCoord + pCos * receiverPos.zCoord);

        //Find the yaw for the trailer with *geometry*
        double trailerRenderX = trailer.lastTickPosX + (trailer.posX - trailer.lastTickPosX) * ticks;
        double trailerRenderZ = trailer.lastTickPosZ + (trailer.posZ - trailer.lastTickPosZ) * ticks;

        double dx = trailerRenderX - receiverX;
        double dz = trailerRenderZ - receiverZ;

        float trailerRenderYaw;
        if (Math.abs(dx) < 0.01 && Math.abs(dz) < 0.01) {
            trailerRenderYaw = parentRenderYaw;
        } else {
            trailerRenderYaw = (float) Math.toDegrees(Math.atan2(-dx, dz));
        }

        // Low-pass filter against last frame's yaw to remove wobbling.
        float yawDiff = trailerRenderYaw - trailer.getDataWatcher().getWatchableObjectFloat(DW_YAW);
        while (yawDiff > 180)  yawDiff -= 360;
        while (yawDiff < -180) yawDiff += 360;

        float absDiff = Math.abs(yawDiff);
        //Blend factor: 1.0 = no filtering (instant), lower = more smoothing
        //For large rotations (>4 degrees) pass through immediately
        //For small rotations (<0.75 degree) apply heavy filtering
        //Linearly interpolate between the two thresholds
        float blendFactor;
        if (absDiff > 4.0f) {
            blendFactor = 1.0f;        // no filter on large rotations
        } else if (absDiff < 0.75f) {
            blendFactor = 0.01f;        // heavy filter on tiny wobble
        } else {
            // linear ramp between 1.0f and 0.01f across the 0.75-4 degree range
            float t = (absDiff - 1.0f) / (4.0f - 1.0f);
            blendFactor = 0.01f + t * (1.0f - 0.01f);
        }
        trailerRenderYaw = trailer.getDataWatcher().getWatchableObjectFloat(DW_YAW) + yawDiff * blendFactor;
        while (trailerRenderYaw > 180) trailerRenderYaw -= 360;
        while (trailerRenderYaw < -180) trailerRenderYaw += 360;

        //add 180 to the rotation because of course its 180 out.
        trailerRenderYaw += 180;


        //reverse engineer the trailer's render position from the hitch offset.
        double cRad = Math.toRadians(trailerRenderYaw);
        double cSin = Math.sin(cRad);
        double cCos = Math.cos(cRad);

        Vec3f hitchOffset = ((AbstractTowingChild) trailer).getReceiverOffset();
        trailerRenderX = receiverX - (cCos * hitchOffset.xCoord - cSin * hitchOffset.zCoord);
        double trailerRenderY = receiverY - hitchOffset.yCoord;
        trailerRenderZ = receiverZ - (cSin * hitchOffset.xCoord + cCos * hitchOffset.zCoord);

        //convert world render position to camera-relative.
        double camX = trailer.posX - x;
        double camY = trailer.posY - y;
        double camZ = trailer.posZ - z;

        double renderX = trailerRenderX - camX;
        double renderY = trailerRenderY - camY;
        double renderZ = trailerRenderZ - camZ;
        doRender(trailer, renderX, renderY, renderZ, trailerRenderYaw, ticks, renderModeGUI);
    }

    public void doRender(EntityTrailer trailer, double x, double y, double z, float yaw, float ticks, boolean renderModeGUI) {
        //init model if necessary
        if(trailer.modelInstance == null) {
            trailer.modelInstance=trailer.getModel();
            for (ModelRendererTurbo render : trailer.modelInstance.getParts()) {
                if (render.boxName == null || render.boxName.isEmpty()) {
                    continue;
                }

                //handle culling
                if (render.boxName.toLowerCase().contains("cull")) {
                    //render.boxName=render.boxName.replace("nocull","").replace("Nocull", "").replace("NoCull", "").replace("cull", "");
                    render.noCull = true;
                }

                //handle glow stuff
                if(BoxName.isLightBox(render.boxName)) {
                    trailer.modelInstance.ignoreLightObjects.add(render);
                }

                //handle wheels
                if(render.boxName.toLowerCase().contains("wheel")) {
                    if(render.boxName.toLowerCase().contains("front")) {
                        trailer.modelInstance.frontWheels.add(render);
                    }
                    //rear steering
                    else if (render.boxName.toLowerCase().contains("front2")) {
                        trailer.modelInstance.frontWheels2.add(render);
                    }
                    else {
                        trailer.modelInstance.backWheels.add(render);
                    }
                }
                //handle cullwheels
                if(render.boxName.toLowerCase().contains("cullwheel")) {
                    if(render.boxName.toLowerCase().contains("front")) {
                        trailer.modelInstance.frontWheels.add(render);
                        render.noCull = true;
                    }
                    //rear steering
                    else if (render.boxName.toLowerCase().contains("front2")) {
                        trailer.modelInstance.frontWheels2.add(render);
                        render.noCull = true;
                    }
                    else {
                        trailer.modelInstance.backWheels.add(render);
                        render.noCull = true;
                    }
                }
            }
        }

        // render objects that change lighting:
        JsonObject lightDetails = trailer.vehicleDataAsJsonObjectDW();
        for (ModelRendererTurbo lighting : trailer.modelInstance.ignoreLightObjects) {
            switch (lighting.boxName) {
                case "lamp":
                    // BoxName.headLight
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.isHeadlightsEnabled.AsString()).getAsBoolean();
                    break;
                case "brakeLight":
                    // BoxName.areBrakeLightsOn
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.areBrakeLightsOn.AsString()).getAsBoolean();
                    break;
                case "leftTurnLight":
                    // BoxName.turnSignal
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.turnSignal.AsString()).getAsByte() == -1 && (lightDetails.get(DataMemberName.turnSignalTick.AsString()).getAsByte() == 1);
                    break;
                case "rightTurnLight":
                    // BoxName.turnSignal
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.turnSignal.AsString()).getAsByte() == 1 && (lightDetails.get(DataMemberName.turnSignalTick.AsString()).getAsByte() == 1);
                    break;
                case "runningLights":
                    // BoxName.runningLight
                    //lighting.ignoresLighting = trailer.running > 0;
                    break;
                case "reverseLight":
                    lighting.ignoresLighting = trailer.getVelocity() < 0f;
                    break;
                case "commander":
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean() && trailer.ticksExisted % 30 == 0;
                    break;
                case "ditch":
                    lighting.ignoresLighting = lightDetails.get(DataMemberName.ditchLightMode.AsString()).getAsByte() > 0;
                    break;
                default:
                    if (lightDetails.get(DataMemberName.isBeaconEnabled.AsString()).getAsBoolean() && lighting.boxName.contains("prime")) {
                        switch (lightDetails.get(DataMemberName.beaconCycleIndex.AsString()).getAsByte()) {
                            case 0:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime1"));
                                break;
                            case 1:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime2"));
                                break;
                            case 2:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime3"));
                                break;
                            case 3:
                                lighting.ignoresLighting = (lighting.boxName.equals("prime4"));
                                break;
                        }
                    }
                    else {
                        lighting.ignoresLighting = false;
                    }
                    break;
            }
        }

        if (trailer.riddenByEntity != null /*&& trailer.running > 0*/) {
            // define the rotation angle, scale based on framerate.
            double rotation = (trailer.velocity/*throttle*/ * trailer.type().max_forward_speed * 0.000001) * (System.currentTimeMillis() - trailer.lastFrame) * 60;
            //rotate back wheels
            for (ModelRendererTurbo wheel : trailer.modelInstance.backWheels) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*trailer.wheelSpinMultiplier();
            }

            //rotate front wheels
            //todo: turn front wheels
            for (ModelRendererTurbo wheel : trailer.modelInstance.frontWheels) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*trailer.wheelSpinMultiplier();
                if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0) {
                    wheel.rotateAngleY = (trailer.turnRenderDegree(true));
                } else if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0) {
                    wheel.rotateAngleY = (trailer.turnRenderDegree(false));
                } else {
                    wheel.rotateAngleY = 0;
                }
            }

            //rotate front wheels, if they are actually on the back (forklift nonsense)
            //todo: turn front wheels
            for (ModelRendererTurbo wheel : trailer.modelInstance.frontWheels2) {
                if (wheel.rotateAngleZ > Math.PI * 10000 || wheel.rotateAngleZ < Math.PI * -10000) {
                    wheel.rotateAngleZ -= Math.copySign(Math.PI * 10000, wheel.rotateAngleZ);
                }
                wheel.rotateAngleZ -= rotation*trailer.wheelSpinMultiplier();

                if (Minecraft.getMinecraft().thePlayer.moveStrafing < 0) {
                    wheel.rotateAngleY = (trailer.turnRenderDegree(!trailer.type().rear_steer));
                } else if (Minecraft.getMinecraft().thePlayer.moveStrafing > 0) {
                    wheel.rotateAngleY = (trailer.turnRenderDegree(trailer.type().rear_steer));
                } else {
                    wheel.rotateAngleY = 0;
                }
            }
        }

        //apply GL effects
        GL11.glPushMatrix();
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1f);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glLightModelf(GL_LIGHT_MODEL_TWO_SIDE, GL_FALSE);
        GL11.glLightModelf(GL_LIGHT_MODEL_LOCAL_VIEWER, GL_TRUE);
        GL11.glShadeModel(GL_SMOOTH);
        GL11.glEnable(GL_NORMALIZE);
        //apply texture
        Tessellator.bindTexture(new ResourceLocation(FoxDrives.MODID,
                trailer.getSkins()[trailer.getDataWatcher().getWatchableObjectInt(20)]+".png"));
        //Minecraft.getMinecraft().getTextureManager().bindTexture();
        //reposition and rotation
        GL11.glTranslated(x,y+(0.625f*trailer.getModelScale().yCoord),z);

        if (trailer.getModelOffset() != null) {
            if (yaw != 0.0F) {
                float cos = MathHelper.cos(yaw * ((float) Math.PI / 180.0f));
                float sin = MathHelper.sin(yaw * ((float) Math.PI / 180.0f));

                GL11.glTranslatef(trailer.getModelOffset().xCoord * cos - trailer.getModelOffset().zCoord * sin,
                        trailer.getModelOffset().yCoord,
                        trailer.getModelOffset().xCoord * sin - trailer.getModelOffset().zCoord * cos);
            } else {
                GL11.glTranslatef(trailer.getModelOffset().xCoord, trailer.getModelOffset().yCoord, trailer.getModelOffset().zCoord);
            }
        }
        if (trailer.getModelRotation() != null) {
            GL11.glRotatef(trailer.getModelRotation().xCoord, 1, 0, 0);
            GL11.glRotatef(trailer.getModelRotation().yCoord, 0, 1, 0);
            GL11.glRotatef(trailer.getModelRotation().zCoord, 0, 0, 1);
        }
        GL11.glRotatef(-yaw + 90, 0, 1, 0);
        GL11.glRotatef(180,1,0,0);
        GL11.glRotatef(trailer.getRollingDirection(),0,0,1);
        GL11.glScalef(trailer.getModelScale().xCoord,trailer.getModelScale().yCoord,trailer.getModelScale().zCoord);

        int skyLight = trailer.worldObj.getLightBrightnessForSkyBlocks(MathHelper.floor_double(trailer.posX), MathHelper.floor_double(trailer.posY), MathHelper.floor_double(trailer.posZ), 0);
        if (!renderModeGUI) {
            GL11.glEnable(GL11.GL_LIGHTING);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, skyLight % 65536,
                    skyLight / 65536f);
        } else {
            if (renderGUIFullBright)
                GL11.glDisable(GL11.GL_LIGHTING);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f,
                    240f);
        }

        //render
        trailer.modelInstance.render(trailer, 0,0,0,0,0, 0.625f);
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
    /**
     * completley useless, but necessary to include.
     */
    @Override
    protected ResourceLocation getEntityTexture(Entity p_110775_1_) { return null; }

    /**Overriding this to make it stop throwing irrelevant errors in the logs
     *
     * @param p_bindEntityTexture_1_
     */
    @Override
    protected void bindEntityTexture(Entity p_bindEntityTexture_1_) { }

    /**
     * @author 02skaplan
     * @param renderModeGUI GUI lighting flag
     * 	<p>Flag of whether to allow in-game lighting conditions to effect light levels of rendered entity.
     *  <b>Set to true if rendering in a GUI and set back to false when done.</b></p>
     */
    public static void setRenderModeGUI(boolean renderModeGUI) { RenderCar.renderModeGUI = renderModeGUI; }

    /**
     * @param renderGUIFullBright Flag of whether to allow any lighting on a rendered entity. This will cause the entity to render
     * unnaturally bright, which may or may not be desired.
     */
    public static void setRenderGUIFullBright(boolean renderGUIFullBright) { RenderCar.renderGUIFullBright = renderGUIFullBright; }
}
