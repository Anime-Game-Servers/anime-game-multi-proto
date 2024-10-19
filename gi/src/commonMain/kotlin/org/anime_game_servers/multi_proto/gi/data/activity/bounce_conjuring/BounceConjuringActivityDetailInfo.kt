package org.anime_game_servers.multi_proto.gi.data.activity.bounce_conjuring

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface BounceConjuringActivityDetailInfo {
    var chapterInfoList: List<BounceConjuringChapterInfo>
    var contentCloseTime: Int
    var isContentClosed: Boolean
}
