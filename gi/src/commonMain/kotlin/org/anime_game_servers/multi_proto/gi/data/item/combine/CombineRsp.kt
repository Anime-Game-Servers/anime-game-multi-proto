package org.anime_game_servers.multi_proto.gi.data.item.combine

import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_CB2)
@ProtoCommand(RESPONSE)
internal interface CombineRsp {
    var retCode: Retcode
    var avatarGuid: Long
    var combineCount: Int
    var combineId: Int
    var costItemList: List<ItemParam>
    var resultItemList: List<ItemParam>
    var totalExtraItemList: List<ItemParam>
    var totalRandomItemList: List<ItemParam>
    var totalReturnItemList: List<ItemParam>
}
