package org.anime_game_servers.multi_proto.gi.data.administration.pathfinding

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_2_0)
@RemovedIn(GI_3_4_0)
@ProtoEnum("GMObstacleInfo", alternativeNames = ["ShapeType"])
internal enum class GMObstacleShapeType {
    SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE,
    SHAPE_TYPE_OBSTACLE_SHAPE_BOX,
}
