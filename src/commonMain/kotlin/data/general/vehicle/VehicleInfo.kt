package data.general.vehicle

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_6_0)
@ProtoModel
interface VehicleInfo {
    var memberList: List<VehicleMember>
    var ownerUid: Int

    @AddedIn(VERSION.V2_1_0)
    var curStamina: Float
}