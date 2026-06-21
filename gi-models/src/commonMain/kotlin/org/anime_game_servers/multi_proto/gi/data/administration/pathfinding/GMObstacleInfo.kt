package org.anime_game_servers.multi_proto.gi.data.administration.pathfinding

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.core.annotations.Converters
import org.anime_game_servers.multi_proto.gi.converters.GmShapeToObstacleShapeConverter
import org.anime_game_servers.multi_proto.gi.data.general.MathQuaternion
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.multi_proto.gi.data.pathfinding.ObstacleShapeType
import org.anime_game_servers.multi_proto.gi.data.pathfinding.Vector3Int

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface GMObstacleInfo {
    var center: Vector
    var extents: Vector3Int
    var obstacleId: Int
    var rotation: MathQuaternion

    // GMObstacleShapeType in 3.2/3.3
    @Converters(GmShapeToObstacleShapeConverter::class)
    var shape: ObstacleShapeType
    var timestamp: Long
}
