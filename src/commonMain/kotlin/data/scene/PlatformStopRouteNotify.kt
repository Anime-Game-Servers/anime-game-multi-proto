package data.scene

import annotations.AddedIn
import data.scene.entity.PlatformInfo
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


import messages.VERSION.VCB1
import messages.VERSION.V1_0_0

@AddedIn(VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlatformStopRouteNotify {
    var entityId: Int
    var sceneTime: Int
    @AddedIn(V1_0_0)
    var platform: PlatformInfo
}