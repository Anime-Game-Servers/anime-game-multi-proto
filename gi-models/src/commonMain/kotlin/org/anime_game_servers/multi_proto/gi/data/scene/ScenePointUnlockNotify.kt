package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface ScenePointUnlockNotify {
    var lockedPointList: List<Int>
    var pointList: List<Int>
    var sceneId: Int
    @AddedIn(GI_1_6_0)
    var hidePointList: List<Int>
    @AddedIn(GI_1_6_0)
    var unhidePointList: List<Int>
}
