package data.scene.entity

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_6_0)
@ProtoModel
internal interface AvatarExcelInfo {
    var prefabPathHash: Long
    var prefabPathRemoteHash: Long
    var controllerPathHash: Long
    var controllerPathRemoteHash: Long
    var combatConfigHash: Long
}
