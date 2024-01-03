package data.general.avatar

import annotations.AddedIn
import data.general.item.Item
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB2)
@ProtoEnum
internal enum class GrantReason {
    @AltName("GRANT_REASON_INVALID")
    INVALID,
    @AltName("GRANT_REASON_BY_QUEST")
    GRANT_BY_QUEST,
    @AddedIn(VERSION.V1_0_0)
    @AltName("GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY")
    GRANT_BY_TRIAL_AVATAR_ACTIVITY,
    @AddedIn(VERSION.V1_2_0)
    @AltName("GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE")
    GRANT_BY_DUNGEON_ELEMENT_CHALLENGE,
    @AddedIn(VERSION.V1_5_0)
    @AltName("GRANT_REASON_BY_MIST_TRIAL_ACTIVITY")
    GRANT_BY_MIST_TRIAL_ACTIVITY,
    @AddedIn(VERSION.V2_1_0)
    @AltName("GRANT_REASON_BY_SUMO_ACTIVITY")
    GRANT_BY_SUMO_ACTIVITY,
    @AddedIn(VERSION.V2_4_0)
    @AltName("GRANT_REASON_POTION_ACTIVITY")
    GRANT_BY_POTION_ACTIVITY,
    @AddedIn(VERSION.V2_6_0)
    @AltName("GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY")
    GRANT_BY_CRYSTAL_LINK_ACTIVITY,
    @AddedIn(VERSION.V2_6_0)
    @AltName("GRANT_REASON_BY_IRODORI_MASTER")
    GRANT_BY_IRODORI_MASTER,
    @AddedIn(VERSION.V2_8_0)
    @AltName("GRANT_REASON_BY_GM")
    GRANT_BY_GM,
    @AddedIn(VERSION.V3_0_0)
    @AltName("GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY")
    GRANT_BY_INSTABLE_SPRAY_ACTIVITY,
    @AddedIn(VERSION.V3_0_0)
    @AltName("GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY")
    GRANT_BY_MUQADAS_POTION_ACTIVITY,
    @AddedIn(VERSION.V3_1_0)
    @AltName("GRANT_REASON_BY_VINTAGE_HUNTING")
    GRANT_BY_VINTAGE_HUNTING,
    @AddedIn(VERSION.V3_2_0)
    @AltName("GRANT_REASON_BY_CHAR_AMUSEMENT")
    GRANT_BY_CHAR_AMUSEMENT,
}