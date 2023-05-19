package org.anime_game_servers.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class ProtoCommand(val type: CommandType){

}