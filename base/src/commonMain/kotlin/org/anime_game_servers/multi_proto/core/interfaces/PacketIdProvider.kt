package org.anime_game_servers.multi_proto.core.interfaces

interface PacketIdProvider {
    fun getPacketId(packageName:String) : Int
    fun getPacketName(packageId:Int) : String?
}