package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
interface ShopGoods {
    var goodsId: Int
    var goodsItem: org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
    var scoin: Int
    var hcoin: Int
    var costItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var boughtNum: Int
    var buyLimit: Int
    var beginTime: Int
    var endTime: Int
    var nextRefreshTime: Int
    @AddedIn(Version.GI_CB2)
    var minLevel: Int
    @AddedIn(Version.GI_CB2)
    var maxLevel: Int
    @AddedIn(Version.GI_0_9_0)
    var preGoodsIdList: List<Int>
    @AddedIn(Version.GI_1_0_0)
    var mcoin: Int
    @AddedIn(Version.GI_1_0_0)
    var disableType: Int
    @AddedIn(Version.GI_1_1_0)
    var secondarySheetId: Int
    @AddedIn(Version.GI_1_6_0)
    var discountId: Int
    @AddedIn(Version.GI_1_6_0)
    var discountBeginTime: Int
    @AddedIn(Version.GI_1_6_0)
    var discountEndTime: Int
    @AddedIn(Version.GI_2_2_0)
    var singleLimit: Int
}