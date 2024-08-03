package org.anime_game_servers.multi_proto.gi.data.coop

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface CoopChapter {
    var coopCgList: List<org.anime_game_servers.multi_proto.gi.data.coop.CoopCg>
    var coopPointList: List<org.anime_game_servers.multi_proto.gi.data.coop.CoopPoint>
    var coopRewardList: List<org.anime_game_servers.multi_proto.gi.data.coop.CoopReward>
    var finishDialogList: List<Int>
    var finishedEndCount: Int
    var id: Int
    var lockReasonList: List<Int>
    var seenEndingMap: Map<Int, Int>
    var state: org.anime_game_servers.multi_proto.gi.data.coop.CoopChapterState
    var totalEndCount: Int
}
