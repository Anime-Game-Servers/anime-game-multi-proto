package org.anime_game_servers.multi_proto.gi.data.fishing

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_1_0)
@ProtoEnum("FishBattleEndRsp")
internal enum class FishNoRewardReason {
    @AltName("FISH_NO_REWARD_REASON_NONE")
    FISH_NO_REWARD_NONE,
    @AltName("FISH_NO_REWARD_REASON_ACTIVITY_LIMIT")
    FISH_NO_REWARD_ACTIVITY_LIMIT,
    @AltName("FISH_NO_REWARD_REASON_BAG_LIMIT")
    FISH_NO_REWARD_BAG_LIMIT,
    @AltName("FISH_NO_REWARD_REASON_POOL_LIMIT")
    FISH_NO_REWARD_POOL_LIMIT,
}