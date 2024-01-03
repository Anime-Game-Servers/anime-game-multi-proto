package org.anime_game_servers.annotations

@Target(AnnotationTarget.PROPERTY)
annotation class OneOf(vararg val types: OneOfEntry, val allowTypedBasedMapping: Boolean = true)
