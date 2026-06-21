package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.historical_info

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.spiral_abyss.TowerMonthlyBrief

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface TowerMonthlyDetail {
    var monthlyBrief: TowerMonthlyBrief
    var monthlyCombatRecord: TowerMonthlyCombatRecord
}
