package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(CLIENT)
internal interface ObstacleModifyNotify {
    var addObstacles: List<ObstacleInfo>
    var removeObstacleIds: List<Int>
    var sceneId: Int
}
