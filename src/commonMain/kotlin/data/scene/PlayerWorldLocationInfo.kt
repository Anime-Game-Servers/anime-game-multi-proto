package data.scene

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.V1_6_0

@AddedIn(V1_6_0)
@ProtoModel
internal interface PlayerWorldLocationInfo {
    var sceneId: Int
    var playerLoc: PlayerLocationInfo
}
