package data.gadget

import annotations.AddedIn
import data.general.ProfilePicture
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V0_9_0)
@ProtoModel
interface GadgetPlayUidInfo {
    var uid: Int
    var score: Int
    var icon: Int
    var nickname: String
    var onlineId: String

    @AddedIn(VERSION.V1_0_0)
    var battleWatcherId: Int

    @AddedIn(VERSION.V1_6_0)
    var profilePicture: ProfilePicture
}