package org.anime_game_servers.multi_proto.gi.data.battle_pass

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(RESPONSE)
internal interface TakeBattlePassRewardRsp {
    var itemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var retcode: Int
    var takeOptionList: List<org.anime_game_servers.multi_proto.gi.data.battle_pass.BattlePassRewardTakeOption>
}
