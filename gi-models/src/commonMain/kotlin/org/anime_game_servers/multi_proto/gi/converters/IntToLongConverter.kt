package org.anime_game_servers.multi_proto.gi.converters

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.core.annotations.Converter
import org.anime_game_servers.multi_proto.core.annotations.TypeConverter

@Converter(Int::class, Long::class)
object IntToLongConverter : TypeConverter<Int, Long> {
    override fun inToOut(inData: Int, version: Version): Long = inData.toLong()
    override fun outToIn(outData: Long, version: Version): Int {
        if(outData > Int.MAX_VALUE)
            println("[WARN] value to big for a proper Long to Int conversion, value is $outData, version is $version")
        return outData.toInt()
    }
}