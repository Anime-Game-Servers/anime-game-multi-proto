package data.scene

import annotations.AddedIn
import data.general.Vector
import messages.VERSION.V1_6_0
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(V1_6_0)
@ProtoModel
internal interface VehicleLocationInfo {
    var entityId: Int
    var gadgetId: Int
    var ownerUid: Int
    var pos: Vector
    var rot: Vector
    var curHp: Float
    var maxHp: Float
    var uidList: List<Int>
}
