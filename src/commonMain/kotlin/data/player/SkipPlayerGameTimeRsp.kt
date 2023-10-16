package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V3_4_0)
@ProtoCommand(CommandType.RESPONSE)
interface SkipPlayerGameTimeRsp {
    var clientGameTime: Int
    var gameTime: Int
    var retCode: Int
}