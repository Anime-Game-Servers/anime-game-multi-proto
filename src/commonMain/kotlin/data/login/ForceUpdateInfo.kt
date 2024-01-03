package data.login

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
interface ForceUpdateInfo {
    var forceUpdateUrl: String
    @RemovedIn(VERSION.V0_9_0)
    var clientCustomConfig: String
    @AddedIn(VERSION.V0_9_0) @RemovedIn(VERSION.V1_0_0)
    var clientConfig: ClientCustomConfig
}