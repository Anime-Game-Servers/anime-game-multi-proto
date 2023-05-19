package data.player

import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@ProtoCommand(CommandType.REQUEST)
interface ChangeGameTimeReq {
    var extraDays: Int
    var gameTime: Int
    var isForceSet: Boolean
}