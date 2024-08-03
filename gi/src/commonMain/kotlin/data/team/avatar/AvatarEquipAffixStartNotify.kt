package data.team.avatar

import data.general.avatar.AvatarEquipAffixInfo
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(NOTIFY)
internal interface AvatarEquipAffixStartNotify {
    var avatarGuid: Long
    var equipAffixInfo: AvatarEquipAffixInfo
}
