package data.activity.crucible

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface CrucibleBattleUidInfo {
    var uid: Int
    var nickname: String
    var icon: Int
    var onlineId : String
}