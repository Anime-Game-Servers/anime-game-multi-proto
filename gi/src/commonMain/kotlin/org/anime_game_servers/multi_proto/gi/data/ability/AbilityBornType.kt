package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityBornType {
    var pos: Vector
    var rot: Vector
    @AddedIn(GI_1_3_0)
    var moveDir: Vector
}
