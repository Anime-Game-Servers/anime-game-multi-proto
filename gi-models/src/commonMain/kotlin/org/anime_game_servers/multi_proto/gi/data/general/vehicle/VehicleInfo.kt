package org.anime_game_servers.multi_proto.gi.data.general.vehicle

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_6_0)
@ProtoModel
interface VehicleInfo {
    var memberList: List<VehicleMember>
    var ownerUid: Int

    @AddedIn(Version.GI_2_1_0)
    var curStamina: Float
}