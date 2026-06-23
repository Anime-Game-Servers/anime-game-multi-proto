package org.anime_game_servers.multi_proto.gi.packet_id

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.core.interfaces.PacketIdProvider
import kotlin.jvm.JvmStatic

object PacketIds {
    private val registeredHandlers: MutableMap<Version, PacketIdProvider> = mutableMapOf()

    @JvmStatic
    fun registerProvider(version: Version, packetIdProvider: PacketIdProvider) {
        registeredHandlers[version] = packetIdProvider
    }

    @JvmStatic
    fun getMapper(version:Version) : PacketIdProvider?{
        if(registeredHandlers.containsKey(version)){
            return registeredHandlers[version]
        }
        return StaticPackageIds.getMapper(version)
    }
}