package org.anime_game_servers.multi_proto.gi.data.quest.chapter

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface ChapterStateNotify {
    var chapterId: Int
    var chapterState: org.anime_game_servers.multi_proto.gi.data.quest.chapter.ChapterState
    @AddedIn(GI_0_9_0)
    var needBeginTime: org.anime_game_servers.multi_proto.gi.data.quest.chapter.NeedBeginTime
    @AddedIn(GI_0_9_0)
    var needPlayerLevel: org.anime_game_servers.multi_proto.gi.data.quest.chapter.NeedPlayerLevel
}
