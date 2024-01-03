package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.REQUEST)
internal interface SetOpenStateReq {
    var key: Int
    var value: Int
}
