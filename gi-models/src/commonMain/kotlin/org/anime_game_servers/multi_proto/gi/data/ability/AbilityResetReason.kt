package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@RemovedIn(GI_1_0_0)
@ProtoModel
internal interface AbilityResetReason {
    var param: Int
    var reasonType: AbilityResetReasonType
}
