package org.anime_game_servers.multi_proto.gi.data.spiral_abyss.historical_info

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface TowerMonthlyCombatRecord {
    @AltName("highestDpsAvatrPair")
    var highestDpsAvatarPair: TowerFightRecordPair
    var mostCastEnergySkillAvatarPair: TowerFightRecordPair
    var mostCastNormalSkillAvatarPair: TowerFightRecordPair
    var mostKillAvatarPair: TowerFightRecordPair
    var mostRevealAvatarList: List<TowerFightRecordPair>
    var mostTakeDamageAvatarPair: TowerFightRecordPair
}
