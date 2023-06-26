package data.mail

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoCommand
import messages.VERSION

@AddedIn(VERSION.VCB1)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.REQUEST)
interface GetAllMailReq {
    @AddedIn(VERSION.V2_4_0)
    var isCollected : Boolean
}