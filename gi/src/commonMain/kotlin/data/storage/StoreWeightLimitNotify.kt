package data.storage

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.PropValue
import data.general.item.Item
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.NOTIFY)
internal interface StoreWeightLimitNotify {
    var storeType: StoreType
    var weightLimit: Int
    @AddedIn(Version.GI_1_1_0)
    var materialCountLimit: Int
    @AddedIn(Version.GI_1_1_0)
    var weaponCountLimit: Int
    @AddedIn(Version.GI_1_1_0)
    var reliquaryCountLimit: Int
    @AddedIn(Version.GI_1_5_0)
    var furnitureCountLimit: Int
}