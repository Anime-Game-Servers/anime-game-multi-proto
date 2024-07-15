package data.quest.chapter

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class ChapterState {
    CHAPTER_STATE_INVALID,
    CHAPTER_STATE_UNABLE_TO_BEGIN,
    CHAPTER_STATE_BEGIN,
    CHAPTER_STATE_END,
}
