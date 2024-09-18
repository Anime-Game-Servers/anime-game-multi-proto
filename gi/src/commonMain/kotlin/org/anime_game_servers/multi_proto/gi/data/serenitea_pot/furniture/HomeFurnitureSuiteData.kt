package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeFurnitureSuiteData {
    var includedFurnitureIndexList: List<Int>
    var spawnPos: Vector
    var suiteId: Int
    @AddedIn(GI_1_6_0)
    var guid: Int
    @AddedIn(GI_1_6_0)
    var isAllowSummon: Boolean
}
