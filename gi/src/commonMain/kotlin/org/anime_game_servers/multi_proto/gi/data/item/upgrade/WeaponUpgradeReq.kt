package org.anime_game_servers.multi_proto.gi.data.item.upgrade

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface WeaponUpgradeReq {
    var foodWeaponGuidList: List<Long>
    var itemParamList: List<ItemParam>
    var targetWeaponGuid: Long
}
