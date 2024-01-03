package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
internal interface MpPlayRewardInfo {
    var resin: Int
    var remainUidList: List<Int>
    var qualifyUidList: List<Int>
}
