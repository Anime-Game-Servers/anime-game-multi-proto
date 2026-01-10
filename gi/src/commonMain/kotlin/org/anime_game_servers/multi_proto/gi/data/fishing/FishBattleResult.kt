package org.anime_game_servers.multi_proto.gi.data.fishing

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_1_0)
@ProtoEnum
internal enum class FishBattleResult {
    FISH_BATTLE_RESULT_NONE,
    FISH_BATTLE_RESULT_SUCC,
    FISH_BATTLE_RESULT_FAIL,
    FISH_BATTLE_RESULT_TIMEOUT,
    FISH_BATTLE_RESULT_CANCEL,
    FISH_BATTLE_RESULT_EXIT,
}
