package org.anime_game_servers.multi_proto.gi.data.activity.general

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_8_0)
@ProtoEnum
internal enum class ActivityPushTipsState {
    ACTIVITY_PUSH_TIPS_STATE_NONE,
    ACTIVITY_PUSH_TIPS_STATE_START,
    ACTIVITY_PUSH_TIPS_STATE_READ
}
