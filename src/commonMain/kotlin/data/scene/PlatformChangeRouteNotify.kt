package data.scene

import annotations.AddedIn
import data.scene.entity.PlatformInfo
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand


import messages.VERSION.VCB1
import messages.VERSION.V1_2_0

@AddedIn(VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlatformChangeRouteNotify {
    var entityId: Int
    var platform: PlatformInfo
    @AddedIn(V1_2_0)
    var sceneTime: Int
}