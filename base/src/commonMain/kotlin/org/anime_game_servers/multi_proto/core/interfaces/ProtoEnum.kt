package org.anime_game_servers.multi_proto.core.interfaces

import org.anime_game_servers.core.base.Version

fun interface ProtoEnum {
    fun encode(version: Version) : Int?
}