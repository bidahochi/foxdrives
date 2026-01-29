package foxmods.unifiedcontrols.client;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.launchwrapper.Launch;
import org.lwjgl.input.Keyboard;

import java.util.Map;

public final class UnifiedKeyRegistry {

    private static final String KEY = "unifiedcontrols.registry";
    private static final String CATEGORY = "key.categories.unifiedcontrols";

    public static KeyBinding GUI;
    public static KeyBinding LEFT;
    public static KeyBinding RIGHT;
    public static KeyBinding BRAKE;

    public static KeyBinding HORN;
    public static KeyBinding SOUND_2;

    private UnifiedKeyRegistry() {}

    /** Initializes keys, registers them if not already done */
    public static void init() {
        Map<String, Object> bb = Launch.blackboard;
        if (bb.containsKey(KEY)) {
            // Already registered: reuse
            Object data = bb.get(KEY);
            if (data instanceof KeyBinding[]) {
                KeyBinding[] keys = (KeyBinding[]) data;
                GUI = keys[0];
                LEFT      = keys[1];
                RIGHT     = keys[2];
                BRAKE     = keys[3];
                HORN      = keys[4];
                SOUND_2   = keys[5];
            }
            return;
        }

        GUI = new KeyBinding("Open Vehicle GUI", Keyboard.KEY_R, CATEGORY);
        LEFT      = new KeyBinding("Left Indicator", Keyboard.KEY_LEFT, CATEGORY);
        RIGHT     = new KeyBinding("Right Indicator", Keyboard.KEY_RIGHT, CATEGORY);
        BRAKE     = new KeyBinding("Brake", Keyboard.KEY_B, CATEGORY);
        HORN = new KeyBinding("Transport Horn", Keyboard.KEY_H, CATEGORY);
        SOUND_2 = new KeyBinding("Transport Secondary Sound (Bell)", Keyboard.KEY_B, CATEGORY);

        ClientRegistry.registerKeyBinding(GUI);
        ClientRegistry.registerKeyBinding(LEFT);
        ClientRegistry.registerKeyBinding(RIGHT);
        ClientRegistry.registerKeyBinding(BRAKE);
        ClientRegistry.registerKeyBinding(HORN);
        ClientRegistry.registerKeyBinding(SOUND_2);

        bb.put(KEY, new KeyBinding[]{GUI, LEFT, RIGHT, BRAKE, HORN, SOUND_2});
    }
}