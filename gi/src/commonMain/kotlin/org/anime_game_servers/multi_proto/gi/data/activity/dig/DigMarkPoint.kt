package org.anime_game_servers.multi_proto.gi.data.activity.dig

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface DigMarkPoint {
    var bundleId: Int
    var pos: Vector
    var rot: Vector
}
