package org.anime_game_servers.multi_proto.gi.data.activity.plant_flower

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface PlantFlowerAcceptFlowerResultInfo {
    var acceptFlowerNumMap: Map<Int, Int>
    var uid: Int
    var unacceptFlowerNumMap: Map<Int, Int>
}
