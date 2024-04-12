package data.coop

import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_4_0)
@ProtoEnum("CoopPoint", "State")
internal enum class CoopPointState {
    STATE_UNSTARTED,
    STATE_STARTED,
    STATE_FINISHED,
}
