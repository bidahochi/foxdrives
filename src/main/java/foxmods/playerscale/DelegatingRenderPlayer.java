package foxmods.playerscale;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

@SideOnly(Side.CLIENT)
public class DelegatingRenderPlayer extends RenderPlayer {

    public interface Delegate {
        /**
         * Called inside doRender(). Return true if you pushed GL state.
         */
        boolean doRender(net.minecraft.client.entity.AbstractClientPlayer player, double x, double y, double z, float yaw, float partialTick);
    }

    private static final List<Delegate> DELEGATES = new ArrayList<>();
    private static RenderPlayer INSTANCE = null; // singleton renderer

    /**
     * Attempt to install the renderer (first mod wins)
     */
    public static void registerRenderer() {
        if (INSTANCE != null) return; // already installed
        INSTANCE = new DelegatingRenderPlayer();
        RenderingRegistry.registerEntityRenderingHandler(EntityPlayer.class, INSTANCE);
    }

    /**
     * Any mod can register its delegate logic
     */
    public static void registerDelegate(Delegate d) {
        DELEGATES.add(d);
    }

    @Override
    public void doRender(AbstractClientPlayer player,
                         double x, double y, double z,
                         float yaw, float partialTick) {

        // Execute each mod's delegate first
        for (Delegate d : DELEGATES)
        {
            if (d.doRender(player, x, y, z, yaw, partialTick))
            {
                super.doRender(player, x, y, z, yaw, partialTick);
                GL11.glPopMatrix();
                return;
            }
        }

        // Then call vanilla rendering
        super.doRender(player, x, y, z, yaw, partialTick);
    }
}
