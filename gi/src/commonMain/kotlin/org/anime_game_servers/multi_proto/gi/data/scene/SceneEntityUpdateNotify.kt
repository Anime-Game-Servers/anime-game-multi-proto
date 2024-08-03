package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityInfo
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_1_6_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface SceneEntityUpdateNotify {
    var entityList: List<org.anime_game_servers.multi_proto.gi.data.scene.entity.SceneEntityInfo>
    var appearType: org.anime_game_servers.multi_proto.gi.data.scene.VisionType
    var param: Int
}
