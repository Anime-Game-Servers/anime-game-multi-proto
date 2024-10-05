package org.anime_game_servers.multi_proto.gi.data.activity.rock_board

import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_1_0)
@ProtoModel
internal interface RockBoardExploreDetailInfo {
    var stageDataList: List<org.anime_game_servers.multi_proto.gi.data.activity.rock_board.RockBoardExploreStageData>
}
