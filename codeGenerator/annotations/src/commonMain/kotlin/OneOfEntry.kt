package org.anime_game_servers.annotations

import kotlin.reflect.KClass

@Target(AnnotationTarget.PROPERTY)
annotation class OneOfEntry(val type: KClass<*>, vararg val name: String, val addedIn: Int = 0, val removedIn: Int=99999)
