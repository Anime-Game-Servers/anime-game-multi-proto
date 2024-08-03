package org.anime_game_servers.multi_proto.core.interfaces

import org.anime_game_servers.core.base.Version

fun interface ProtoModelDecoder<T> {
    fun parseBy(data: ByteArray, version: Version): T
}