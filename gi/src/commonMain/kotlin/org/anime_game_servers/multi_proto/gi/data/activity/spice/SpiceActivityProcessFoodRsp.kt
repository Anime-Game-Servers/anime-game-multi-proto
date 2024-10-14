package org.anime_game_servers.multi_proto.gi.data.activity.spice

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode
import org.anime_game_servers.multi_proto.gi.data.general.item.ItemParam

@AddedIn(GI_2_6_0)
@ProtoCommand(RESPONSE)
internal interface SpiceActivityProcessFoodRsp {
    var retcode: Retcode
    var normalFoodList: List<ItemParam>
    var specialFoodList: List<ItemParam>
}
