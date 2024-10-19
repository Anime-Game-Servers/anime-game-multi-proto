package org.anime_game_servers.multi_proto.gi.data.activity.treasure_seelie

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface TreasureSeelieRegionData {
    var isDone: Boolean
    var isOpen: Boolean
    var openDay: Int
    var openTime: Int
    var openedChestNum: Int
    var regionCenterPos: Vector
    var regionId: Int
    var regionRadius: Float
    var sceneId: Int
    var totalChestNum: Int
}
