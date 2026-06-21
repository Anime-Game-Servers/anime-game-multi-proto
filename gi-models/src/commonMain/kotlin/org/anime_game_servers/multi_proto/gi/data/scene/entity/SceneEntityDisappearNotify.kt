package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.scene.VisionType

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface SceneEntityDisappearNotify {
    var disappearType: VisionType
    var entityList: List<Int>
    @AddedIn(GI_2_3_0)
    var param: Int
}
