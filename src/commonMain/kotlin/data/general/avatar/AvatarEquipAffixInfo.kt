package data.general.avatar

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_0_0)
@ProtoModel
internal interface AvatarEquipAffixInfo {
    var equipAffixId: Int
    var leftCdTime: Int
}