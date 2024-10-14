package org.anime_game_servers.multi_proto.core.interfaces

interface PacketIdProvider {
    fun getPacketId(packetName:String) : Int
    fun getPacketName(packetId:Int) : String?
}
