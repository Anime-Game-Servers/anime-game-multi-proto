package org.anime_game_servers.multi_proto.gi.data.activity.fleur_fair_v2

import org.anime_game_servers.core.base.Version.GI_3_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_5_0)
@ProtoModel
internal interface FleurFairV2PacmanInfo {
    var stageDataList: List<FleurFairV2StageData>
    var unk35IHCMMNBKCFH: Int
}