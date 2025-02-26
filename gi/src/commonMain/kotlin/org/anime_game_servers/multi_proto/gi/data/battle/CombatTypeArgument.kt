package org.anime_game_servers.multi_proto.gi.data.battle

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.Version.GI_4_0_0
import org.anime_game_servers.core.base.Version.GI_4_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum
internal enum class CombatTypeArgument {
    @AltName("COMBAT_TYPE_ARGUMENT_NONE")
    COMBAT_NONE,
    @AltName("COMBAT_TYPE_ARGUMENT_EVT_BEING_HIT")
    COMBAT_EVT_BEING_HIT,
    @AltName("COMBAT_TYPE_ARGUMENT_ANIMATOR_STATE_CHANGED")
    COMBAT_ANIMATOR_STATE_CHANGED,
    @AltName("COMBAT_TYPE_ARGUMENT_FACE_TO_DIR")
    COMBAT_FACE_TO_DIR,
    @AltName("COMBAT_TYPE_ARGUMENT_SET_ATTACK_TARGET")
    COMBAT_SET_ATTACK_TARGET,
    @AltName("COMBAT_TYPE_ARGUMENT_RUSH_MOVE")
    COMBAT_RUSH_MOVE,
    @AltName("COMBAT_TYPE_ARGUMENT_ANIMATOR_PARAMETER_CHANGED")
    COMBAT_ANIMATOR_PARAMETER_CHANGED,
    @AltName("COMBAT_TYPE_ARGUMENT_ENTITY_MOVE")
    ENTITY_MOVE,
    @RemovedIn(GI_1_0_0)
    COMBAT_EVT_HITTING_OTHER,
    @AddedIn(GI_1_0_0)
    @AltName("COMBAT_TYPE_ARGUMENT_SYNC_ENTITY_POSITION")
    SYNC_ENTITY_POSITION,
    @AddedIn(GI_1_0_0)
    @AltName("COMBAT_TYPE_ARGUMENT_STEER_MOTION_INFO")
    COMBAT_STEER_MOTION_INFO,
    @AddedIn(GI_1_0_0)
    @AltName("COMBAT_TYPE_ARGUMENT_FORCE_SET_POS_INFO")
    COMBAT_FORCE_SET_POS_INFO,
    @AddedIn(GI_1_1_0)
    @AltName("COMBAT_TYPE_ARGUMENT_COMPENSATE_POS_DIFF")
    COMBAT_COMPENSATE_POS_DIFF,
    @AddedIn(GI_1_3_0)
    @AltName("COMBAT_TYPE_ARGUMENT_MONSTER_DO_BLINK")
    COMBAT_MONSTER_DO_BLINK,
    @AddedIn(GI_1_3_0)
    @AltName("COMBAT_TYPE_ARGUMENT_FIXED_RUSH_MOVE")
    COMBAT_FIXED_RUSH_MOVE,
    @AddedIn(GI_1_5_0)
    @AltName("COMBAT_TYPE_ARGUMENT_SYNC_TRANSFORM")
    COMBAT_SYNC_TRANSFORM,
    @AddedIn(GI_2_0_0)
    @AltName("COMBAT_TYPE_ARGUMENT_LIGHT_CORE_MOVE")
    COMBAT_LIGHT_CORE_MOVE,
    @AddedIn(GI_2_3_0)
    @AltName("COMBAT_TYPE_ARGUMENT_BEING_HEALED_NTF")
    COMBAT_BEING_HEALED_NTF,
    @AddedIn(GI_2_7_0)
    @AltName("COMBAT_TYPE_ARGUMENT_SKILL_ANCHOR_POSITION_NTF")
    COMBAT_SKILL_ANCHOR_POSITION_NTF,
    @AddedIn(GI_3_0_0)
    @AltName("COMBAT_TYPE_ARGUMENT_GRAPPLING_HOOK_MOVE")
    COMBAT_GRAPPLING_HOOK_MOVE,
    @AddedIn(GI_4_0_0) // TODO verify 3.8.0
    @AltName("COMBAT_TYPE_ARGUMENT_SPECIAL_MOTION_INFO")
    COMBAT_SPECIAL_MOTION_INFO,
    @AddedIn(GI_4_5_0) // TODO verify 4.1-4.4
    @AltName("COMBAT_TYPE_ARGUMENT_FIXED_AVATAR_FLASH_MOVE")
    COMBAT_FIXED_AVATAR_FLASH_MOVE,
    @AddedIn(GI_4_5_0) // TODO verify 4.1-4.4
    @AltName("COMBAT_TYPE_ARGUMENT_MULTI_OVERRIDE_ANIM")
    COMBAT_MULTI_OVERRIDE_ANIM,
    @AddedIn(GI_4_5_0) // TODO verify 4.1-4.4
    @AltName("COMBAT_TYPE_ARGUMENT_DEBUG_SYNC_MOTION")
    COMBAT_DEBUG_SYNC_MOTION,
}
