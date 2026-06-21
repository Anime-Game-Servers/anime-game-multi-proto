package org.anime_game_servers.multi_proto.gi.data.activity.treasure_map

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface TreasureMapRegionInfo {
    var currentProgress: Int
    var goalPoints: Int
    var regionCenterPos: Vector
    var regionId: Int
    var regionRadius: Int
    var startTime: Int
    @AddedIn(GI_2_0_0)
    var isDoneMpSpot: Boolean
    @AddedIn(GI_2_0_0)
    var isFindMpSpot: Boolean
    @AddedIn(GI_2_0_0)
    var sceneId: Int
}
