package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_3_6_0
import org.anime_game_servers.core.base.Version.GI_3_7_0
import org.anime_game_servers.core.base.Version.GI_4_5_0
import org.anime_game_servers.core.base.Version.GI_5_0_0
import org.anime_game_servers.core.base.Version.GI_5_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum(alternativeNames = ["ChangHpReason"])
internal enum class ChangeHpReason {
    @AltName("CHANGE_HP_REASON_NONE")
    CHANGE_HP_NONE,
    @AltName("CHANGE_HP_REASON_SUB_AVATAR")
    CHANGE_HP_SUB_AVATAR,
    @AltName("CHANGE_HP_REASON_SUB_MONSTER")
    CHANGE_HP_SUB_MONSTER,
    @AltName("CHANGE_HP_REASON_SUB_GEAR")
    CHANGE_HP_SUB_GEAR,
    @AltName("CHANGE_HP_REASON_SUB_ENVIR")
    CHANGE_HP_SUB_ENVIR,
    @AltName("CHANGE_HP_REASON_SUB_FALL")
    CHANGE_HP_SUB_FALL,
    @AltName("CHANGE_HP_REASON_SUB_DRAWN")
    CHANGE_HP_SUB_DRAWN,
    @AltName("CHANGE_HP_REASON_SUB_ABYSS")
    CHANGE_HP_SUB_ABYSS,
    @AltName("CHANGE_HP_REASON_SUB_ABILITY")
    CHANGE_HP_SUB_ABILITY,
    @AltName("CHANGE_HP_REASON_SUB_SUMMON")
    CHANGE_HP_SUB_SUMMON,
    @AltName("CHANGE_HP_REASON_SUB_SCRIPT")
    CHANGE_HP_SUB_SCRIPT,
    @AltName("CHANGE_HP_REASON_SUB_GM")
    CHANGE_HP_SUB_GM,
    @AltName("CHANGE_HP_REASON_ADD_ABILITY")
    CHANGE_HP_ADD_ABILITY,
    @AltName("CHANGE_HP_REASON_ADD_ITEM")
    CHANGE_HP_ADD_ITEM,
    @AltName("CHANGE_HP_REASON_ADD_REVIVE")
    CHANGE_HP_ADD_REVIVE,
    @AltName("CHANGE_HP_REASON_ADD_UPGRADE")
    CHANGE_HP_ADD_UPGRADE,
    @AltName("CHANGE_HP_REASON_ADD_STATUE")
    CHANGE_HP_ADD_STATUE,
    @AltName("CHANGE_HP_REASON_ADD_BACKGROUND")
    CHANGE_HP_ADD_BACKGROUND,
    @AltName("CHANGE_HP_REASON_ADD_GM")
    CHANGE_HP_ADD_GM,
    @AddedIn(GI_CB2)
    @AltName("CHANGE_HP_REASON_SUB_KILL_SELF")
    CHANGE_HP_SUB_KILL_SELF,
    @AddedIn(GI_CB2)
    @AltName("CHANGE_HP_REASON_BY_LUA")
    CHANGE_HP_BY_LUA,
    @AddedIn(GI_1_0_0)
    @AltName("CHANGE_HP_REASON_ADD_TRIAL_AVATAR_ACTIVITY")
    CHANGE_HP_ADD_TRIAL_AVATAR_ACTIVITY,
    @AddedIn(GI_1_2_0)
    @AltName("CHANGE_HP_REASON_SUB_CLIMATE_COLD")
    CHANGE_HP_SUB_CLIMATE_COLD,
    @AddedIn(GI_1_2_0)
    @AltName("CHANGE_HP_REASON_SUB_STORM_LIGHTNING")
    CHANGE_HP_SUB_STORM_LIGHTNING,
    @AddedIn(GI_1_3_0)
    @AltName("CHANGE_HP_REASON_SUB_KILL_SERVER_GADGET")
    CHANGE_HP_SUB_KILL_SERVER_GADGET,
    @AddedIn(GI_1_6_0)
    @AltName("CHANGE_HP_REASON_SUB_REPLACE")
    CHANGE_HP_SUB_REPLACE,
    @AddedIn(GI_1_6_0)
    @AltName("CHANGE_HP_REASON_SUB_PLAYER_LEAVE")
    CHANGE_HP_SUB_PLAYER_LEAVE,
    @AddedIn(GI_2_2_0)
    @AltName("CHANGE_HP_ADD_ROUGUELIKE_SPRING","CHANGE_HP_REASON_ADD_ROGUELIKE_SPRING","CHANGE_HP_REASON_ADD_ROUGUELIKE_SPRING")
    CHANGE_HP_ADD_ROGUELIKE_SPRING,
    @AddedIn(GI_2_4_0)
    @AltName("CHANGE_HP_REASON_ATTACK_BY_ENERGY")
    CHANGE_HP_ATTACK_BY_ENERGY,
    @AddedIn(GI_2_4_0)
    @AltName("CHANGE_HP_REASON_ATTACK_BY_RECYCLE")
    CHANGE_HP_ATTACK_BY_RECYCLE,
    @AddedIn(GI_3_6_0)
    @AltName("CHANGE_HP_REASON_SUB_PLAYER_BACK")
    CHANGE_HP_SUB_PLAYER_BACK,
    @AddedIn(GI_3_7_0)
    @AltName("CHANGE_HP_REASON_SUB_UGC")
    CHANGE_HP_SUB_UGC,
    @AddedIn(GI_4_5_0) // todo verfiy 4.1-4.4
    CHANGE_HP_SUB_DIRTY_WATER_EROSION,
    @AddedIn(GI_4_5_0) // todo verfiy 4.1-4.4
    CHANGE_HP_SUB_DESTROY_SELF,
    @AddedIn(GI_5_0_0)
    CHANGE_HP_SUB_LIQUID_PHLOGISTON,
    @AddedIn(GI_5_2_0) // todo verfiy 5.1
    CHANGE_HP_ADD_EFFIGY_CHALLENGE_V_5,
}
