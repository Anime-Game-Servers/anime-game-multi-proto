package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface PlayerWorldSceneInfo {
    var sceneId: Int
    var isLocked: Boolean
    var sceneTagIdList: List<Int>
    var mapLayerInfo: MapLayerInfo
}
