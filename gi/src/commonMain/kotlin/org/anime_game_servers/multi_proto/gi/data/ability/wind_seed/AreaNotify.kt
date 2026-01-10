package org.anime_game_servers.multi_proto.gi.data.ability.wind_seed

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel(parentClass = "WindSeedClientNotify")
internal interface AreaNotify {
    var areaCode: ByteArray
    var areaId: Int
    @AddedIn(GI_1_3_0)
    var areaType: Int
}
