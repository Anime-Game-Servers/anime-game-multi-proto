package org.anime_game_servers.multi_proto.gi.data.item.forge

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface ForgeQueueManipulateRsp {
    var retCode: Retcode
    var extraOutputItemList: List<ItemParam>
    var manipulateType: ForgeQueueManipulateType
    var outputItemList: List<ItemParam>
    var returnItemList: List<ItemParam>
}
