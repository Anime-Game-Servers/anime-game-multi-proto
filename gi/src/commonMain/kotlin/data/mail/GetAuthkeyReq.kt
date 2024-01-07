package data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST)
interface GetAuthkeyReq {
    var authAppid: String
    var signType: Int
    var authkeyVer: Int
}