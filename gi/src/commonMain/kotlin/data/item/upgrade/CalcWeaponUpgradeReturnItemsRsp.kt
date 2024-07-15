package data.item.upgrade

import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface CalcWeaponUpgradeReturnItemsRsp {
    var itemParamList: List<ItemParam>
    var targetWeaponGuid: Long
    var retCode: Int
}
