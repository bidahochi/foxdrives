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

public class PacketSyncHitch implements IMessage {

    private int entityID;
    private int stateOrdinal;
    private int coupledChildID;

    public PacketSyncHitch() {}

    public PacketSyncHitch(int entityID, HitchState hitchState, int coupledChildID) {
        this.entityID = entityID;
        this.stateOrdinal = hitchState.ordinal();
        this.coupledChildID = coupledChildID;
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(entityID);
        buf.writeByte(stateOrdinal);
        buf.writeInt(coupledChildID);
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        entityID = buf.readInt();
        stateOrdinal = buf.readByte();
        coupledChildID = buf.readInt();
    }

    public static class Handler implements IMessageHandler<PacketSyncHitch, IMessage> {


        @Override
        public IMessage onMessage(PacketSyncHitch message, MessageContext ctx) {
            if (ctx.side == Side.CLIENT) {
                AbstractTowingParent parent = (AbstractTowingParent) Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);
                if (parent != null) {
                    parent.hitchState = HitchState.values()[message.stateOrdinal];
                    parent.setChildVehicle((ITowingChild) Minecraft.getMinecraft().theWorld.getEntityByID(message.coupledChildID));
                    ((AbstractTowingChild) Minecraft.getMinecraft().theWorld.getEntityByID(message.coupledChildID)).setParentVehicle(parent);
                }
            }
            return null;
        }
    }

}
