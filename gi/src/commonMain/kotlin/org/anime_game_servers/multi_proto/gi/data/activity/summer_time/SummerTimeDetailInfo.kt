package org.anime_game_servers.multi_proto.gi.data.activity.summer_time

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface SummerTimeDetailInfo {
    var contentCloseTime: Int
    var isContentClosed: Boolean
    var sprintBoatInfo: SummerTimeSprintBoatInfo
    var stageMap: Map<Int, SummerTimeStageInfo>
}