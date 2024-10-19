package org.anime_game_servers.multi_proto.gi.data.activity.team_chain

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_4_0)
@ProtoModel
internal interface TeamChainChooseAvatarInfo {
    var avatarId: Int
    var isTrialAvatar: Boolean
}
