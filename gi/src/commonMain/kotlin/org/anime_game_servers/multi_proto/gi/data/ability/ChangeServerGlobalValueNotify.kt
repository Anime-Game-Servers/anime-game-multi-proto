package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.CLIENT
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

/**
 * Used for some anticheat checks related to sgvs
 */
@AddedIn(GI_2_2_0)
@ProtoCommand(CLIENT)
internal interface ChangeServerGlobalValueNotify {
    var entityId: Int
}