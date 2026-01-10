package org.anime_game_servers.multi_proto.gi.data.offering

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_1_2_0)
@ProtoCommand(RESPONSE)
internal interface PlayerOfferingRsp {
    var retcode: Retcode
    var offeringData: PlayerOfferingData
    @AddedIn(GI_2_6_0)
    var itemList: List<ItemParam>
}
