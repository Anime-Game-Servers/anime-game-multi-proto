package data.login

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
@ProtoModel
interface ClientCustomConfig {
    var visitor: Boolean
    var sdkenv: String
    var debugmenu: Boolean
    var debuglogswitch: List<Int>
    var debuglog: Boolean
    var devicelist: Map<String, String>
    var loadjsondata: Boolean
    var showexception: Boolean
}