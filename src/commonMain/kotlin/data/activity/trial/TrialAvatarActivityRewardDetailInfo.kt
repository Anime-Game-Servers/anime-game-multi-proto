package data.activity.trial

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_0_0)
@ProtoModel
interface TrialAvatarActivityRewardDetailInfo {
    var trialAvatarIndexId: Int
    var passedDungeon: Boolean
    var receivedReward: Boolean
    @AddedIn(VERSION.V2_0_0)
    var rewardId: Int
}