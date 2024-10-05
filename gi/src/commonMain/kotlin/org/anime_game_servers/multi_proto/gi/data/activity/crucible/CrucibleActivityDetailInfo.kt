package org.anime_game_servers.multi_proto.gi.data.activity.crucible

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
interface CrucibleActivityDetailInfo {
    var costTime : Int
    var pos: Vector
    var uidInfoList: List<CrucibleBattleUidInfo>
    @AddedIn(GI_1_0_0)
    var battleWorldLevel: Int
}
