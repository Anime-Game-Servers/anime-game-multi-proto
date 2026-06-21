package org.anime_game_servers.multi_proto.gi.data.general.server

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
interface ResVersionConfig {
    var version: Int
    var relogin: Boolean
    var md5: String
    var releaseTotalSize: String
    var versionSuffix: String
    @AddedIn(GI_1_2_0)
    var branch: String
    @AddedIn(GI_1_2_0)
    var nextScriptVersion: String
}
