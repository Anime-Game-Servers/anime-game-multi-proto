package org.anime_game_servers.multi_proto.core.interfaces

import org.anime_game_servers.core.base.Version
import kotlin.reflect.KClass

object ProtocolRegistry {
    fun <T : ProtoModel> encodeToByteArray(version: Version, model: T, kClass: KClass<T>) : ByteArray? {
        return null
    }
    fun <T : ProtoModel> decodeFromByteArray(version: Version, data: ByteArray, kClass: KClass<T>) : T? {
        return null
    }
    fun <T : ProtoEnum> encodeEnum(version: Version, model: T, kClass: KClass<T>) : Int? {
        return null
    }
    fun <T : ProtoEnum> decodeEnum(version: Version, data: Int, kClass: KClass<T>) : T? {
        return null
    }
}