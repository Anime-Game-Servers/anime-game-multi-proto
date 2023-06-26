package data.gadget

import annotations.AddedIn
import data.general.Item.ItemParam
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_1_0)
@ProtoModel
interface GadgetGeneralRewardInfo {
    var resin: Int
    val deadTime: Int
    var remainUidList: List<Int>
    var qualifyUidList: List<Int>

    @AddedIn(VERSION.V1_4_0)
    var itemParam: ItemParam
}