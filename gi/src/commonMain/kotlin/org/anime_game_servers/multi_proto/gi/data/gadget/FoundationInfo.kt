package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface FoundationInfo {
    var currentBuildingId: Int
    var lockedByUid: Int
    var status: FoundationStatus
    var uidList: List<Int>
    @RemovedIn(GI_2_6_0)
    var beginBuildTimeMs: Long
    @RemovedIn(GI_2_6_0)
    var buildingList: List<BuildingInfo>
    @RemovedIn(GI_2_6_0)
    var currentNum: Int
    @RemovedIn(GI_2_6_0)
    var demolitionRefund: Int
    @RemovedIn(GI_2_6_0)
    var maxNum: Int
}