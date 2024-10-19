package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB1

@AddedIn(GI_CB1)
@ProtoModel
internal interface PlayerLocationInfo {
    var uid: Int
    var pos: Vector
    var rot: Vector
}
