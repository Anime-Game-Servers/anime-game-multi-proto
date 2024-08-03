package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface PingReq {
    var clientTime: Int
    var seq: Int
    @AddedIn(GI_1_0_0)
    var scData: ByteArray
    @AddedIn(GI_1_2_0)
    var ueTime: Float
    @AddedIn(GI_2_2_0)
    var totalTickTime: Double
}
