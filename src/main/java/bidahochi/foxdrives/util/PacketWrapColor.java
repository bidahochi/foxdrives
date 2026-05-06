package bidahochi.foxdrives.util;

import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.BaseEntityVehicle.IWrappable;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;

import static bidahochi.foxdrives.util.FoxDrivesConstants.DW_SKIN;

/**
 * @author 02skaplan
 * <p>Client → Server packet to update the wrap color from the wrap GUI.</p>
 */
public class PacketWrapColor implements IMessage {

    int wrapColor;
    int	entityID;
    // Do not delete the no-parameter constructor — Forge will become very angry. :P
    public PacketWrapColor() {}
    public PacketWrapColor(int wrapColor, int carEntity) {
        this.wrapColor = wrapColor;
        this.entityID = carEntity;
    }
    @Override
    public void fromBytes(ByteBuf bbuf) {
        this.wrapColor = bbuf.readInt();
        this.entityID = bbuf.readInt();
    }
    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(this.wrapColor);
        bbuf.writeInt(this.entityID);
    }
    public static class Handler implements IMessageHandler<PacketWrapColor, IMessage> {
        @Override
        public IMessage onMessage(PacketWrapColor message, MessageContext context) {
            Entity carEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
            if (carEntity instanceof IWrappable) {
                carEntity.getDataWatcher().updateObject(DW_SKIN, message.wrapColor);
            }
            return null;
        }
    }
}
