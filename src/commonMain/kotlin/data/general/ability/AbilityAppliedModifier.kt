package data.general.ability

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.VCB1)
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