package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_2_1_0)
@ProtoModel
internal interface FishPoolInfo {
    var poolId: Int
    var fishAreaList: List<Int>
    var todayFishNum: Int
}
