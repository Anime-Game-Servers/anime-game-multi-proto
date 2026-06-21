package org.anime_game_servers.multi_proto.gi.data.gallery.fall

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface FallPlayerInfo {
    var ballCatchCountMap: Map<Int, Int>
    var curScore: Int
    var isGround: Boolean
    var timeCost: Int
    var uid: Int
}