package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface BlossomChestInfo {
    var resin: Int
    var qualifyUidList: List<Int>
    var remainUidList: List<Int>
    var deadTime: Int
}