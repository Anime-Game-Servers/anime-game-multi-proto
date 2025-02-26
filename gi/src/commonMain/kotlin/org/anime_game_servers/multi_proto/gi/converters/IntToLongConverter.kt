package org.anime_game_servers.multi_proto.gi.converters

import org.anime_game_servers.multi_proto.core.annotations.Converter
import org.anime_game_servers.multi_proto.core.annotations.TypeConverter

@Converter(Int::class, Long::class)
object IntToLongConverter : TypeConverter<Int, Long> {
    override fun inToOut(inData: Int): Long = inData.toLong()
    override fun outToIn(outData: Long): Int = outData.toInt()
}