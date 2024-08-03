package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
interface ForceUpdateInfo {
    var forceUpdateUrl: String
    @RemovedIn(Version.GI_0_9_0)
    var clientCustomConfig: String
    @AddedIn(Version.GI_0_9_0) @RemovedIn(Version.GI_1_0_0)
    var clientConfig: ClientCustomConfig
}