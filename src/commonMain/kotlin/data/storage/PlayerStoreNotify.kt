package data.storage

import annotations.AddedIn
import data.general.PropValue
import data.general.item.Item
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface PlayerStoreNotify {
    var storeType: StoreType
    var itemList: List<Item>
    var weightLimit: Int
}