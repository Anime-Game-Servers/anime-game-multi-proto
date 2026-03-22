package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.multi_proto.gi.data.other.ClientStatData
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@RemovedIn(GI_1_0_0)
@ProtoCommand(CLIENT)
internal interface ClientFpsStatusNotify {
    @RemovedIn(GI_0_9_0)
    var isLowFps: Boolean
    @AddedIn(GI_CB2)
    @RemovedIn(GI_0_9_0)
    var fps: Float
    @AddedIn(GI_CB2)
    var statList: List<ClientStatData>
    @AddedIn(GI_0_9_0)
    var graphicQualityLevel: Int
    @AddedIn(GI_0_9_0)
    var targetFrameRate: Int
}
