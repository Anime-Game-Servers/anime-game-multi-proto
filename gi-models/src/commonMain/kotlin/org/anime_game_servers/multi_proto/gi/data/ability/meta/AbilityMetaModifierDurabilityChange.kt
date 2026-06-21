package org.anime_game_servers.multi_proto.gi.data.ability.meta

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@ProtoModel
internal interface AbilityMetaModifierDurabilityChange {
    var reduceDurability: Float
    var remainDurability: Float
}
