package org.anime_game_servers.multi_proto.gi.data.item.upgrade

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface CalcWeaponUpgradeReturnItemsRsp {
    var retCode: Retcode
    var itemParamList: List<ItemParam>
    var targetWeaponGuid: Long
}
