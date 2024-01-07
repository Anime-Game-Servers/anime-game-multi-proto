package data.activity.summer_time

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
@AddedIn(Version.GI_1_6_0)
interface SummerTimeSprintBoatRecord {
    var bestScore: Int
    var startTime: Int
    var isTouched: Boolean
    var watcherIdList: List<Int>
    var groupId: Int
}