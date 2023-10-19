package data.achievement

import annotations.AddedIn
import data.general.item.ItemParam
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_0_0)
@ProtoCommand(CommandType.RESPONSE)
interface TakeAchievementRewardRsp {
    var idList: List<Int>
    var itemList: List<ItemParam>
    var retCode: Int
}