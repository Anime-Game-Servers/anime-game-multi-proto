package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface CombatInvokeEntry {
    var argumentType: org.anime_game_servers.multi_proto.gi.data.battle.CombatTypeArgument
    var combatData: ByteArray
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
}
