package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface Vector3Int {
    var x: Int
    var y: Int
    var z: Int
}
