package org.anime_game_servers.multi_proto.gi.data.activity.bartender

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_5_0)
@ProtoCommand(RESPONSE)
internal interface BartenderCompleteOrderRsp {
    var retcode: Retcode
    var affixList: List<Int>
    var finishOrderId: Int
    var formulaId: Int
    var questId: Int
    @AddedIn(GI_2_6_0)
    var isNew: Boolean
}
