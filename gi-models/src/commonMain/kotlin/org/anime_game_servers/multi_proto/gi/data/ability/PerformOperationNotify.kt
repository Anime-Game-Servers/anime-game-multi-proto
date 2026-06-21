package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_3_3_0)
@ProtoCommand(NOTIFY)
internal interface PerformOperationNotify {
    var entityId: Int
    var index: Int
    var operateType: OperateType
    var pos: Vector
    var rot: Vector
}
