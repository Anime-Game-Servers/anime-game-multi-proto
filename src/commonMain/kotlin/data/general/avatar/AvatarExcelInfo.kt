package data.general.avatar

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_6_0)
@ProtoModel
internal interface AvatarExcelInfo {
    var prefabPathHash: Long
    var prefabPathRemoteHash: Long
    var controllerPathHash: Long
    var controllerPathRemoteHash: Long
    var combatConfigHash: Long
}