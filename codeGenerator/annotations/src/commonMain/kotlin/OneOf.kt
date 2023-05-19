package org.anime_game_servers.annotations

import kotlin.reflect.KClass

@Target(AnnotationTarget.PROPERTY)
annotation class OneOf(vararg val types: KClass<*>)
