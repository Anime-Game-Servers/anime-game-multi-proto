package org.anime_game_servers.multi_proto.gi.data.activity.winter_camp

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface WinterCampStageInfo {
    var curProgress: Int
    var id: Int
    var isFinished: Boolean
    var openTime: Int
    var pos: Vector
    var totalProgress: Int
}
