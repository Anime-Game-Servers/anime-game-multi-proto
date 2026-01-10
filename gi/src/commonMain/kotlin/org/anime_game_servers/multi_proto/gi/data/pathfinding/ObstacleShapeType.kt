package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("ObstacleInfo", alternativeNames = ["ShapeType"])
internal enum class ObstacleShapeType {
    @AltName("SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE")
    OBSTACLE_SHAPE_CAPSULE,
    @AltName("SHAPE_TYPE_OBSTACLE_SHAPE_BOX")
    OBSTACLE_SHAPE_BOX,
}
