package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_1_0)
@ProtoModel
interface AdjustTrackingInfo {
    var adid: String
    var appToken: String
    var eventToken: String
    var fireAdid: String
    var gpsAdid: String
    var idfa: String
}
