package org.anime_game_servers.multi_proto.gi.data.activity.bartender

import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_2_5_0)
@ProtoCommand(REQUEST)
internal interface BartenderGetFormulaReq {
    var itemList: List<ItemParam>
    var questId: Int
}
