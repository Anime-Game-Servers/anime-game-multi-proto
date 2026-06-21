package org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_3_0)
@ProtoEnum("BreakoutAction")
internal enum class BreakoutActionType {
    ACTION_TYPE_NONE,
    ACTION_TYPE_LAUNCH_BALL,
    ACTION_TYPE_DESTROY_BALL,
    ACTION_TYPE_FALLING_OBJECT,
    ACTION_TYPE_MISSILE,
}
