package org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout

import org.anime_game_servers.multi_proto.gi.data.general.ability.breakout.BreakoutSyncConnectUidInfo
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BreakoutSyncCreateConnect {
    var uidInfoList: List<BreakoutSyncConnectUidInfo>
}
