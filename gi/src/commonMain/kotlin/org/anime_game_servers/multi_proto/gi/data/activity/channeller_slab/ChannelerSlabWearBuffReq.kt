package org.anime_game_servers.multi_proto.gi.data.activity.channeller_slab

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_5_0)
@ProtoCommand(REQUEST, alternateNames = ["ChannellerSlabWearBuffReq"])
internal interface ChannelerSlabWearBuffReq {
    var buffId: Int
    var isMp: Boolean
    var slotId: Int
}
