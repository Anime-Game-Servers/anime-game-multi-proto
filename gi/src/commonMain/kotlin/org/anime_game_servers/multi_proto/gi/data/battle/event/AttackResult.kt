package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AttackResult {
    var abilityIdentifier: AbilityIdentifier
    var animEventId: String
    @RemovedIn(GI_1_1_0)
    var attackTag: String
    var attackerId: Int
    @RemovedIn(GI_1_1_0)
    var bonusCritical: Float
    @RemovedIn(GI_1_1_0)
    var bonusCriticalHurt: Float
    var criticalRand: Int // Float before 1.1.0
    var damage: Float
    @RemovedIn(GI_1_1_0)
    var damageExtra: Float
    @RemovedIn(GI_1_1_0)
    var damagePercentage: Float
    var defenseId: Int
    var elementAmplifyRate: Float
    var elementType: Int
    var endureBreak: Int
    var gadgetDamageActionIdx: Int
    var hitCollision: HitCollision
    var hitEffResult: AttackHitEffectResult
    var hitPosType: Int
    var hitRetreatAngleCompat: Int
    var isCrit: Boolean
    var isResistText: Boolean
    var resolvedDir: Vector
    @RemovedIn(GI_0_9_0)
    var strikeType: Int
    var useGadgetDamageAction: Boolean
    @AddedIn(GI_CB2)
    @RemovedIn(GI_1_1_0)
    var attenuationTag: String
    @AddedIn(GI_CB2)
    var damageShield: Float
    @AddedIn(GI_CB2)
    var muteElementHurt: Boolean
    @AddedIn(GI_0_9_0)
    var addhurtReactionType: Int
    @AddedIn(GI_0_9_0)
    var amplifyReactionType: Int
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_1_0)
    var attenuationGroup: String
    @AddedIn(GI_0_9_0)
    var bulletFlyTimeMs: Int
    @AddedIn(GI_0_9_0)
    @RemovedIn(GI_1_1_0)
    var trueDamage: Boolean
    @AddedIn(GI_1_0_0)
    var attackCount: Int
    @AddedIn(GI_1_0_0)
    var hashedAnimEventId: Int
    @AddedIn(GI_1_1_0)
    var attackTimestampMs: Int
    @AddedIn(GI_1_2_0)
    var endureDelta: Float
    @AddedIn(GI_1_3_0)
    var elementDurabilityAttenuation: Float
    @AddedIn(GI_1_3_0)
    @RemovedIn(GI_1_4_0)
    var localTargetForwardToSelfAngle: Float
    @AddedIn(GI_1_4_0)
    var targetType: Int
    @AddedIn(GI_2_4_0)
    var createCountSyncToServer: Int
}
