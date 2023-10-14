package data.shop

import annotations.AddedIn
import annotations.RemovedIn
import data.general.Item.ItemParam
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_2_0)
@ProtoModel
internal interface ResinCard {
    var baseItemList: List<ItemParam>
    var perDayItemList: List<ItemParam>
}