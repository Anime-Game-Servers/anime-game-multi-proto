package data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.Item
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoEnum(parentClass = "TrialAvatarGrantRecord")
internal enum class GrantReason {
    @AltName("GRANT_REASON_INVALID")
    INVALID,
    @AltName("GRANT_REASON_BY_QUEST")
    GRANT_BY_QUEST,
    @AddedIn(Version.GI_1_0_0)
    @AltName("GRANT_REASON_BY_TRIAL_AVATAR_ACTIVITY")
    GRANT_BY_TRIAL_AVATAR_ACTIVITY,
    @AddedIn(Version.GI_1_2_0)
    @AltName("GRANT_REASON_BY_DUNGEON_ELEMENT_CHALLENGE")
    GRANT_BY_DUNGEON_ELEMENT_CHALLENGE,
    @AddedIn(Version.GI_1_5_0)
    @AltName("GRANT_REASON_BY_MIST_TRIAL_ACTIVITY")
    GRANT_BY_MIST_TRIAL_ACTIVITY,
    @AddedIn(Version.GI_2_1_0)
    @AltName("GRANT_REASON_BY_SUMO_ACTIVITY")
    GRANT_BY_SUMO_ACTIVITY,
    @AddedIn(Version.GI_2_4_0)
    @AltName("GRANT_REASON_POTION_ACTIVITY")
    GRANT_BY_POTION_ACTIVITY,
    @AddedIn(Version.GI_2_6_0)
    @AltName("GRANT_REASON_BY_CRYSTAL_LINK_ACTIVITY")
    GRANT_BY_CRYSTAL_LINK_ACTIVITY,
    @AddedIn(Version.GI_2_6_0)
    @AltName("GRANT_REASON_BY_IRODORI_MASTER")
    GRANT_BY_IRODORI_MASTER,
    @AddedIn(Version.GI_2_8_0)
    @AltName("GRANT_REASON_BY_GM")
    GRANT_BY_GM,
    @AddedIn(Version.GI_3_0_0)
    @AltName("GRANT_REASON_BY_INSTABLE_SPRAY_ACTIVITY")
    GRANT_BY_INSTABLE_SPRAY_ACTIVITY,
    @AddedIn(Version.GI_3_0_0)
    @AltName("GRANT_REASON_BY_MUQADAS_POTION_ACTIVITY")
    GRANT_BY_MUQADAS_POTION_ACTIVITY,
    @AddedIn(Version.GI_3_1_0)
    @AltName("GRANT_REASON_BY_VINTAGE_HUNTING")
    GRANT_BY_VINTAGE_HUNTING,
    @AddedIn(Version.GI_3_2_0)
    @AltName("GRANT_REASON_BY_CHAR_AMUSEMENT")
    GRANT_BY_CHAR_AMUSEMENT,
}