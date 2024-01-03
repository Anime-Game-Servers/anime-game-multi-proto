package data.login

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
interface StopServerInfo {
    var stopBeginTime: Int
    var stopEndTime: Int
    @AddedIn(VERSION.V1_4_0)
    var url: String
    @AddedIn(VERSION.V1_4_0)
    var contentMsg: String
}