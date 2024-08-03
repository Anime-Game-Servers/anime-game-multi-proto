package org.anime_game_servers.multi_proto.gi.data.item.combine

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface CombineRsp {
    var avatarGuid: Long
    var combineCount: Int
    var combineId: Int
    var costItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var resultItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var totalExtraItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var totalRandomItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var totalReturnItemList: List<org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam>
    var retCode: Int
}
