package org.anime_game_servers.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class ProtoModel(val parentClass: String = "", vararg val alternativeNames: String)
