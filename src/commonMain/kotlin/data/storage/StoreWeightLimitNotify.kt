package data.storage

import annotations.AddedIn
import data.general.PropValue
import data.general.item.Item
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface StoreWeightLimitNotify {
    var storeType: StoreType
    var weightLimit: Int
    @AddedIn(VERSION.V1_1_0)
    var materialCountLimit: Int
    @AddedIn(VERSION.V1_1_0)
    var weaponCountLimit: Int
    @AddedIn(VERSION.V1_1_0)
    var reliquaryCountLimit: Int
    @AddedIn(VERSION.V1_5_0)
    var furnitureCountLimit: Int
}