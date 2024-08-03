package org.anime_game_servers.multi_proto.gi.data.battle.event

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(CLIENT)
internal interface EvtBulletHitNotify {
    var entityId: Int
    var forwardPeer: Int
    var forwardType: org.anime_game_servers.multi_proto.gi.data.battle.ForwardType
    var hitBoxIndex: Int
    var hitColliderType: org.anime_game_servers.multi_proto.gi.data.battle.event.HitColliderType
    var hitEntityId: Int
    var hitNormal: Vector
    var hitPoint: Vector
    @AddedIn(GI_2_7_0)
    var singleBulletId: Int
}
