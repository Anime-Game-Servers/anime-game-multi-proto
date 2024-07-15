package data.item.combine

import data.general.item.ItemParam
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
    var costItemList: List<ItemParam>
    var resultItemList: List<ItemParam>
    var totalExtraItemList: List<ItemParam>
    var totalRandomItemList: List<ItemParam>
    var totalReturnItemList: List<ItemParam>
    var retCode: Int
}
