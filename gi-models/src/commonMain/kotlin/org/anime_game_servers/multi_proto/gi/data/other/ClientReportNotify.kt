package org.anime_game_servers.multi_proto.gi.data.other

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.CLIENT
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

/**
 * Creates a log or anticheat log depending on the report type
 * @param reportType either `GameQAReport1`,`GameAnimData`, `GameAnalyticsData`
 */
@AddedIn(GI_0_9_0)
@ProtoCommand(CLIENT)
internal interface ClientReportNotify {
    var reportType: String
    var reportValue: String
}