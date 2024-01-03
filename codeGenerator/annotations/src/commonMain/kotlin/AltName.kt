package org.anime_game_servers.annotations

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
annotation class AltName(vararg val altNames: String)