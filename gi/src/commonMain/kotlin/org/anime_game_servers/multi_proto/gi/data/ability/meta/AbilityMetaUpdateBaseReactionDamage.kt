package org.anime_game_servers.multi_proto.gi.data.ability.meta

import org.anime_game_servers.multi_proto.gi.data.general.ability.AbilityString
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_4_0)
@ProtoModel
internal interface AbilityMetaUpdateBaseReactionDamage {
    var globalValueKey: AbilityString
    var reactionType: Int
    var sourceCasterId: Int
    @AddedIn(GI_3_2_0)
    var abilityName: AbilityString
}
