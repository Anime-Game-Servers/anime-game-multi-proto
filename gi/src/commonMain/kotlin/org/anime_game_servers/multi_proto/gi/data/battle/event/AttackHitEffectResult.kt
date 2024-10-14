package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AttackHitEffectResult {
    var airStrength: Float
    var hitEffLevel: Int
    var hitHaltTime: Float
    var hitHaltTimeScale: Float
    var retreatStrength: Float
    @AddedIn(GI_1_2_0)
    var originalHitEffLevel: Int
}
