package org.anime_game_servers.multi_proto.gi.data.item.forge

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface ForgeQueueManipulateRsp {
    var extraOutputItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var manipulateType: org.anime_game_servers.multi_proto.gi.data.item.forge.ForgeQueueManipulateType
    var outputItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var returnItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var retCode: Int
}
