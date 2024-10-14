package org.anime_game_servers.multi_proto.gi.data.activity.luna_rite

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_1_0)
@ProtoCommand(RESPONSE)
internal interface LunaRiteHintPointRsp {
    var retcode: Retcode
    var areaId: Int
    var hintPoint: List<LunaRiteHintPoint>
    var hintStatus: LunaRiteHintStatusType
}
