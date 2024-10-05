package org.anime_game_servers.multi_proto.gi.data.activity.island_party

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_8_0)
@ProtoModel
internal interface IslandPartyDetailInfo {
    var stageDataList: List<org.anime_game_servers.multi_proto.gi.data.activity.island_party.IslandPartyStageData>
}
