package org.anime_game_servers.multi_proto.gi.data.administration.pathfinding

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_0_9_0)
@ProtoCommand(REQUEST)
internal interface GMShowNavMeshReq {
    var center: Vector
    var extent: Vector
}
