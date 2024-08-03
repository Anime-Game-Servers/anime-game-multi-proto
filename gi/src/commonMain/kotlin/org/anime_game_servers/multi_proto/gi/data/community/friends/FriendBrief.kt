package org.anime_game_servers.multi_proto.gi.data.community.friends

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.PlatformType
import org.anime_game_servers.multi_proto.gi.data.general.ProfilePicture
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_0_0

@AddedIn(GI_0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface FriendBrief {
    var uid: Int
    var nickname: String
    var level: Int
    var avatarId: Int
    var worldLevel: Int
    var signature: String
    var onlineState: org.anime_game_servers.multi_proto.gi.data.community.friends.FriendOnlineState
    var param: Int
    var isMpModeAvailable: Boolean
    var onlineId: String
    var lastActiveTime: Int
    @AddedIn(GI_1_0_0)
    var nameCardId: Int
    @AddedIn(GI_1_2_0)
    var mpPlayerNum: Int
    @AddedIn(GI_1_2_0)
    var isChatNoDisturb: Boolean
    @AddedIn(GI_1_2_0)
    var chatSequence: Int
    @AddedIn(GI_1_2_0)
    var remarkName: String
    @AddedIn(GI_1_3_0)
    var showAvatarInfoList: List<org.anime_game_servers.multi_proto.gi.data.community.SocialShowAvatarInfo>
    @AddedIn(GI_1_5_0)
    var friendEnterHomeOption: org.anime_game_servers.multi_proto.gi.data.community.friends.FriendEnterHomeOption
    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
    @AddedIn(GI_2_0_0)
    var isGameSource: Boolean
    @AddedIn(GI_2_0_0)
    var isPsnSource: Boolean
    @AddedIn(GI_2_0_0)
    var platformType: PlatformType
}