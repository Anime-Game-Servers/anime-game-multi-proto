package org.anime_game_servers.multi_proto.gi.data.activity.expedition

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_3_0)
@ProtoCommand(RESPONSE)
internal interface ExpeditionTakeRewardRsp {
    var isBonus: Boolean
    var pathId: Int
    var retcode: Retcode
    @AddedIn(GI_2_1_0)
    var rewardLevel: Int
}
