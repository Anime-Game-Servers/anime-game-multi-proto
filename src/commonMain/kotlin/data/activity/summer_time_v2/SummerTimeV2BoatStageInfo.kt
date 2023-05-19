package data.activity.summer_time_v2

import annotations.AddedIn
import messages.VERSION

import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_8_0)
@ProtoModel
internal interface SummerTimeV2BoatStageInfo {
    var openTime: Int
    var isOpen: Boolean
    var stageId: Int
    var bestScore: Int
}
