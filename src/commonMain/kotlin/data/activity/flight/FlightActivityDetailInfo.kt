package data.activity.flight

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface FlightActivityDetailInfo {
    var dailyRecordList: List<FlightDailyRecord>
    var previewRewardId: Int
    var minOpenPlayerTime: Int
}