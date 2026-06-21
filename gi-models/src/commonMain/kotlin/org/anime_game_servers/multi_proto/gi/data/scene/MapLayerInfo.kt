package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_4_0_0)
@ProtoModel
internal interface MapLayerInfo {
    var unlockedMapLayerIdList: List<Int>
    var unlockedMapLayerFloorIdList: List<Int>
    var unlockedMapLayerGroupIdList: List<Int>
}
