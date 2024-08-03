package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_4_0)
@ProtoModel
internal interface FallSettleInfo {
    var uid: Int
    var catchCount: Int
    var flowerRingCatchCountMap: Map<Int, Int>
    var finalScore: Int
    var playerInfo: OnlinePlayerInfo
    var remainTime: Int
}