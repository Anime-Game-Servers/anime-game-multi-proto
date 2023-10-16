package data.player

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(messages.VERSION.V0_9_0)
@ProtoModel
interface ResVersionConfig {
    var version: Int
    var relogin: Boolean
    var md5: String
    var releaseTotalSize: String
    var versionSuffix: String
    @AddedIn(messages.VERSION.V1_2_0)
    var branch: String
    @AddedIn(messages.VERSION.V1_2_0)
    var nextScriptVersion: String
}
