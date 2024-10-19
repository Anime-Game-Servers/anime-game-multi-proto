package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface ShopGoods {
    var goodsId: Int
    var goodsItem: ItemParam
    var scoin: Int
    var hcoin: Int
    var costItemList: List<ItemParam>
    var boughtNum: Int
    var buyLimit: Int
    var beginTime: Int
    var endTime: Int
    var nextRefreshTime: Int
    @AddedIn(GI_CB2)
    var minLevel: Int
    @AddedIn(GI_CB2)
    var maxLevel: Int
    @AddedIn(GI_0_9_0)
    var preGoodsIdList: List<Int>
    @AddedIn(GI_1_0_0)
    var mcoin: Int
    @AddedIn(GI_1_0_0)
    var disableType: Int
    @AddedIn(GI_1_1_0)
    var secondarySheetId: Int
    @AddedIn(GI_1_6_0)
    var discountId: Int
    @AddedIn(GI_1_6_0)
    var discountBeginTime: Int
    @AddedIn(GI_1_6_0)
    var discountEndTime: Int
    @AddedIn(GI_2_2_0)
    var singleLimit: Int
}