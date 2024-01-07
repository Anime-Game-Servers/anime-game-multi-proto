package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_CB1) @RemovedIn(Version.GI_CB2)
@ProtoEnum
internal enum class OnlinePlayerState {
    ONLINE_PLAYER_STATE_NONE,
    ONLINE_PLAYER_STATE_IN_DYNAMIC_DUNGEON,
}