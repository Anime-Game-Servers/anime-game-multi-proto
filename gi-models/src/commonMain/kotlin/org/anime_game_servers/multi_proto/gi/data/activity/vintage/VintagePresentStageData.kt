package org.anime_game_servers.multi_proto.gi.data.activity.vintage

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_1_0)
@ProtoModel
internal interface VintagePresentStageData {
    var isFinish: Boolean
    var isOpen: Boolean
    var openTime: Int
    var presentLevelMap: Map<Int, VintagePresentLevelData>
    var stageId: Int
}
