package org.anime_game_servers.multi_proto.gi.data.general.server

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface ResVersionConfig {
    var version: Int
    var relogin: Boolean
    var md5: String
    var releaseTotalSize: String
    var versionSuffix: String
    @AddedIn(Version.GI_1_2_0)
    var branch: String
    @AddedIn(Version.GI_1_2_0)
    var nextScriptVersion: String
}
