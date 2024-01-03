package data.scene

import annotations.AddedIn
import data.general.avatar.AvatarInfo
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.VCB2

@AddedIn(VCB2)
@ProtoModel
internal interface AvatarAddNotify {
    var avatar: AvatarInfo
    var isInTeam: Boolean
}
