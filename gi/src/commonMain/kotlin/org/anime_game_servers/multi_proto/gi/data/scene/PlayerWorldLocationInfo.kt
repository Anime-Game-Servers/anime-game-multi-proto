package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_1_6_0

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface PlayerWorldLocationInfo {
    var sceneId: Int
    var playerLoc: org.anime_game_servers.multi_proto.gi.data.scene.PlayerLocationInfo
}
