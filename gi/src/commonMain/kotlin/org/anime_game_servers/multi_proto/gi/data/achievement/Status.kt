package org.anime_game_servers.multi_proto.gi.data.achievement

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_0_0)
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