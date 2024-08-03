package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityControlBlock
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_1_0_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AbilityChangeNotify {
    var entityId: Int
    var abilityControlBlock: org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityControlBlock
}
