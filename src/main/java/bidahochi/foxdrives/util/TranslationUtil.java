package bidahochi.foxdrives.util;

import net.minecraft.util.StatCollector;

public class TranslationUtil
{
    public static String translate(String translate)
    {
        return translate==null?"": StatCollector.translateToLocal(translate);
    }
}
