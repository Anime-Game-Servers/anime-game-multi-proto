package data.achievement

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(messages.VERSION.V1_0_0)
@ProtoEnum
enum class Status {
    INVALID,
    UNFINISHED,
    FINISHED,
    REWARD_TAKEN
}