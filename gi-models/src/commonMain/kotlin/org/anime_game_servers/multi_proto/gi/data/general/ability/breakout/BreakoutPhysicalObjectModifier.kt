package org.anime_game_servers.multi_proto.gi.data.general.ability.breakout

import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_3_0)
@ProtoModel
internal interface BreakoutPhysicalObjectModifier {
    var bool1: Boolean
    var choosePlayerCount: Int
    var combo: Int
    var duration: Int
    var endTime: Int
    var id: Int
    var level: Int
    var param1: Int
    var param2: Int
    var param3: Int
    var param4: Int
    var param5: Int
    var param6: Int
    var peerId: Int
    var skillType: Int
    var type: Int
}
