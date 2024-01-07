package data.scene.entity

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_3_0)
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