package org.anime_game_servers.multi_proto.gi.data.item.upgrade

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(REQUEST)
internal interface CalcWeaponUpgradeReturnItemsReq {
    var foodWeaponGuidList: List<Long>
    var itemParamList: List<ItemParam>
    var targetWeaponGuid: Long
}
