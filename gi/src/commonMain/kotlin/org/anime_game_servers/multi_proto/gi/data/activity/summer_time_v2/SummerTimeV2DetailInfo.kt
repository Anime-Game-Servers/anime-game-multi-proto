package org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.multi_proto.gi.data.activity.ActivityDetailInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@ProtoModel
@AddedIn(Version.GI_2_8_0)
internal interface SummerTimeV2DetailInfo : org.anime_game_servers.multi_proto.gi.data.activity.ActivityDetailInfo {
    var isContentClosed: Boolean
    var curDungeonRewardLimit: Int
    var takenRewardCount: Int
    var dungeonStageInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2.SummerTimeV2DungeonStageInfo>
    var boatStageInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.summer_time_v2.SummerTimeV2BoatStageInfo>
}