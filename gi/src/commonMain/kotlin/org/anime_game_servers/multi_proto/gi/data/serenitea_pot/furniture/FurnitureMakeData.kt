package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface FurnitureMakeData {
    var accelerateTime: Int
    var beginTime: Int
    var durTime: Int
    var index: Int
    var makeId: Int
    @AddedIn(GI_2_0_0)
    var avatarId: Int
}
