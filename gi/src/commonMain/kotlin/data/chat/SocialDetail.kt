package data.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.ProfilePicture
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_1_6_0

@AddedIn(GI_0_9_0)
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
    @AddedIn(GI_1_0_0)
    var nameCardId: Int
    @AddedIn(GI_1_2_0)
    var isChatNoDisturb: Boolean
    @AddedIn(GI_1_2_0)
    var remarkName: String
    @AddedIn(GI_1_3_0)
    var finishAchievementNum: Int
    @AddedIn(GI_1_3_0)
    var towerFloorIndex: Int
    @AddedIn(GI_1_3_0)
    var towerLevelIndex: Int
    @AddedIn(GI_1_3_0)
    var isShowAvatar: Boolean
    @AddedIn(GI_1_3_0)
    var showAvatarInfoList: List<SocialShowAvatarInfo>
    @AddedIn(GI_1_4_0)
    var showNameCardIdList: List<Int>
    @AddedIn(GI_1_5_0)
    var friendEnterHomeOption: FriendEnterHomeOption
    @AddedIn(GI_1_6_0)
    var profilePicture: ProfilePicture
}