package org.anime_game_servers.multi_proto.gi.data.community.administration

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(REQUEST)
internal interface PlayerReportReq {
    var content: String
    var reason: org.anime_game_servers.multi_proto.gi.data.community.administration.ReportReasonType
    var targetUid: Int
    @AddedIn(GI_1_5_0)
    var targetHomeModuleId: Int
    @AddedIn(GI_1_5_0)
    var targetHomeModuleName: String
}
