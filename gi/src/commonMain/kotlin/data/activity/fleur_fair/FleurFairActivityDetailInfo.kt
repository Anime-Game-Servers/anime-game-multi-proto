package data.activity.fleur_fair

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
interface FleurFairActivityDetailInfo {
    var chapterInfoList: List<FleurFairChapterInfo>
    var contentCloseTime: Int
    var dungeonPunishOverTime: Int
    var dungeonSectionInfoMap: Map<Int, FleurFairDungeonSectionInfo>
    var isContentClosed: Boolean
    var isDungeonUnlocked: Boolean
    var minigameInfoMap: Map<Int, FleurFairMinigameInfo>
    var obtainedToken: Int
}
