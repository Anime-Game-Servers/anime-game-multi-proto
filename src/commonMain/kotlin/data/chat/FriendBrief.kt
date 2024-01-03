package data.chat

import annotations.AddedIn
import data.general.PlatformType
import data.general.ProfilePicture
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.V0_9_0
import messages.VERSION.V1_0_0
import messages.VERSION.V1_2_0
import messages.VERSION.V1_3_0
import messages.VERSION.V1_5_0
import messages.VERSION.V1_6_0
import messages.VERSION.V2_0_0

@AddedIn(V0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface FriendBrief {
    var uid: Int
    var nickname: String
    var level: Int
    var avatarId: Int
    var worldLevel: Int
    var signature: String
    var onlineState: FriendOnlineState
    var param: Int
    var isMpModeAvailable: Boolean
    var onlineId: String
    var lastActiveTime: Int
    @AddedIn(V1_0_0)
    var nameCardId: Int
    @AddedIn(V1_2_0)
    var mpPlayerNum: Int
    @AddedIn(V1_2_0)
    var isChatNoDisturb: Boolean
    @AddedIn(V1_2_0)
    var chatSequence: Int
    @AddedIn(V1_2_0)
    var remarkName: String
    @AddedIn(V1_3_0)
    var showAvatarInfoList: List<SocialShowAvatarInfo>
    @AddedIn(V1_5_0)
    var friendEnterHomeOption: FriendEnterHomeOption
    @AddedIn(V1_6_0)
    var profilePicture: ProfilePicture
    @AddedIn(V2_0_0)
    var isGameSource: Boolean
    @AddedIn(V2_0_0)
    var isPsnSource: Boolean
    @AddedIn(V2_0_0)
    var platformType: PlatformType
}