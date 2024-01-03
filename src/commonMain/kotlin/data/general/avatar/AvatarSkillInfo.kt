package data.general.avatar

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
@ProtoModel
internal interface AvatarSkillInfo {
    var passCdTime: Int
    var fullCdTimeList: List<Int>
    var maxChargeCount: Int
}