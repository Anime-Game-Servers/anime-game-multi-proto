package org.anime_game_servers.multi_proto.gi.data.activity.reunion

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface ReunionMissionInfo {
    var curDayWatcherList: List<org.anime_game_servers.multi_proto.gi.data.activity.reunion.ReunionWatcherInfo>
    var curScore: Int
    var isFinished: Boolean
    var isTakenReward: Boolean
    var missionId: Int
    var nextRefreshTime: Int
    @AddedIn(GI_2_1_0)
    var isTakenRewardList: List<Boolean>
    @AddedIn(GI_2_1_0)
    var watcherList: List<org.anime_game_servers.multi_proto.gi.data.activity.reunion.ReunionWatcherInfo>
}
