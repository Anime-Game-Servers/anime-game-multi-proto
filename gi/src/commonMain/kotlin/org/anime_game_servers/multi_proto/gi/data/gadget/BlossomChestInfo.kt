package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
interface BlossomChestInfo {
    var resin: Int
    var qualifyUidList: List<Int>
    var remainUidList: List<Int>
    var deadTime: Int
    @AddedIn(GI_1_2_0)
    var blossomRefreshType: Int
    @AddedIn(GI_1_3_0)
    var refreshId: Int
}