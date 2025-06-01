package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_0_0)
@ProtoModel
internal interface ExclusiveRuleInfo {
    var objectIdList: List<Int>
    var ruleType: Int
}
