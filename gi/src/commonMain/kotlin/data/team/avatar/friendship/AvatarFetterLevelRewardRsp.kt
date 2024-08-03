package data.team.avatar.friendship

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(RESPONSE)
internal interface AvatarFetterLevelRewardRsp {
    var avatarGuid: Long
    var fetterLevel: Int
    var retcode: Int
    var rewardId: Int
}
