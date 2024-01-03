package data.scene.entity

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_3_0)
@ProtoEnum
internal enum class MovingPlatformType {
    @AltName("MOVING_PLATFORM_TYPE_NONE")
    MOVING_PLATFORM_NONE,
    @AltName("MOVING_PLATFORM_TYPE_USE_CONFIG")
    MOVING_PLATFORM_USE_CONFIG,
    @AltName("MOVING_PLATFORM_TYPE_ABILITY")
    MOVING_PLATFORM_ABILITY,
    @AltName("MOVING_PLATFORM_TYPE_ROUTE")
    MOVING_PLATFORM_ROUTE,
}