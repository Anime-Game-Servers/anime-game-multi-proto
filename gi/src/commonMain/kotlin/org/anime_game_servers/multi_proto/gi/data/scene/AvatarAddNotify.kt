package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.avatar.AvatarInfo
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_CB2

@AddedIn(GI_CB2)
@ProtoModel
internal interface AvatarAddNotify {
    var avatar: org.anime_game_servers.multi_proto.gi.data.general.avatar.AvatarInfo
    var isInTeam: Boolean
}
