package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface SeaLampActivityDetailInfo {
    var phaseId : Int
    var progress: Int
    var days: Int
    var contribution: Int
    var factor: Int
    var takenContributionRewardList: List<Int>
    var takenPhaseRewardList: List<Int>
}