package data.player

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_1_0)
@ProtoModel
interface AdjustTrackingInfo {
    var idfa: String
    var gpsAdid: String
    var fireAdid: String
    var adid: String
    var eventToken: String
    var appToken: String
}
