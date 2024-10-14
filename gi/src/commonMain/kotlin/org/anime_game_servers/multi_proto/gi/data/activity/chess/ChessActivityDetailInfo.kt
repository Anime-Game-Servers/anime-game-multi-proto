package org.anime_game_servers.multi_proto.gi.data.activity.chess

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_0_0)
@ProtoModel
internal interface ChessActivityDetailInfo {
    var availableExp: Int
    var contentCloseTime: Int
    var exp: Int
    var finishedMapIdList: List<Int>
    var isContentClosed: Boolean
    var isTeachDungeonFinished: Boolean
    var level: Int
    var obtainedExp: Int
    var punishOverTime: Int
}
