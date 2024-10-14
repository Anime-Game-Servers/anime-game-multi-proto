package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(REQUEST)
internal interface PathfindingEnterSceneReq {
    var isEditor: Boolean
    var obstacles: List<ObstacleInfo>
    var sceneId: Int
    var version: Int
    @AddedIn(GI_0_9_0)
    var activityId: List<Int>
    @AddedIn(GI_2_8_0)
    var polygonId: Int
    @AddedIn(GI_2_8_0)
    var sceneTagHash: Int
}
