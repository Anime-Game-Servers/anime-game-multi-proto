package data.scene.entity

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V2_1_0)
@ProtoModel
internal interface FishPoolInfo {
    var poolId: Int
    var fishAreaList: List<Int>
    var todayFishNum: Int
}
