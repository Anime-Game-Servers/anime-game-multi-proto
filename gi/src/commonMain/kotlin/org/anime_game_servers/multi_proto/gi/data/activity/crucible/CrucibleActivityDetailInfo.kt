package org.anime_game_servers.multi_proto.gi.data.activity.crucible

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface CrucibleActivityDetailInfo {
    var costTime : Int
    var uidInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.crucible.CrucibleBattleUidInfo>
    var pos: Vector
    @AddedIn(Version.GI_1_0_0)
    var battleWorldLevel: Int
}