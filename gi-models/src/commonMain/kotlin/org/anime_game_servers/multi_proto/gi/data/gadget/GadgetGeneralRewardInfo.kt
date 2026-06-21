package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface GadgetGeneralRewardInfo {
    val deadTime: Int
    var qualifyUidList: List<Int>
    var remainUidList: List<Int>
    var resin: Int

    @AddedIn(GI_1_4_0)
    var itemParam: ItemParam
}