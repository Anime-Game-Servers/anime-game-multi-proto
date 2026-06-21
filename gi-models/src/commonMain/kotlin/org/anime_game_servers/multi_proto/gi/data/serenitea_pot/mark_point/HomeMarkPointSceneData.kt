package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.mark_point

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface HomeMarkPointSceneData {
    var furnitureList: List<HomeMarkPointFurnitureData>
    var moduleId: Int
    var sceneId: Int
    var teapotSpiritPos: Vector
    @AddedIn(GI_3_1_0)
    var safePointPos: Vector
}
