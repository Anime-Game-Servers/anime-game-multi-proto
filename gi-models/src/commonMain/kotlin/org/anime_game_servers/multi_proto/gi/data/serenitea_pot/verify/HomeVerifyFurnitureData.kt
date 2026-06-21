package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.verify

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeVerifyFurnitureData {
    var id: Int
    var num: Int
    var type: List<Int>
}
