package org.anime_game_servers.multi_proto.gi.data.activity.dig

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_2_0)
@ProtoModel
internal interface DigActivityDetailInfo {
    var digMarkPointList: List<org.anime_game_servers.multi_proto.gi.data.activity.dig.DigMarkPoint>
    var stageId: Int
    var stageIdList: List<Int>
}
