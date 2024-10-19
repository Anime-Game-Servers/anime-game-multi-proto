package org.anime_game_servers.multi_proto.gi.data.activity.dragonspine

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_2_0)
@ProtoCommand(NOTIFY)
internal interface DragonSpineChapterOpenNotify {
    var chapterId: Int
    var scheduleId: Int
}
