package org.anime_game_servers.multi_proto.gi.data.activity.summer_time

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
interface SummerTimeSprintBoatRecord {
    var bestScore: Int
    var groupId: Int
    var isTouched: Boolean
    var startTime: Int
    var watcherIdList: List<Int>
}
