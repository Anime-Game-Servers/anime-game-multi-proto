package data.player

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V2_1_0)
@ProtoModel
interface AdjustTrackingInfo {
    var idfa: String
    var gpsAdid: String
    var fireAdid: String
    var adid: String
    var eventToken: String
    var appToken: String
}
