package org.anime_game_servers.multi_proto.gi.data.login

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0) @RemovedIn(GI_1_0_0)
@ProtoModel
internal interface ClientCustomConfig {
    var visitor: Boolean
    var sdkenv: String
    var debugmenu: Boolean
    var debuglogswitch: List<Int>
    var debuglog: Boolean
    var devicelist: Map<String, String>
    var loadjsondata: Boolean
    var showexception: Boolean
}