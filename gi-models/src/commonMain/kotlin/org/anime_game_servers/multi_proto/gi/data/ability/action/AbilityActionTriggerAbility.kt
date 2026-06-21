package org.anime_game_servers.multi_proto.gi.data.ability.action

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityActionTriggerAbility {
    var otherId: Int
}
