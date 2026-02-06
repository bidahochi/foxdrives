package bidahochi.foxdrives.util;

import java.util.*;

/**Enums that cause special rendering to occur
 *
 */
public enum BoxName
{
    cull("cull"),
    cullwheel("cullwheel"),
    cullwheelfront("cullwheelfront"),
    ditch("ditch"),
    prime1("prime1"),
    prime2("prime2"),
    prime3("prime3"),
    prime4("prime4"),
    commander("commander"),
    runningLight("runningLight"),
    headLight("lamp"),
    leftTurnLight("leftTurnLight"),
    rightTurnLight("rightTurnLight"),
    brakeLight("brakeLight"),
    reverseLight("reverseLight");

    public final String BoxName;

    /**Constructor for BoxName
     *
     * @param boxName
     */
    BoxName(String boxName)
    {
        BoxName = boxName;
    }

    public static Set<BoxName> lightBoxesList = EnumSet.of(headLight, leftTurnLight, rightTurnLight, brakeLight, ditch, runningLight, commander, prime1, prime2, prime3, prime4, reverseLight);


    /**Determines if the boxName is a box that functions as a light
     *
     * @param boxName
     * @return
     */
    public static boolean isLightBox(String boxName)
    {
        for (BoxName box : lightBoxesList)
        {
            if (box.AsString().equals(boxName))
            {
                return true;
            }
        }
        return false;
    }

    public String AsString()
    {
        return this.BoxName;
    }
}
