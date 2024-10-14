package org.anime_game_servers.multi_proto.gi.data.coop

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_4_0)
@ProtoEnum("CoopChapter", "State")
internal enum class CoopChapterState {
    STATE_CLOSE,
    STATE_COND_NOT_MEET,
    STATE_COND_MEET,
    STATE_ACCEPT,
}
