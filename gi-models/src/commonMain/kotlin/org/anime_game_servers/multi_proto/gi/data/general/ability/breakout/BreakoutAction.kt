package org.anime_game_servers.multi_proto.gi.data.general.ability.breakout

import org.anime_game_servers.multi_proto.gi.data.ability.mixin.breakout.BreakoutActionType
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BreakoutAction {
    var actionType: BreakoutActionType
    var clientGameTime: Long
    var elementReactionBuff: Int
    var elementType: Int
    var extraBallDir: BreakoutVector2
    var extraBallIndex: Int
    var hasExtraBall: Boolean
    var isFailed: Boolean
    var moveDir: BreakoutVector2
    var newIndex: Int
    var peerId: Int
    var pos: BreakoutVector2
    var preIndex: Int
    var serverGameTime: Long
    var speed: Int
    var speedIncreaseCount: Int
}