package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface ActivityScheduleInfo {
    var activityId: Int
    var beginTime: Int
    var endTime: Int
    var isOpen: Boolean
    var scheduleId: Int
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_0_0)
    var hasReward: Boolean
}