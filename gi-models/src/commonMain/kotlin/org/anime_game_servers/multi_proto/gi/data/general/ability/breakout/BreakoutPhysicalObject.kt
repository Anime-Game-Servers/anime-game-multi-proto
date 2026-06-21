package org.anime_game_servers.multi_proto.gi.data.general.ability.breakout

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BreakoutPhysicalObject {
    var elementReactionBuff: Int
    var elementType: Int
    var id: Int
    var index: Int
    var infoList: List<BreakoutBrickInfo>
    var initPeerId: Int
    var isActive: Boolean
    var lastHitPeerId: Int
    var modifierList: List<BreakoutPhysicalObjectModifier>
    var moveDir: BreakoutVector2
    var offset: Int
    var pos: BreakoutVector2
    var speed: Int
    var speedIncreaseCount: Int
    var state: Int
    var totalRotation: Int
}
