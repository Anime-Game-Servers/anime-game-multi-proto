package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface GadgetPlayUidInfo {
    var uid: Int
    var score: Int
    var icon: Int
    var nickname: String
    var onlineId: String

    @AddedIn(Version.GI_1_0_0)
    var battleWatcherId: Int

    @AddedIn(Version.GI_1_6_0)
    var profilePicture: ProfilePicture
}