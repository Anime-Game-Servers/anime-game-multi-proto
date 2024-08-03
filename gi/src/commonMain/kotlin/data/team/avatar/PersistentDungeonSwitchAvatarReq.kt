package data.team.avatar

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_8_0)
@ProtoCommand(REQUEST)
internal interface PersistentDungeonSwitchAvatarReq {
    var avatarTeamGuidList: List<Long>
    var curAvatarGuid: Long
}
