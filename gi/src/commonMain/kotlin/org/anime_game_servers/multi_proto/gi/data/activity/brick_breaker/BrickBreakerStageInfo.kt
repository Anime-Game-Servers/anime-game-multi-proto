package org.anime_game_servers.multi_proto.gi.data.activity.brick_breaker

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BrickBreakerStageInfo {
    var battleInfoList: List<BrickBreakerPlayerBattleInfo>
    var levelId: Int
    var stageType: BrickBreakerStageType
}
