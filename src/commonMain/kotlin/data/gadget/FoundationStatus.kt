package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_3_0)
@ProtoEnum
enum class FoundationStatus {
    FOUNDATION_STATUS_NONE,
    FOUNDATION_STATUS_INIT,
    FOUNDATION_STATUS_BUILDING,
    FOUNDATION_STATUS_BUILT,
}