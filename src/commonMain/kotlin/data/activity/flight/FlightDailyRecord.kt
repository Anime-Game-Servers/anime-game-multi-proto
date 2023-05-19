package data.activity.flight

import annotations.AddedIn
import data.generall.Vector
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface FlightDailyRecord {
    var isTouched: Boolean
    var bestScore: Int
    var startTime: Int
    var watcherIdList: List<Int>
    var groupId: Int
}