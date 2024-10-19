package org.anime_game_servers.multi_proto.gi.data.gallery.fall

import org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerInfo
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface FallSettleInfo {
    var catchCount: Int
    var finalScore: Int
    var flowerRingCatchCountMap: Map<Int, Int>
    var playerInfo: OnlinePlayerInfo
    var remainTime: Int
    var uid: Int
}