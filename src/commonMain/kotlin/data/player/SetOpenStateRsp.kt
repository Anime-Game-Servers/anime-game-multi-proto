package data.player

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.RESPONSE)
internal interface SetOpenStateRsp {
    var key: Int
    var value: Int
    var retcode: Int
}
