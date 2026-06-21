package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface FurnitureMakeBeHelpedData {
    var icon: Int
    var playerName: String
    var time: Int
    var uid: Int
    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
}
