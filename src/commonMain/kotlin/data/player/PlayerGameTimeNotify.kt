package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.V2_2_0

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerGameTimeNotify {
    var uid: Int
    var gameTime: Int
    @AddedIn(V2_2_0)
    var isHome: Boolean
}
