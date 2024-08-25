package org.anime_game_servers.multi_proto.gi.data.item.widget

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(REQUEST)
internal interface WidgetReportReq {
    var isClearHint: Boolean
    var isClientCollect: Boolean
    var materialId: Int
    @AddedIn(GI_2_6_0)
    var isClearSkyCrystalHint: Boolean
}
