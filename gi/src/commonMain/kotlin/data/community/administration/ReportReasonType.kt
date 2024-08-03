package data.community.administration

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
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
}
