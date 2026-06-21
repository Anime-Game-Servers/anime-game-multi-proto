package org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_8_0)
@ProtoModel
internal interface SummerTimeV2DungeonStageInfo{
    val isOpen: Boolean
    val isPrevDungeonSucceed: Boolean
    val openTime: Int
    val stageId: Int
}