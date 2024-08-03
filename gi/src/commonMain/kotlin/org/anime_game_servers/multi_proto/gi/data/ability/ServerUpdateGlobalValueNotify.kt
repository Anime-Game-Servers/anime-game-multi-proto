package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(NOTIFY)
internal interface ServerUpdateGlobalValueNotify {
    var delta: Float
    var entityId: Int
    var keyHash: Int
    var updateType: org.anime_game_servers.multi_proto.gi.data.ability.UpdateType
    @AddedIn(GI_1_5_0)
    var value: Float
}
