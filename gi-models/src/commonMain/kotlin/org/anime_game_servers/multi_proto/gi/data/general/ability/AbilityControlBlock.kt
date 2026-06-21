package org.anime_game_servers.multi_proto.gi.data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
internal interface AbilityControlBlock {
    var abilityEmbryoList: List<AbilityEmbryo>
}