package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.PlatformInfo
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_2_0

@AddedIn(GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlatformChangeRouteNotify {
    var entityId: Int
    var platform: org.anime_game_servers.multi_proto.gi.data.scene.entity.PlatformInfo
    @AddedIn(GI_1_2_0)
    var sceneTime: Int
}