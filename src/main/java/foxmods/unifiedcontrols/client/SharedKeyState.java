package foxmods.unifiedcontrols.client;

public final class SharedKeyState {

    private static boolean gui;
    public static boolean gui()
    {
        return gui;
    }
    private static boolean left;
    public static boolean left()
    {
        return left;
    }
    private static boolean right;
    public static boolean right()
    {
        return right;
    }
    private static boolean brake;

    public static boolean brake()
    {
        return brake;
    }

    private static boolean horn;

    public static boolean horn()
    {
        return horn;
    }

    private static boolean sound_2;

    public static boolean sound_2()
    {
        return sound_2;
    }



    private SharedKeyState() {}

    /** Poll keys — can be called by every mod independently */
    public static void poll() {
        gui = UnifiedKeyRegistry.GUI.isPressed();
        left      = UnifiedKeyRegistry.LEFT.isPressed();
        right     = UnifiedKeyRegistry.RIGHT.isPressed();
        brake     = UnifiedKeyRegistry.BRAKE.isPressed();
        horn     = UnifiedKeyRegistry.HORN.isPressed();
        sound_2     = UnifiedKeyRegistry.SOUND_2.isPressed();
    }
}