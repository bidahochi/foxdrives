package bidahochi.foxdrives.util;

import bidahochi.foxdrives.FoxDrives;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.io.File;

import static net.minecraftforge.common.config.Configuration.CATEGORY_GENERAL;

public class ConfigHandler {
    public static float SPEED_MULTIPLIER;
    public static boolean DO_WRAP_ANIMATION;

    public static String[] TRANSPORT_INVENTORY_BLACKLIST_RAW;

    public static boolean TRANSPORT_INVENTORY_BAN_OPEN_FLUID_CONTAINERS;

    public static void init(File configFile) {
        Configuration cf = new Configuration(configFile, "1.0");

        try
        {
            final String CATEGORY_INVENTORY = "CATEGORY_INVENTORY";
            cf.load();
            /* General */
            Property SPEED_MULTIPLIER_PROP = cf.get(CATEGORY_GENERAL, "SPEED_MULTIPLIER", 1.0);
            SPEED_MULTIPLIER_PROP.comment = "This is a value to modify the maximum speed of every vehicle in the mod. Default value is 1.0.";
            SPEED_MULTIPLIER = (float) SPEED_MULTIPLIER_PROP.getDouble();
            Property DO_WRAP_ANIMATION_PROP = cf.get(CATEGORY_GENERAL, "DO_WRAP_ANIMATION", true);
            DO_WRAP_ANIMATION_PROP.comment = "This value sets whether the Car Wrap GUI menu will animate the models by default.";
            DO_WRAP_ANIMATION = DO_WRAP_ANIMATION_PROP.getBoolean();

            TRANSPORT_INVENTORY_BLACKLIST_RAW = cf.get(CATEGORY_INVENTORY, "TRANSPORT_INVENTORY_BLACKLIST_RAW",
                    new String[]
                            {
                                    "ThermalFoundation:Storage:0-15",
                                    "ThermalExpansion:Cache",
                                    "ThermalExpansion:Strongbox",
                                    "etfuturum:shulker_box",
                                    "ImmersiveEngineering:woodenDevice"
                            },
                    "List of banned INVENTORY items").getStringList();
            TRANSPORT_INVENTORY_BAN_OPEN_FLUID_CONTAINERS = cf.get(CATEGORY_INVENTORY, "ROLLINGSTOCK_INVENTORY_BAN_OPEN_FLUID_CONTAINERS",
                    false, "Blocks open fluid containers from being stored in Freight Cars").getBoolean(false);

        } catch (Exception e) {
            FoxDrives.fdLog.fatal("FoxDrives had a problem loading its configuration\n" + e);
        }
        finally {
            if (cf.hasChanged()) {
                cf.save();
            }
        }
    }
}
