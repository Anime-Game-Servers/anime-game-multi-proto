package org.anime_game_servers.multi_proto.core.interfaces

import org.anime_game_servers.core.base.Version

fun interface ProtoModel {
    fun encodeToByteArray(version: Version) : ByteArray?
}