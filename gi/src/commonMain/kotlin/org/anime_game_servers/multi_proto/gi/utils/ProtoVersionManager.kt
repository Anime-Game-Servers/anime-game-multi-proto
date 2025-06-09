package org.anime_game_servers.multi_proto.gi.utils

expect object ProtoVersionManager {
    fun <T> encodeToByteArray(version: String, className: String, model: T): ByteArray?

    fun <T> decodeFromByteArray(version: String, className: String, byteArray: ByteArray): T?

    fun <T> encodeValue(version: String, className: String, model: T): Int?

    fun <T> decodeValue(version: String, className: String, value: Int): T?
}