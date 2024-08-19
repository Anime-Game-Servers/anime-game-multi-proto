package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface GadgetPlayUidInfo {
    var icon: Int
    var nickname: String
    var onlineId: String
    var score: Int
    var uid: Int

    @AddedIn(GI_1_0_0)
    var battleWatcherId: Int

    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
}