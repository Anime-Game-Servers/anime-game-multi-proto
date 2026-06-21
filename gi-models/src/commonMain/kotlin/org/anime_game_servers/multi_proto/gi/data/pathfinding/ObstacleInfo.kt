package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.MathQuaternion
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_CB2)
@ProtoModel
internal interface ObstacleInfo {
    var center: Vector
    var extents: Vector3Int
    var obstacleId: Int
    var rotation: MathQuaternion
    var shape: ObstacleShapeType
}
