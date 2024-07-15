package data.item.upgrade

import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface ReliquaryUpgradeReq {
    var foodReliquaryGuidList: List<Long>
    var targetReliquaryGuid: Long
    @AddedIn(GI_1_4_0)
    var itemParamList: List<ItemParam>
}
