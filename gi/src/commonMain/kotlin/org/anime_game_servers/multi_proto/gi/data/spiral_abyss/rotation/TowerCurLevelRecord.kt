package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.rotation

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.spiral_abyss.TowerTeam

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface TowerCurLevelRecord {
    var buffIdList: List<Int>
    var curFloorId: Int
    var curLevelIndex: Int
    var isEmpty: Boolean
    var towerTeamList: List<TowerTeam>
    @AddedIn(GI_2_4_0)
    var isUpperPart: Boolean
}
