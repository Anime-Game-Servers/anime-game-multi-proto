package org.anime_game_servers.multi_proto.gi.data.world.investigation

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("Investigation", "State")
internal enum class InvestigationState {
    @AltName("STATE_INVALID")
    INVALID,
    @AltName("STATE_IN_PROGRESS")
    IN_PROGRESS,
    @AltName("STATE_COMPLETE")
    COMPLETE,
    @AltName("STATE_REWARD_TAKEN")
    REWARD_TAKEN,
}
