package org.anime_game_servers.multi_proto.gi.data.achievement

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.RESPONSE
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(RESPONSE)
interface TakeAchievementRewardRsp {
    var idList: List<Int>
    var itemList: List<ItemParam>
    var retCode: Int
}
