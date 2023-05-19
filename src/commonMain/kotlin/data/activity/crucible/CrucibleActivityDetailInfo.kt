package data.activity.crucible

import annotations.AddedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface CrucibleActivityDetailInfo {
    var costTime : Int
    var uidInfoList: List<CrucibleBattleUidInfo>
    var pos: Vector
    @AddedIn(VERSION.V1_0_0)
    var battleWorldLevel: Int
}