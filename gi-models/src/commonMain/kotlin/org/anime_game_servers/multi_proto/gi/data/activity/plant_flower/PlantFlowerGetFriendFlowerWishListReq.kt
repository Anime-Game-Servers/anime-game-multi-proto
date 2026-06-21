package org.anime_game_servers.multi_proto.gi.data.activity.plant_flower

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_2_0)
@ProtoCommand(REQUEST)
internal interface PlantFlowerGetFriendFlowerWishListReq {
    var scheduleId: Int
}
