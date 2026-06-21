package org.anime_game_servers.multi_proto.gi.data.activity.brick_breaker

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BrickBreakerDetailInfo {
    var dungeonLevelInfoList: List<BrickBreakerLevelInfo>
    var skillInfoMap: Map<Int, Int>
    var stageInfoList: List<BrickBreakerActivityStageInfo>
    var worldLevelInfoList: List<BrickBreakerLevelInfo>
}
