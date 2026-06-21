package org.anime_game_servers.multi_proto.gi.data.regional_systems.crimson_wish

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface WorldRoutineTypeInfo {
    var nextRefreshTime: Int
    var routineType: Int
    var worldRoutineInfoList: List<WorldRoutineInfo>
}
