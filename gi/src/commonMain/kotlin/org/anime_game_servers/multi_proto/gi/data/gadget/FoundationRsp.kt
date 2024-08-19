package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_3_0)
@ProtoCommand(RESPONSE)
internal interface FoundationRsp {
    var buildingId: Int
    var gadgetEntityId: Int
    var opType: FoundationOpType
    var pointConfigId: Int
    var retCode: Int
}