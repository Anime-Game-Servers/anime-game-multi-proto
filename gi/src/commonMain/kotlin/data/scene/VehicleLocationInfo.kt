package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.Vector
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
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
