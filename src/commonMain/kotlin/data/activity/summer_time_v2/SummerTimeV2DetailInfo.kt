package data.activity.summer_time_v2

import annotations.AddedIn
import messages.VERSION
import data.activity.ActivityDetailInfo
import org.anime_game_servers.annotations.ProtoModel

@ProtoModel
@AddedIn(VERSION.V2_8_0)
internal interface SummerTimeV2DetailInfo : ActivityDetailInfo {
    var isContentClosed: Boolean
    var curDungeonRewardLimit: Int
    var takenRewardCount: Int
    var dungeonStageInfoList: List<SummerTimeV2DungeonStageInfo>
    var boatStageInfoList: List<SummerTimeV2BoatStageInfo>
}