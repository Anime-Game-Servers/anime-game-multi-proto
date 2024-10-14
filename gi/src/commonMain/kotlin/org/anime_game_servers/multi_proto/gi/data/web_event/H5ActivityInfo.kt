package org.anime_game_servers.multi_proto.gi.data.web_event

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface H5ActivityInfo {
    var beginTime: Int
    var contentCloseTime: Int
    var endTime: Int
    var h5ActivityId: Int
    var h5ScheduleId: Int
    var isEntranceOpen: Boolean
    var prefabPath: String
    var url: String
}
