package data.chat

import annotations.AddedIn
import data.general.ProfilePicture
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

import messages.VERSION.V0_9_0
import messages.VERSION.V1_0_0
import messages.VERSION.V1_2_0
import messages.VERSION.V1_3_0
import messages.VERSION.V1_4_0
import messages.VERSION.V1_5_0
import messages.VERSION.V1_6_0

@AddedIn(V0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface SocialDetail {
    var uid: Int
    var nickname: String
    var level: Int
    var avatarId: Int
    var signature: String
    var birthday: Birthday
    var worldLevel: Int
    var reservedList: List<Int>
    var onlineState: FriendOnlineState
    var param: Int
    var isFriend: Boolean
    var isMpModeAvailable: Boolean
    var onlineId: String
    var isInBlacklist: Boolean
    @AddedIn(V1_0_0)
    var nameCardId: Int
    @AddedIn(V1_2_0)
    var isChatNoDisturb: Boolean
    @AddedIn(V1_2_0)
    var remarkName: String
    @AddedIn(V1_3_0)
    var finishAchievementNum: Int
    @AddedIn(V1_3_0)
    var towerFloorIndex: Int
    @AddedIn(V1_3_0)
    var towerLevelIndex: Int
    @AddedIn(V1_3_0)
    var isShowAvatar: Boolean
    @AddedIn(V1_3_0)
    var showAvatarInfoList: List<SocialShowAvatarInfo>
    @AddedIn(V1_4_0)
    var showNameCardIdList: List<Int>
    @AddedIn(V1_5_0)
    var friendEnterHomeOption: FriendEnterHomeOption
    @AddedIn(V1_6_0)
    var profilePicture: ProfilePicture
}