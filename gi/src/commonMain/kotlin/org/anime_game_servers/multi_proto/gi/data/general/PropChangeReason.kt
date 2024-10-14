package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class PropChangeReason {
    @AltName("PROP_CHANGE_REASON_NONE")
    PROP_CHANGE_NONE,
    @AltName("PROP_CHANGE_REASON_STATUE_RECOVER")
    PROP_CHANGE_STATUE_RECOVER,
    @AltName("PROP_CHANGE_REASON_ENERGY_BALL")
    PROP_CHANGE_ENERGY_BALL,
    @AltName("PROP_CHANGE_REASON_ABILITY")
    PROP_CHANGE_ABILITY,
    @AltName("PROP_CHANGE_REASON_LEVELUP")
    PROP_CHANGE_LEVELUP,
    @AltName("PROP_CHANGE_REASON_ITEM")
    PROP_CHANGE_ITEM,
    @AltName("PROP_CHANGE_REASON_AVATAR_CARD")
    PROP_CHANGE_AVATAR_CARD,
    @AltName("PROP_CHANGE_REASON_CITY_LEVELUP")
    PROP_CHANGE_CITY_LEVELUP,
    @AltName("PROP_CHANGE_REASON_AVATAR_UPGRADE")
    PROP_CHANGE_AVATAR_UPGRADE,
    @AltName("PROP_CHANGE_REASON_AVATAR_PROMOTE")
    PROP_CHANGE_AVATAR_PROMOTE,
    @AltName("PROP_CHANGE_REASON_PLAYER_ADD_EXP")
    PROP_CHANGE_PLAYER_ADD_EXP,
    @AddedIn(GI_CB2)
    @AltName("PROP_CHANGE_REASON_FINISH_QUEST")
    PROP_CHANGE_FINISH_QUEST,
    @AddedIn(GI_1_4_0)
    @AltName("PROP_CHANGE_REASON_GM")
    PROP_CHANGE_GM,
    @AddedIn(GI_1_4_0)
    @AltName("PROP_CHANGE_REASON_MANUAL_ADJUST_WORLD_LEVEL")
    PROP_CHANGE_MANUAL_ADJUST_WORLD_LEVEL,
}
