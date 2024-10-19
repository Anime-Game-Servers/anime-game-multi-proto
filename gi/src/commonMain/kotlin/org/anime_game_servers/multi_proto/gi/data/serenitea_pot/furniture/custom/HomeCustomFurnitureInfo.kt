package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.custom

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.CustomCommonNodeInfo

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface HomeCustomFurnitureInfo {
    var guid: Int
    var subFurnitureList: List<CustomCommonNodeInfo>
}
