package org.anime_game_servers.multi_proto.core.interfaces

import org.anime_game_servers.core.base.Version

interface ProtoModel {
    var unknownFields: Map<Int, Any>
    fun encodeToByteArray(version: Version) : ByteArray?
}