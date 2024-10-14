package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.verify

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeVerifyBlockData {
    var blockId: Int
    @RemovedIn(GI_2_7_0)
    var furnitures: List<HomeVerifyFurnitureData>
    @RemovedIn(GI_2_7_0)
    var images: List<HomeVerifyImageData>
    @AddedIn(GI_2_7_0)
    var furnitureCount: Int
}
