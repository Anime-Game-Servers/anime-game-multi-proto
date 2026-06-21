package org.anime_game_servers.multi_proto.gi.data.shop

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_0_0)
@ProtoEnum
internal enum class ShopGoodsDisableType {
    SHOP_GOODS_DISABLE_NONE,
    SHOP_GOODS_DISABLE_TALENT_FULL,
    @AddedIn(GI_1_5_0)
    SHOP_GOODS_DISABLE_FURNITURE_FORMULA_UNLOCKED,
    @AddedIn(GI_1_6_0)
    SHOP_GOODS_DISABLE_COSTUME_UNLOCKED,
    @AddedIn(GI_2_4_0)
    SHOP_GOODS_DISABLE_BGM_UNLOCKED,
    @AddedIn(GI_3_2_0)
    SHOP_GOODS_DISABLE_GCG_CARD_EXCEED,
    @AddedIn(GI_3_2_0)
    SHOP_GOODS_DISABLE_GCG_CARD_FACE_UNLOCKED,
    @AddedIn(GI_3_2_0)
    SHOP_GOODS_DISABLE_GCG_CARD_BACK_UNLOCKED,
    @AddedIn(GI_3_2_0)
    SHOP_GOODS_DISABLE_GCG_FIELD_UNLOCKED,

}