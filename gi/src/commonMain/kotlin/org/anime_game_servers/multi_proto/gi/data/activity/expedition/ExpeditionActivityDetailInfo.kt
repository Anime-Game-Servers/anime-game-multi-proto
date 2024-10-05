package org.anime_game_servers.multi_proto.gi.data.activity.expedition

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface ExpeditionActivityDetailInfo {
    var challengeInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.expedition.ExpeditionChallengeInfo>
    var contentCloseTime: Int
    var curChallengeId: Int
    var expeditionCount: Int
    var isContentClosed: Boolean
    var pathInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.expedition.ExpeditionPathInfo>
}
