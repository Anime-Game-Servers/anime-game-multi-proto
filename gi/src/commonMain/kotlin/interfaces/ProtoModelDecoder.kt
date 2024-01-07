package interfaces

import org.anime_game_servers.core.base.Version

interface ProtoModelDecoder<T> {
    fun parseBy(data: ByteArray, version: Version): T
}