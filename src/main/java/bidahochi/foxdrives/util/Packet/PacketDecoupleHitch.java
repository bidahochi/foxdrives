package bidahochi.foxdrives.util.Packet;

import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingChild;
import bidahochi.foxdrives.entities.BaseEntityVehicle.AbstractTowingParent;
import bidahochi.foxdrives.entities.BaseEntityVehicle.ITowingChild;
import bidahochi.foxdrives.entities.util.HitchState;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;

public class PacketDecoupleHitch implements IMessage {

    private int parentEntity;
    private int hitchStateOrdinal;
    private int childEntity;

    public PacketDecoupleHitch() {}

    public PacketDecoupleHitch(int entityID, HitchState hitchState, int coupledChildID) {
        this.parentEntity = entityID;
        this.hitchStateOrdinal = hitchState.ordinal();
        this.childEntity = coupledChildID;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(parentEntity);
        buf.writeByte(hitchStateOrdinal);
        buf.writeInt(childEntity);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        parentEntity = buf.readInt();
        hitchStateOrdinal = buf.readByte();
        childEntity = buf.readInt();
    }

    public static class Handler implements IMessageHandler<PacketDecoupleHitch, IMessage> {


        @Override
        public IMessage onMessage(PacketDecoupleHitch message, MessageContext ctx) {
            if (ctx.side == Side.CLIENT) {
                AbstractTowingParent parent = (AbstractTowingParent) Minecraft.getMinecraft().theWorld.getEntityByID(message.parentEntity);
                AbstractTowingChild child = (AbstractTowingChild) Minecraft.getMinecraft().theWorld.getEntityByID(message.childEntity);
                if (parent != null && child != null) {
                    parent.hitchState = HitchState.values()[message.hitchStateOrdinal];
                    parent.setLinkedChildID(-1);
                    parent.setChildVehicle(null);
                    child.setLinkedParentID(-1);
                    child.setParentVehicle(null);
                }
            }
            return null;
        }
    }

}
