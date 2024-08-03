package org.anime_game_servers.multi_proto.gi.data.activity

import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel
interface ActivityScheduleInfo {
    var activityId: Int
    var isOpen: Boolean
    var scheduleId: Int
    var beginTime: Int
    var endTime: Int
    @AddedIn(Version.GI_0_9_0)
    @RemovedIn(Version.GI_1_0_0)
    var hasReward: Boolean
}