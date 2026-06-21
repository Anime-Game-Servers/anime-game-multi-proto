package org.anime_game_servers.multi_proto.gi.data.activity.blitz_rush

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_0_0)
@ProtoModel
internal interface ParkourLevelInfo {
    var bestRecord: Int
    var isOpen: Boolean
    var openTime: Int
    var pos: Vector
}
