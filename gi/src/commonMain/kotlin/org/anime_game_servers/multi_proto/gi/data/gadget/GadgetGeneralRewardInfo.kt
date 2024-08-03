package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_1_0)
@ProtoModel
interface GadgetGeneralRewardInfo {
    var resin: Int
    val deadTime: Int
    var remainUidList: List<Int>
    var qualifyUidList: List<Int>

    @AddedIn(Version.GI_1_4_0)
    var itemParam: org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
}