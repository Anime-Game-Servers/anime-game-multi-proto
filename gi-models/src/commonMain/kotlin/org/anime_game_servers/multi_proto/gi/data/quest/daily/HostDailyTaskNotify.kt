package org.anime_game_servers.multi_proto.gi.data.quest.daily

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@RemovedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.CLIENT)
internal interface HostDailyTaskNotify {
    var taskList: List<DailyTaskInfo>
}