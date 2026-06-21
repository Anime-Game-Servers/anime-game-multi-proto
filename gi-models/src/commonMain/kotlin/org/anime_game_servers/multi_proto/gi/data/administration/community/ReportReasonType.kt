package org.anime_game_servers.multi_proto.gi.data.administration.community

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_5_7_0
import org.anime_game_servers.core.base.Version.GI_6_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_1_0)
@ProtoEnum
internal enum class ReportReasonType {
    @AltName("REPORT_REASON_TYPE_NONE")
    REPORT_REASON_NONE,
    @AltName("REPORT_REASON_TYPE_DECEPTIVE_ADS")
    REPORT_REASON_DECEPTIVE_ADS,
    @AltName("REPORT_REASON_TYPE_ABUSING")
    REPORT_REASON_ABUSING,
    @AltName("REPORT_REASON_TYPE_CHEAT")
    REPORT_REASON_CHEAT,
    @AltName("REPORT_REASON_TYPE_POLITICAL")
    REPORT_REASON_POLITICAL,
    @AltName("REPORT_REASON_TYPE_OTHER")
    REPORT_REASON_OTHER,
    @AddedIn(GI_1_5_0)
    @AltName("REPORT_REASON_TYPE_HOME")
    REPORT_REASON_HOME,
    @AddedIn(GI_5_7_0)
    @AltName("REPORT_REASON_TYPE_FLOOD")
    REPORT_REASON_FLOOD,
    @AddedIn(GI_6_3_0)
    @AltName("REPORT_REASON_TYPE_DLC_BUG,")
    REPORT_REASON_DLC_BUG,
    @AddedIn(GI_6_3_0)
    @AltName("REPORT_REASON_TYPE_DLC_NOT_MATCH")
    REPORT_REASON_DLC_NOT_MATCH,
    @AddedIn(GI_6_3_0)
    @AltName("REPORT_REASON_TYPE_TRICK_CONSUME")
    REPORT_REASON_TRICK_CONSUME,
    @AddedIn(GI_6_3_0)
    @AltName("REPORT_REASON_TYPE_TRICK_THIRD_PARTY_TRANSACTION")
    REPORT_REASON_TRICK_THIRD_PARTY_TRANSACTION,
}
