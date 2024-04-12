package data.coop

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_1_0)
@ProtoEnum("MainCoop")
internal enum class Status {
    @AltName("STATUS_INVALID")
    INVALID,
    @AltName("STATUS_RUNNING")
    RUNNING,
    @AltName("STATUS_FINISHED")
    FINISHED,
}
