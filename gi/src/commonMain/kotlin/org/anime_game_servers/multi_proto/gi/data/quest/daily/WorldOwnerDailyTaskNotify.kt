package org.anime_game_servers.multi_proto.gi.data.quest.daily

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.CLIENT)
internal interface WorldOwnerDailyTaskNotify {
    var taskList: List<DailyTaskInfo>
    @AddedIn(Version.GI_2_0_0)
    var filterCityId: Int
    @AddedIn(Version.GI_3_4_0)
    var finishedDailyTaskNum: Int
}