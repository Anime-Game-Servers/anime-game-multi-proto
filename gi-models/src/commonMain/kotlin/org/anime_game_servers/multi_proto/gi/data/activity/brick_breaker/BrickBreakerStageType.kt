package org.anime_game_servers.multi_proto.gi.data.activity.brick_breaker

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_3_0)
@ProtoEnum
internal enum class BrickBreakerStageType {
    @AltName("BRICK_BREAKER_STAGE_TYPE_PREPARE")
    BRICK_BREAKER_STAGE_PREPARE,
    @AltName("BRICK_BREAKER_STAGE_TYPE_PICK")
    BRICK_BREAKER_STAGE_PICK,
    @AltName("BRICK_BREAKER_STAGE_TYPE_GAME")
    BRICK_BREAKER_STAGE_GAME,
    @AltName("BRICK_BREAKER_STAGE_TYPE_PLAY")
    BRICK_BREAKER_STAGE_PLAY,
    @AltName("BRICK_BREAKER_STAGE_TYPE_SETTLE")
    BRICK_BREAKER_STAGE_SETTLE,
}
