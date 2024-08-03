package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@RemovedIn(GI_1_0_0)
@ProtoEnum
internal enum class AbilityResetReasonType {
    ABILITY_CHANGE_SKILL_DEPOT,
    ABILITY_UNLOCK_TALENT,
    ABILITY_CHANGE_EQUIP,
    @AddedIn(GI_CB2)
    ABILITY_PROUD_SKILL,
    @AddedIn(GI_CB2)
    ABILITY_AVATAR_SKILL,
    @AddedIn(GI_CB2)
    ABILITY_CORE_PROUD_SKILL,
    @AddedIn(GI_CB2)
    ABILITY_TALENT_EXTRA_LEVEL,
    @AddedIn(GI_0_9_0)
    ABILITY_TEAM_RESONANCE_CHANGE,
}
