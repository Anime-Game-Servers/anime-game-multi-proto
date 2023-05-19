package data.activity.summer_time

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
@AddedIn(VERSION.V1_6_0)
interface SummerTimeDetailInfo {
    var stageMap: Map<Int, SummerTimeStageInfo>
    var contentCloseTime: Int
    var isContentClosed: Boolean
    var sprintBoatInfo: SummerTimeSprintBoatInfo
}