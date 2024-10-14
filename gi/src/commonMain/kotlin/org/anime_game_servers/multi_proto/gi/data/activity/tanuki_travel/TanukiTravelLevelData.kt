package org.anime_game_servers.multi_proto.gi.data.activity.tanuki_travel

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface TanukiTravelLevelData {
    var isFinish: Boolean
    var isOpen: Boolean
    var routeId: Int
}
