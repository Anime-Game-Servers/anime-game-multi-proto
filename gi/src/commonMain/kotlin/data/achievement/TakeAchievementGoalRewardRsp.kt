package data.achievement

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.ItemParam
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_1_0_0)
@ProtoCommand(CommandType.RESPONSE)
interface TakeAchievementGoalRewardRsp {
    var idList: List<Int>
    var itemList: List<ItemParam>
    var retCode: Int
}