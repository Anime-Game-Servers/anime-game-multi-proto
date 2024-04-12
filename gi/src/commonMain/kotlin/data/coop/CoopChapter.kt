package data.coop

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface CoopChapter {
    var coopCgList: List<CoopCg>
    var coopPointList: List<CoopPoint>
    var coopRewardList: List<CoopReward>
    var finishDialogList: List<Int>
    var finishedEndCount: Int
    var id: Int
    var lockReasonList: List<Int>
    var seenEndingMap: Map<Int, Int>
    var state: CoopChapterState
    var totalEndCount: Int
}
