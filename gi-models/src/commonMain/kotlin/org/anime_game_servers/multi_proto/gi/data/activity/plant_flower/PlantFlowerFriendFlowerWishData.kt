package org.anime_game_servers.multi_proto.gi.data.activity.plant_flower

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface PlantFlowerFriendFlowerWishData {
    var flowerNumMap: Map<Int, Int>
    var nickname: String
    var profilePicture: ProfilePicture
    var uid: Int
}
