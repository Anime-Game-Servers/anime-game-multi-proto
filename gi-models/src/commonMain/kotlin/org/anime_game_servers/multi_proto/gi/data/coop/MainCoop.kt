package org.anime_game_servers.multi_proto.gi.data.coop

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface MainCoop {
    var id: Int
    var normalVarMap: Map<Int, Int>
    var savePointIdList: List<Int>
    var seenEndingMap: Map<Int, Int>
    var selfConfidence: Int
    var status: Status
    var tempVarMap: Map<Int, Int>
}
