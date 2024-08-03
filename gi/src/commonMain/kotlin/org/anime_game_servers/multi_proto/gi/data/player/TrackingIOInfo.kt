package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface TrackingIOInfo {
    var appid: String
    var deviceid: String
    var mac: String
    var rydevicetype: String
    var clientTz: String
    @AddedIn(Version.GI_1_4_0)
    var currentCaid: String
    @AddedIn(Version.GI_1_4_0)
    var cachedCaid: String
}
