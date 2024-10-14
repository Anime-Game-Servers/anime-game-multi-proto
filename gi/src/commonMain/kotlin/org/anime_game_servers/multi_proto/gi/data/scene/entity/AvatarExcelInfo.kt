package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_6_0)
@ProtoModel
internal interface AvatarExcelInfo {
    var prefabPathHash: Long
    var prefabPathRemoteHash: Long
    var controllerPathHash: Long
    var controllerPathRemoteHash: Long
    var combatConfigHash: Long
}
