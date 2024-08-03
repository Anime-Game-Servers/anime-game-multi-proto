package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
interface StopServerInfo {
    var stopBeginTime: Int
    var stopEndTime: Int
    @AddedIn(Version.GI_1_4_0)
    var url: String
    @AddedIn(Version.GI_1_4_0)
    var contentMsg: String
}