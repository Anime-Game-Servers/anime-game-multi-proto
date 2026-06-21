package org.anime_game_servers.multi_proto.gi.data.activity.sea_lamp.legacy

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface SeaLampActivityDetailInfo {
    var contribution: Int
    var days: Int
    var factor: Int
    var phaseId : Int
    var progress: Int
    var takenContributionRewardList: List<Int>
    var takenPhaseRewardList: List<Int>
}