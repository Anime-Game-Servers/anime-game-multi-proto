package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.base_info

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.shop.HomeLimitedShopInfo

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface HomeBasicInfo {
    var curModuleId: Int
    var curRoomSceneId: Int
    var exp: Long
    var homeOwnerUid: Int
    var isInEditMode: Boolean
    var level: Int
    var limitedShopInfo: HomeLimitedShopInfo
    var ownerNickName: String
}
