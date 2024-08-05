package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.PlayerDieType
import org.anime_game_servers.multi_proto.gi.data.general.ability.ServerBuff

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface LifeStateChangeNotify {
    var attackTag: String
    var dieType: PlayerDieType
    var entityId: Int
    var lifeState: Int
    var moveReliableSeq: Int
    var sourceEntityId: Int
    @AddedIn(GI_1_6_0)
    var serverBuffList: List<ServerBuff>
}
