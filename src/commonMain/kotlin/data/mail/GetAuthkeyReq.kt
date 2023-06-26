package data.mail

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.REQUEST)
interface GetAuthkeyReq {
    var authAppid: String
    var signType: Int
    var authkeyVer: Int
}