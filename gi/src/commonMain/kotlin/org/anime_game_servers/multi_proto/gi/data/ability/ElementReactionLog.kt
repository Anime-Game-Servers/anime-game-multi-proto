package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB2)
@RemovedIn(GI_0_9_0)
@ProtoModel
internal interface ElementReactionLog {
    var abilityName: String
    var animEventId: String
    var attackTag: String
    var count: Int
    var modifierName: String
    var pos: Vector
    var reactionType: Int
    var sourceId: Int
    var sourceLv: Int
    var targetId: Int
    var targetLv: Int
    var time: Int
}
