package data.activity.trial

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_0_0)
@ProtoModel
interface TrialAvatarActivityDetailInfo {
    var rewardInfoList: List<TrialAvatarActivityRewardDetailInfo>
}