package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_0_0)
@ProtoCommand(RESPONSE)
internal interface ProjectorOptionRsp {
    var entityId: Int
    var opType: ProjectorOpType
    var retCode: Int
}