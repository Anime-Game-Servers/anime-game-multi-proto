package org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_7_0)
@ProtoModel
internal interface RogueDiaryActivityDetailInfo {
    var curProgress: org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary.RogueDiaryProgress
    var isContentClosed: Boolean
    var isHaveProgress: Boolean
    var stageList: List<org.anime_game_servers.multi_proto.gi.data.activity.rogue_diary.RogueDiaryStageInfo>
}
