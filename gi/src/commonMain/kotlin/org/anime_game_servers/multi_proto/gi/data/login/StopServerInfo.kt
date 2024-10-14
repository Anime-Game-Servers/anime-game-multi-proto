package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface StopServerInfo {
    var stopBeginTime: Int
    var stopEndTime: Int
    @AddedIn(GI_1_4_0)
    var url: String
    @AddedIn(GI_1_4_0)
    var contentMsg: String
}