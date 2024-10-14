package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_0_0)
@ProtoCommand(CLIENT)
internal interface ClientAbilityChangeNotify {
    var entityId: Int
    var invokes: List<AbilityInvokeEntry>
    @AddedIn(GI_2_2_0)
    var isInitHash: Boolean
}
