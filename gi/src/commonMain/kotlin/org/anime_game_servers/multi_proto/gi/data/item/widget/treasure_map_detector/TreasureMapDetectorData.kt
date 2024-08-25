package org.anime_game_servers.multi_proto.gi.data.item.widget.treasure_map_detector

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface TreasureMapDetectorData {
    var centerPos: Vector
    var isRegionDetected: Boolean
    var radius: Int
    var regionId: Int
    var spotList: List<Vector>
}
