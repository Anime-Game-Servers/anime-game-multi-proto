package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.shop

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeLimitedShopGoods {
    var boughtNum: Int
    var buyLimit: Int
    var costItemList: List<ItemParam>
    var goodsId: Int
    var goodsItem: ItemParam
    @AddedIn(GI_2_4_0)
    var disableType: Int
}
