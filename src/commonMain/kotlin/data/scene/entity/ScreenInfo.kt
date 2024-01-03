package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_0_0)
@ProtoModel
internal interface ScreenInfo {
    var liveId: Int
    var projectorEntityId: Int
}
