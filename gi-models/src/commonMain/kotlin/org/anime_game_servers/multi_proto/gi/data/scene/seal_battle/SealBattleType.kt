package org.anime_game_servers.multi_proto.gi.data.scene.seal_battle

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class SealBattleType {
    @AltName("SEAL_BATTLE_TYPE_KEEP_ALIVE")
    SEAL_BATTLE_KEEP_ALIVE,
    @AltName("SEAL_BATTLE_TYPE_KILL_MONSTER")
    SEAL_BATTLE_KILL_MONSTER,
    @AddedIn(GI_1_1_0)
    @AltName("SEAL_BATTLE_TYPE_ENERGY_CHARGE")
    SEAL_BATTLE_ENERGY_CHARGE,
}
