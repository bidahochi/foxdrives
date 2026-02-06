package bidahochi.foxdrives.common.inventory.enums;

public enum InventorySize
{
    STYLE_PROFILE_0x0((byte)0),
    STYLE_PROFILE_3x3((byte)9),
    STYLE_PROFILE_3x5((byte)15),
    STYLE_PROFILE_3x7((byte)21),
    STYLE_PROFILE_3x9((byte)27);

    public final byte SlotCount;
    InventorySize(byte slotCount)
    {
        SlotCount = slotCount;
    }
}