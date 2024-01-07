package data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface AbilityAppliedModifier {
    var modifierLocalId: Int
    var parentAbilityEntityId: Int
    var parentAbilityName: AbilityString
    var parentAbilityOverride: AbilityString
    var instancedAbilityId: Int
    var instancedModifierId: Int
    var existDuration: Float
    var attachedInstancedModifier: AbilityAttachedModifier
    var applyEntityId: Int
    var isAttachedParentAbility: Boolean
    var modifierDurability: ModifierDurability
    var sbuffUid: Int
    var isServerbuffModifier: Boolean
}