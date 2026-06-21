package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_3_0)
@ProtoEnum("PerformOperationNotify")
internal enum class OperateType {
    OPERATE_TYPE_NONE,
    OPERATE_TYPE_EFFECT,
}