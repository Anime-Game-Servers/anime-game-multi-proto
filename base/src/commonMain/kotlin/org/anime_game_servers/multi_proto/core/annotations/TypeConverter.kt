package org.anime_game_servers.multi_proto.core.annotations

import org.anime_game_servers.core.base.Version
import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Converter(val inType: KClass<*>, val outType: KClass<*>)

@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
annotation class Converters(vararg val converters: KClass<out TypeConverter<*,*>>)

interface TypeConverter<IN: Any, OUT:Any> {
    fun inToOut(inData:IN, version: Version): OUT
    fun outToIn(outData:OUT, version: Version): IN
}