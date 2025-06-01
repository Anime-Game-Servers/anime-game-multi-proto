package org.anime_game_servers.multi_proto.gi.data.quest.daily

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface DailyTaskInfo {
    var dailyTaskId: Int
    var finishProgress: Int
    var isFinished: Boolean
    var progress: Int
    var rewardId: Int
}
