package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.scene.entity.PlatformInfo
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


import org.anime_game_servers.core.base.Version.GI_CB1

@AddedIn(GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlatformStartRouteNotify {
    var entityId: Int
    var platform: PlatformInfo
    var sceneTime: Int
}