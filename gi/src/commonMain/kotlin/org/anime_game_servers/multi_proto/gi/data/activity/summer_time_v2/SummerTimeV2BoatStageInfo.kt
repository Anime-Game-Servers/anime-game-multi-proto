package org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version

import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_8_0)
@ProtoModel
internal interface SummerTimeV2BoatStageInfo {
    var openTime: Int
    var isOpen: Boolean
    var stageId: Int
    var bestScore: Int
}
