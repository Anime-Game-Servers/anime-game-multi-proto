package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_3_0)
@ProtoModel
interface BuildingInfo {
    var buildingId: Int
    var pointConfigId: Int
    var cost: Int
    var level: Int
    var refund: Int
    var ownerUid: Int
}