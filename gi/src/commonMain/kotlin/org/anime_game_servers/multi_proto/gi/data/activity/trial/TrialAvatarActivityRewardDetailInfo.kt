package org.anime_game_servers.multi_proto.gi.data.activity.trial

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
interface TrialAvatarActivityRewardDetailInfo {
    var trialAvatarIndexId: Int
    var passedDungeon: Boolean
    var receivedReward: Boolean
    @AddedIn(Version.GI_2_0_0)
    var rewardId: Int
}