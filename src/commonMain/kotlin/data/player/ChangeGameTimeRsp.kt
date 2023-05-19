package data.player

import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@ProtoCommand(CommandType.RESPONSE)
interface ChangeGameTimeRsp {
    val extraDays: Int
    val curGameTime: Int
    val retCode: Int
}