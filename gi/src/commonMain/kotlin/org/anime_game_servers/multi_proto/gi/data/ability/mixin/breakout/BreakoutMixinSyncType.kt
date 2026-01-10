package org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_3_0)
@ProtoEnum("AbilityMixinBreakout", alternativeNames = ["SyncType"])
internal enum class BreakoutMixinSyncType {
    SYNC_TYPE_NONE,
    SYNC_TYPE_CREATE_CONNECT,
    SYNC_TYPE_START_GAME,
    SYNC_TYPE_PING,
    SYNC_TYPE_FINISH_GAME,
    SYNC_TYPE_SNAP_SHOT,
    SYNC_TYPE_ACTION,
}
