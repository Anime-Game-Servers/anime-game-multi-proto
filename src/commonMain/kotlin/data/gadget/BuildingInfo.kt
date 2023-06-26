package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_3_0)
@ProtoModel
interface BuildingInfo {
    var buildingId: Int
    var pointConfigId: Int
    var cost: Int
    var level: Int
    var refund: Int
    var ownerUid: Int
}