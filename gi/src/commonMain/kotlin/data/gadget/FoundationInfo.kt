package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_3_0)
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