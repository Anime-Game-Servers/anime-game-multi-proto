package org.anime_game_servers.multi_proto.gi.data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface AvatarExcelInfo {
    var combatConfigHash: Long
    var controllerPathHash: Long
    var controllerPathRemoteHash: Long
    var prefabPathHash: Long
    var prefabPathRemoteHash: Long
}