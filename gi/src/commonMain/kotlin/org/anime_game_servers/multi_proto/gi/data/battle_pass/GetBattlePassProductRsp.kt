package org.anime_game_servers.multi_proto.gi.data.battle_pass

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface GetBattlePassProductRsp {
    var battlePassProductPlayType: Int
    var curScheduleId: Int
    var productId: String
    var retcode: Int
    @AddedIn(GI_1_0_0)
    var priceTier: String
}
