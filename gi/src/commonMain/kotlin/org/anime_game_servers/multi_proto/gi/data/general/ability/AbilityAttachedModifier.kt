package org.anime_game_servers.multi_proto.gi.data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB1)
@ProtoModel
internal interface AbilityAttachedModifier {
    var isInvalid: Boolean
    var ownerEntityId: Int
    var instancedModifierId: Int
    var isServerbuffModifier: Boolean
    var attachNameHash: Int
}