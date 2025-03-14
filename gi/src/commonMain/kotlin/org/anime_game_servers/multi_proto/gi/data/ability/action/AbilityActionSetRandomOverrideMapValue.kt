package org.anime_game_servers.multi_proto.gi.data.ability.action

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface AbilityActionSetRandomOverrideMapValue {
    var randomValue: Float
}
