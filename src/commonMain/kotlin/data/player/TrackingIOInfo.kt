package data.player

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V1_1_0)
@ProtoModel
interface TrackingIOInfo {
    var appid: String
    var deviceid: String
    var mac: String
    var rydevicetype: String
    var clientTz: String
    @AddedIn(messages.VERSION.V1_4_0)
    var currentCaid: String
    @AddedIn(messages.VERSION.V1_4_0)
    var cachedCaid: String
}
