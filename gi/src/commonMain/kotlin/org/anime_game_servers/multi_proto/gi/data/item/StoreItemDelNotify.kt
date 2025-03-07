package org.anime_game_servers.multi_proto.gi.data.item

import org.anime_game_servers.multi_proto.gi.data.storage.StoreType
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface StoreItemDelNotify {
    var guidList: List<Long>
    var storeType: StoreType
}
