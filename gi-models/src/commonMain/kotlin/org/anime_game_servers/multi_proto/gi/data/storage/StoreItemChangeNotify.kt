package org.anime_game_servers.multi_proto.gi.data.storage

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.item.Item
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface StoreItemChangeNotify {
    var storeType: StoreType
    var itemList: List<Item>
}