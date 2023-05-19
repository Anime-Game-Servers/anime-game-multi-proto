package data.activity.summer_time_v2

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_8_0)
@ProtoModel
internal interface SummerTimeV2DungeonStageInfo{
    val stageId: Int
    val isOpen: Boolean
    val openTime: Int
    val isPrevDungeonSucceed: Boolean
}