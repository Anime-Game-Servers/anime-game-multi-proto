package data.scene

import annotations.AddedIn
import data.scene.entity.PlatformInfo
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


import messages.VERSION.VCB1

@AddedIn(VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlatformStartRouteNotify {
    var entityId: Int
    var platform: PlatformInfo
    var sceneTime: Int
}