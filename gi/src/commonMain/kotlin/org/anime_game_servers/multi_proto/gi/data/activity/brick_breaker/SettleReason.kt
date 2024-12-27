package org.anime_game_servers.multi_proto.gi.data.activity.brick_breaker

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_3_3_0)
@ProtoEnum("BrickBreakerSettleNotify")
internal enum class SettleReason {
    @AltName("SETTLE_REASON_TIME_OUT")
    SETTLE_TIME_OUT,
    @AltName("SETTLE_REASON_PLAY_END")
    SETTLE_PLAY_END,
    @AltName("SETTLE_REASON_PLAYER_QUIT")
    SETTLE_PLAYER_QUIT,
    @AltName("SETTLE_REASON_LIFE_COUNT")
    SETTLE_LIFE_COUNT,
}
