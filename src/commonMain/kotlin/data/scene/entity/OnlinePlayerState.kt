package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.VCB1) @RemovedIn(VERSION.VCB2)
@ProtoEnum
internal enum class OnlinePlayerState {
    ONLINE_PLAYER_STATE_NONE,
    ONLINE_PLAYER_STATE_IN_DYNAMIC_DUNGEON,
}