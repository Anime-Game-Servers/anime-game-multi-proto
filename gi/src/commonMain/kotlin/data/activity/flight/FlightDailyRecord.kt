package data.activity.flight

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface FlightDailyRecord {
    var isTouched: Boolean
    var bestScore: Int
    var startTime: Int
    var watcherIdList: List<Int>
    var groupId: Int
}