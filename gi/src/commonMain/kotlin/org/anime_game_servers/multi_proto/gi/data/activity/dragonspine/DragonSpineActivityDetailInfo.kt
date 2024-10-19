package org.anime_game_servers.multi_proto.gi.data.activity.dragonspine

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface DragonSpineActivityDetailInfo {
    var chapterInfoList: List<DragonSpineChapterInfo>
    var contentFinishTime: Int
    var isContentClosed: Boolean
    var shimmeringEssence: Int
    var warmEssence: Int
    var weaponEnhanceLevel: Int
    var wondrousEssence: Int
}
