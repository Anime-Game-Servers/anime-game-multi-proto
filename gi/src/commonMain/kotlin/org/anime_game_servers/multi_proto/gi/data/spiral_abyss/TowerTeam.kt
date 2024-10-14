package org.anime_game_servers.multi_proto.gi.data.spiral_abyss

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface TowerTeam {
    var avatarGuidList: List<Long>
    var towerTeamId: Int
}
