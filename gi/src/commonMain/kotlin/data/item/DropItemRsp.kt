package data.item

import data.storage.StoreType
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(RESPONSE)
internal interface DropItemRsp {
    var guid: Long
    var storeType: StoreType
    var retCode: Int
}
