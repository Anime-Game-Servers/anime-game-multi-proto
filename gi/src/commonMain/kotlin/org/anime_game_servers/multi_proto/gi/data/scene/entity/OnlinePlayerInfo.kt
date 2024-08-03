package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_6_0

@AddedIn(GI_CB1)
@ProtoModel
internal interface OnlinePlayerInfo {
    var uid: Int
    var nickname: String
    @RemovedIn(GI_CB2)
    var state: org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerState
    @AddedIn(GI_CB2)
    var playerLevel: Int
    @AddedIn(GI_CB2)
    var avatarId: Int
    @AddedIn(GI_CB2)
    var mpSettingType: org.anime_game_servers.multi_proto.gi.data.scene.entity.MpSettingType
    @AddedIn(GI_CB2)
    var curPlayerNumInWorld: Int
    @AddedIn(GI_0_9_0)
    var worldLevel: Int
    @AddedIn(GI_0_9_0)
    var onlineId: String
    @AddedIn(GI_0_9_0)
    var blacklistUidList: List<Int>
    @AddedIn(GI_1_0_0)
    var nameCardId: Int
    @AddedIn(GI_1_0_0)
    var signature: String
    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
    @AddedIn(GI_1_6_0)
    var psnId: String
}
