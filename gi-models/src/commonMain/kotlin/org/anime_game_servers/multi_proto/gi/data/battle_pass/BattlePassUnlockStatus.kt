package org.anime_game_servers.multi_proto.gi.data.battle_pass

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_0_9_0)
@ProtoEnum
internal enum class BattlePassUnlockStatus {
    @AltName("BATTLE_PASS_UNLOCK_STATUS_INVALID")
    BATTLE_PASS_UNLOCK_INVALID,
    @AltName("BATTLE_PASS_UNLOCK_STATUS_FREE")
    BATTLE_PASS_UNLOCK_FREE,
    @AltName("BATTLE_PASS_UNLOCK_STATUS_PAID")
    BATTLE_PASS_UNLOCK_PAID,
}
