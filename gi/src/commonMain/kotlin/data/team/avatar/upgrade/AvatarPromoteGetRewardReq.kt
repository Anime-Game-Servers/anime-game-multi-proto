package data.team.avatar.upgrade

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_2_0)
@ProtoCommand(REQUEST)
internal interface AvatarPromoteGetRewardReq {
    var avatarGuid: Long
    var promoteLevel: Int
}
