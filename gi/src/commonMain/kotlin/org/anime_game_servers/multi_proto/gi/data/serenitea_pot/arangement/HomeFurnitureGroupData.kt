package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.arangement

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.HomeFurnitureData

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface HomeFurnitureGroupData {
    var groupFurnitureIndex: Int
    @AltName("virtualFurniureList")
    var virtualFurnitureList: List<HomeFurnitureData>
}
