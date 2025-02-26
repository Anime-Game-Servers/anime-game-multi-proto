package org.anime_game_servers.multi_proto.core.annotations

import kotlin.reflect.KClass

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Converter(val inType: KClass<*>, val outType: KClass<*>)

@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
annotation class Converters(vararg val converters: KClass<out TypeConverter<*,*>>)

interface TypeConverter<IN: Any, OUT:Any> {
    fun inToOut(inData:IN): OUT
    fun outToIn(outData:OUT): IN
}