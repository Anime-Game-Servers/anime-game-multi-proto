package org.anime_game_servers.multi_proto.gi.data.quest.daily

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(NOTIFY)
internal interface DailyTaskDataNotify {
    @AddedIn(GI_CB2)
    @RemovedIn(GI_0_9_0)
    var taskList: List<DailyTaskInfo>
    var finishedNum: Int
    var isTakenScoreReward: Boolean
    var scoreRewardId: Int
}
