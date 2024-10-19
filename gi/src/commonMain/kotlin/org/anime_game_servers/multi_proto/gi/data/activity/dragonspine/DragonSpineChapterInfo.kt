package org.anime_game_servers.multi_proto.gi.data.activity.dragonspine

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface DragonSpineChapterInfo {
    var chapterId: Int
    var finishedMissionNum: Int
    var isOpen: Boolean
    var openTime: Int
    var progress: Int
}
