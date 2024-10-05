package org.anime_game_servers.multi_proto.gi.data.activity.luna_rite

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_1_0)
@ProtoModel
internal interface LunaRiteHintPoint {
    var areaId: Int
    var index: Int
    var pos: Vector
    var type: org.anime_game_servers.multi_proto.gi.data.activity.luna_rite.LunaRiteHintPointType
}
