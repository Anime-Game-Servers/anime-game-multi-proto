@file:Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")

package org.anime_game_servers.multi_proto.core.interfaces

import org.anime_game_servers.core.base.Version
import kotlin.reflect.KClass

abstract class BaseProtocolRegistry{
    private val protocolHandlers : MutableMap<Version, ProtocolHandler> = mutableMapOf()

    fun registerHandler(version: Version, handler: ProtocolHandler) {
        this.protocolHandlers[version] = handler
    }

    fun <T : ProtoModel> encodeToByteArray(version: Version, model: T, kClass: KClass<T>) : ByteArray? {
        return protocolHandlers[version]?.encodeToByteArray(version, model, kClass)
    }
    fun <T : ProtoModel> decodeFromByteArray(version: Version, data: ByteArray, kClass: KClass<T>) : T? {
        return protocolHandlers[version]?.decodeFromByteArray(version, data, kClass)
    }
    fun <T : ProtoEnum> encodeEnum(version: Version, model: T, kClass: KClass<T>) : Int? {
        return protocolHandlers[version]?.encodeEnum(version, model, kClass)
    }
    fun <T : ProtoEnum> decodeEnum(version: Version, data: Int, kClass: KClass<T>) : T? {
        return protocolHandlers[version]?.decodeEnum(version, data, kClass)
    }
}

expect object ProtocolRegistry : BaseProtocolRegistry