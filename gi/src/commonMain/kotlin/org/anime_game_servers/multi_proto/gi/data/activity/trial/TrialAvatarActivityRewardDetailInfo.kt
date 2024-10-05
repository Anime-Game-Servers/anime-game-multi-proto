package org.anime_game_servers.multi_proto.gi.data.activity.trial

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_0_0)
@ProtoModel
internal interface TrialAvatarActivityRewardDetailInfo {
    var passedDungeon: Boolean
    var receivedReward: Boolean
    var trialAvatarIndexId: Int
    @AddedIn(GI_2_0_0)
    var rewardId: Int
}
