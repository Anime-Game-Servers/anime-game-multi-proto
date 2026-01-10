package org.anime_game_servers.multi_proto.gi.data.activity.reunion

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface ReunionPrivilegeInfo {
    var curDayCount: Int
    var privilegeId: Int
    @AddedIn(GI_2_1_0)
    var totalCount: Int
}
