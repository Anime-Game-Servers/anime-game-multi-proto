package data.item

import data.general.Vector
import data.storage.StoreType
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface DropItemReq {
    var count: Int
    var guid: Long
    var pos: Vector
    var storeType: StoreType
}
