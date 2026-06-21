package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_3_4_0)
@ProtoModel
internal interface AbilityFireworkBornType {
    var effectIndex: Int
    var moveDir: Vector
    var pos: Vector
    var rot: Vector
}
