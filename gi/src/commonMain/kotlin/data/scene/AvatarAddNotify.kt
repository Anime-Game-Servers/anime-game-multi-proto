package data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.avatar.AvatarInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB2

@AddedIn(GI_CB2)
@ProtoModel
internal interface AvatarAddNotify {
    var avatar: AvatarInfo
    var isInTeam: Boolean
}
