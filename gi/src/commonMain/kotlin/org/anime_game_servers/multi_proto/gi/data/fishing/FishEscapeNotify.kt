package org.anime_game_servers.multi_proto.gi.data.fishing

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_2_1_0)
@ProtoCommand(NOTIFY)
internal interface FishEscapeNotify {
    var fishIdList: List<Int>
    var pos: Vector
    var reason: FishEscapeReason
    var uid: Int
}
