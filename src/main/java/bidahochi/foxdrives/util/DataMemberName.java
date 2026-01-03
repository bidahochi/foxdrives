package bidahochi.foxdrives.util;

/**
 * Enum that contains all of the data member names for data watchers and NBTTagCompound
 */
public enum DataMemberName
{
    vehicleOwner("vehicleOwner"),
    vehicleCreator("vehicleCreator"),
    isHeadlightsEnabled("isHeadlightsEnabled"),
    areBrakeLightsOn("areBrakeLightsOn"),
    turnSignal("turnSignal"),
    turnSignalTick("turnSignalTick"),
    isBeaconEnabled("isBeaconEnabled"),
    beaconCycleIndex("beaconCycleIndex"),
    ditchLightMode("ditchLightMode"),
    vehicleDetailsJSONString("vehicleDetailsJSONString"),
    vehicleDetailsJSON("vehicleDetailsJSON");

    public final String MemberName;

    /**Constructor for DataMemberName
     *
     * @param memberName
     */
    DataMemberName(String memberName)
    {
        MemberName = memberName;
    }

    public String AsString()
    {
        return this.MemberName;
    }
}
