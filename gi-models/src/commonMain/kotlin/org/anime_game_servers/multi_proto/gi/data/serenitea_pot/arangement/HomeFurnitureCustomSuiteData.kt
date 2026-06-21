package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.arangement

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface HomeFurnitureCustomSuiteData {
    var guid: Int
    var includedFurnitureIndexList: List<Int>
    var spawnPos: Vector
}
