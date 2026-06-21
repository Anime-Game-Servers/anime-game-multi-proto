package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.gallery

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture

@AddedIn(GI_2_3_0)
@ProtoModel
internal interface HomeGroupPlayerInfo {
    var nickname: String
    var onlineId: String
    var playerLevel: Int
    var profilePicture: ProfilePicture
    var psnId: String
    var uid: Int
}
