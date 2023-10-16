package data.player

import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@ProtoCommand(CommandType.RESPONSE)
interface ChangeGameTimeRsp {
    var extraDays: Int
    var curGameTime: Int
    var retCode: Int
}