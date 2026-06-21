package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface ActivityFriendGiftWishData {
    var giftNumMap: Map<Int, Int>
    var nickname: String
    var profilePicture: ProfilePicture
    var remarkName: String
    var uid: Int
}
