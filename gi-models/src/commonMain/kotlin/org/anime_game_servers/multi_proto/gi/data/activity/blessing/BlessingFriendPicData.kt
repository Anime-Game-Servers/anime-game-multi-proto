package org.anime_game_servers.multi_proto.gi.data.activity.blessing

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface BlessingFriendPicData {
    var avatarId: Int
    var nickname: String
    var picNumMap: Map<Int, Int>
    var remarkName: String
    var signature: String
    var uid: Int
    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
}
