package org.anime_game_servers.multi_proto.gi.data.mail

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface GetAuthkeyRsp {
    var authAppid: String
    var authKey: String
    var authkeyVer: Int
    var gameBiz: String
    var signType: Int
    var retCode: Int
}
