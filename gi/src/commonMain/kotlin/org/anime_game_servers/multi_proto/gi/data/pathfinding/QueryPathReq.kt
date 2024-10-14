package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface QueryPathReq {
    var destinationExtend: Vector3Int
    var destinationPos: List<Vector>
    var filter: QueryFilter
    var queryId: Int
    var queryType: OptionType
    var sceneId: Int
    var sourcePos: Vector
    @AddedIn(GI_1_1_0)
    var sourceExtend: Vector3Int
}
