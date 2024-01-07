package interfaces

import org.anime_game_servers.core.base.Version

interface ProtoModel {
    fun encodeToByteArray(version: Version) : ByteArray?
}