package data.achievement

import annotations.AddedIn
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(messages.VERSION.V1_0_0)
@ProtoEnum("Achievement")
enum class Status {
    @AltName("STATUS_INVALID")
    INVALID,
    @AltName("STATUS_UNFINISHED")
    UNFINISHED,
    @AltName("STATUS_FINISHED")
    FINISHED,
    @AltName("STATUS_REWARD_TAKEN")
    REWARD_TAKEN
}