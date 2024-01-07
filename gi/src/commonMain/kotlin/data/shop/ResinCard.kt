package data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_2_0)
@ProtoModel("ShopCardProduct")
internal interface ResinCard {
    var baseItemList: List<ItemParam>
    var perDayItemList: List<ItemParam>
}