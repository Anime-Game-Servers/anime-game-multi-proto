package org.anime_game_servers.multi_proto.gi.data.general.battle

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface MassiveGrassInfo {
    var center: Vector
    var id: Int
    var size: Vector
}
