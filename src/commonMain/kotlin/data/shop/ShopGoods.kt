package data.shop

import annotations.AddedIn
import data.general.Item.ItemParam
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
interface ShopGoods {
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
    @AddedIn(VERSION.VCB2)
    var minLevel: Int
    @AddedIn(VERSION.VCB2)
    var maxLevel: Int
    @AddedIn(VERSION.V0_9_0)
    var preGoodsIdList: List<Int>
    @AddedIn(VERSION.V1_0_0)
    var mcoin: Int
    @AddedIn(VERSION.V1_0_0)
    var disableType: Int
    @AddedIn(VERSION.V1_1_0)
    var secondarySheetId: Int
    @AddedIn(VERSION.V1_6_0)
    var discountId: Int
    @AddedIn(VERSION.V1_6_0)
    var discountBeginTime: Int
    @AddedIn(VERSION.V1_6_0)
    var discountEndTime: Int
    @AddedIn(VERSION.V2_2_0)
    var singleLimit: Int
}