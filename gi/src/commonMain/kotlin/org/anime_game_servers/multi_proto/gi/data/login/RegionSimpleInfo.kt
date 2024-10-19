package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface RegionSimpleInfo {
    var dispatchUrl: String
    var name: String
    var title: String
    var type: String
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_0_0)
    var regionCustomConfig: RegionCustomConfig
}
