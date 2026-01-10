package org.anime_game_servers.multi_proto.gi.data.watcher

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum
internal enum class PushTipsState {
    PUSH_TIPS_STATE_NONE,
    PUSH_TIPS_STATE_START,
    PUSH_TIPS_STATE_READ,
    PUSH_TIPS_STATE_FINISH,
}
