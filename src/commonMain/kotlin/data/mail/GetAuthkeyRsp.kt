package data.mail

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(org.anime_game_servers.annotations.CommandType.RESPONSE)
interface GetAuthkeyRsp {
    var authKey: String
    var authAppid: String
    var signType: Int
    var authkeyVer: Int
    var gameBiz: String
    var retCode: Int
}