package org.anime_game_servers.multi_proto.gi.data.activity.mist_trial

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface MistTrialActivityDetailInfo {
    var trialLevelDataList: List<org.anime_game_servers.multi_proto.gi.data.activity.mist_trial.MistTrialLevelData>
}
