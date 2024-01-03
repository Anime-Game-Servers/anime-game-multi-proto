package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import data.general.ProfilePicture
import messages.VERSION
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB1
import messages.VERSION.VCB2
import messages.VERSION.V0_9_0
import messages.VERSION.V1_0_0
import messages.VERSION.V1_6_0

@AddedIn(VCB1)
@ProtoModel
internal interface OnlinePlayerInfo {
    var uid: Int
    var nickname: String
    @RemovedIn(VCB2)
    var state: OnlinePlayerState
    @AddedIn(VCB2)
    var playerLevel: Int
    @AddedIn(VCB2)
    var avatarId: Int
    @AddedIn(VCB2)
    var mpSettingType: MpSettingType
    @AddedIn(VCB2)
    var curPlayerNumInWorld: Int
    @AddedIn(V0_9_0)
    var worldLevel: Int
    @AddedIn(V0_9_0)
    var onlineId: String
    @AddedIn(V0_9_0)
    var blacklistUidList: List<Int>
    @AddedIn(V1_0_0)
    var nameCardId: Int
    @AddedIn(V1_0_0)
    var signature: String
    @AddedIn(V1_6_0)
    var profilePicture: ProfilePicture
    @AddedIn(V1_6_0)
    var psnId: String
}
