package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_3_0)
@ProtoModel
interface FoundationInfo {
    var status: FoundationStatus
    var uidList: List<Int>
    var currentBuildingId: Int
    var beginBuildTimeMs: Int
    var demolitionRefund: Int
    var buildingList: List<BuildingInfo>
    var currentNum: Int
    var maxNum: Int
    var lockedByUid: Int
}