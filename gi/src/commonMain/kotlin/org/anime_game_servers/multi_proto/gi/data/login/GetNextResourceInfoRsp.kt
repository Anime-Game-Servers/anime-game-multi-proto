package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.server.ResVersionConfig

@AddedIn(GI_1_2_0)
@ProtoCommand(RESPONSE)
internal interface GetNextResourceInfoRsp {
    var nextResVersionConfig: ResVersionConfig
    var nextResourceUrl: String
    var retcode: Int
}
