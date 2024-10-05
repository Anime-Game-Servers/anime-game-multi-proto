package org.anime_game_servers.multi_proto.gi.data.activity.crucible

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture

@AddedIn(GI_0_9_0)
@ProtoModel
interface CrucibleBattleUidInfo {
    var icon: Int
    var nickname: String
    var onlineId : String
    var uid: Int
    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
}
