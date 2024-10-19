package org.anime_game_servers.multi_proto.gi.data.item.cooking

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface TakeCompoundOutputRsp {
    var retcode: Retcode
    var itemList: List<ItemParam>
}
