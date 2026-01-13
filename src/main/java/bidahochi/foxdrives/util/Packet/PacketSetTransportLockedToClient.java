package bidahochi.foxdrives.util.Packet;

import bidahochi.foxdrives.FoxDrives;
import bidahochi.foxdrives.entities.BaseEntityVehicle.EntityCar;
import bidahochi.foxdrives.entities.util.TrustedPlayer;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;

import java.util.ArrayList;
import java.util.List;

public class PacketSetTransportLockedToClient implements IMessage
{
    boolean	bool;
    boolean requestPacket;
    int	entityID;
    int playerEntityID;
    boolean propagate;
    List<TrustedPlayer> trustedList = new ArrayList<>();

    @SuppressWarnings("unused")
    public PacketSetTransportLockedToClient()
    {

    }

    /**
     * <p>Client <-> Server communication packet to update lock and trusted list.</p>
     * @param bool Locked status. True for locked, false for unlocked.
     * @param trustedList Trusted players list.
     * @param propagate Whether to propagate the changes throughout the consist.
     */
    public PacketSetTransportLockedToClient(boolean bool, List<TrustedPlayer> trustedList, int trainEntity, boolean propagate) {
        this.bool = bool;
        this.entityID = trainEntity;
        this.trustedList = trustedList;
        this.propagate = propagate;
        requestPacket = false;
    }

    /**
     * <p>Client -> Server communication packet to request lock and trusted list from server.</p>
     */
    public PacketSetTransportLockedToClient(int trainEntity, int playerEntityID) {
        this.entityID = trainEntity;
        this.playerEntityID = playerEntityID;
        requestPacket = true;
    }

    @Override
    public void fromBytes(ByteBuf bbuf) {
        this.entityID = bbuf.readInt();
        if (!bbuf.readBoolean()) {
            requestPacket = false;
            this.bool = bbuf.readBoolean();
            int numberOfTrustedPlayers = bbuf.readInt();
            for (int i = 0; i < numberOfTrustedPlayers; i++) {
                trustedList.add(new TrustedPlayer(ByteBufUtils.readUTF8String(bbuf), bbuf.readBoolean()));
            }
            propagate = bbuf.readBoolean();
        } else {
            requestPacket = true;
            this.playerEntityID = bbuf.readInt();
        }
    }

    @Override
    public void toBytes(ByteBuf bbuf) {
        bbuf.writeInt(this.entityID);
        bbuf.writeBoolean(requestPacket);
        if (!requestPacket) {
            bbuf.writeBoolean(this.bool);
            bbuf.writeInt(trustedList.size());
            for (TrustedPlayer trustedPlayer : trustedList) {
                ByteBufUtils.writeUTF8String(bbuf, trustedPlayer.getDisplayName());
                bbuf.writeBoolean(trustedPlayer.hasBreakAccess());
            }
            bbuf.writeBoolean(propagate);
        } else {
            bbuf.writeInt(playerEntityID);
        }
    }

    public static class Handler implements IMessageHandler<PacketSetTransportLockedToClient, IMessage> {

        @Override
        public IMessage onMessage(PacketSetTransportLockedToClient message, MessageContext context)
        {
            if (context.side.isServer()) {
                Entity transportEntity = context.getServerHandler().playerEntity.worldObj.getEntityByID(message.entityID);
                if (!message.requestPacket) {
                    if (transportEntity instanceof EntityCar) {
                        ((EntityCar) transportEntity).setTransportLockedFromPacket(message.bool);
                        ((EntityCar) transportEntity).setTrustedList(message.trustedList);
                        FoxDrives.lockChannel.sendToAllAround(new PacketSetTransportLockedToClient(message.bool, message.trustedList, message.entityID, false), new NetworkRegistry.TargetPoint(transportEntity.dimension, transportEntity.posX, transportEntity.posY, transportEntity.posZ, 256D));


                    }
                }
                else {
                    if (transportEntity instanceof EntityCar) {
                        if (context.getServerHandler().playerEntity.worldObj.getEntityByID(message.playerEntityID) != null) {
                            FoxDrives.lockChannel.sendTo(new PacketSetTransportLockedToClient(((EntityCar) transportEntity).getTransportLockedFromPacket(), ((EntityCar) transportEntity).getTrustedList(), message.entityID, false), ((EntityPlayerMP) context.getServerHandler().playerEntity.worldObj.getEntityByID(message.playerEntityID)));
                        }
                    }
                }
            }
            else {
                if (!message.requestPacket) {
                    Entity TrainEntity = Minecraft.getMinecraft().theWorld.getEntityByID(message.entityID);
                    if (TrainEntity instanceof EntityCar) {
                        ((EntityCar) TrainEntity).setTrustedList(message.trustedList);
                        ((EntityCar) TrainEntity).setTransportLockedFromPacket(message.bool);
                    }
                }
            }
            return null;
        }
    }
}
