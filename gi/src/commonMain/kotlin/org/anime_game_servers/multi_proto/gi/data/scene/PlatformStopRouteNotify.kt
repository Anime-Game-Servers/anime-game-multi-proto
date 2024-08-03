package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.scene.entity.PlatformInfo
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_0_0

@AddedIn(GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlatformStopRouteNotify {
    var entityId: Int
    var sceneTime: Int
    @AddedIn(GI_1_0_0)
    var platform: org.anime_game_servers.multi_proto.gi.data.scene.entity.PlatformInfo
}