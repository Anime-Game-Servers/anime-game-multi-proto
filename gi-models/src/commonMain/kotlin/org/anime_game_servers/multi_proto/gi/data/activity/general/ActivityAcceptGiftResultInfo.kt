package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface ActivityAcceptGiftResultInfo {
    var acceptGiftNumMap: Map<Int, Int>
    var uid: Int
    var unacceptGiftNumMap: Map<Int, Int>
}
