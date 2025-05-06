package org.anime_game_servers.multi_proto.gi.interfaces

// the generated Kotlin code should be something like:
// abstract class Handler: VersionedMessageHandler {
//   companion object: VersionedMessageHandler {
//     @JvmStatic
//     override fun encodeToByteArray() {...}
//     @JvmStatic
//     override fun decodeFromByteArray() {...}
//   }
// }
interface VersionedMessageHandler<T> {
    fun encodeToByteArray(model: T) : ByteArray
    fun decodeFromByteArray(byteArray: ByteArray): T
}

interface VersionedEnumHandler<T: Enum<T>> {
    fun encodeValue(model: T): Int
    fun decodeValue(value: Int): T
}
