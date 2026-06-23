package common

import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.asTypeName
import kotlin.reflect.KFunction
import kotlin.reflect.typeOf

inline fun <reified T>  funSpecFromCallable(function: KFunction<T>) : FunSpec.Builder{
    val type = typeOf<T>()
    return FunSpec.builder(function.name)
        .addModifiers(KModifier.OVERRIDE)
        .apply {
            // TODO find out why reflection doesn't work and fix it
            /*function.parameters.forEach { parameter ->
                addParameter(parameter.name!!, parameter.type.asTypeName())
            }*/
            returns(type.asTypeName())
        }
}
