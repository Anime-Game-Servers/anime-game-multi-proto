package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_1_5_0)
@ProtoCommand(RESPONSE)
internal interface TakeFurnitureMakeRsp {
    var furnitureMakeSlot: FurnitureMakeSlot
    var makeId: Int
    var retcode: Retcode
    @AddedIn(GI_2_0_0)
    var outputItemList: List<ItemParam>
    @AddedIn(GI_2_0_0)
    var returnItemList: List<ItemParam>
}
