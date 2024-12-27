package org.anime_game_servers.multi_proto.gi.data.general.ability

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_5_0)
@ProtoModel
internal interface MassivePropParam {
    @RemovedIn(Version.GI_1_6_0)
    var elementReactionType: Int
    @RemovedIn(Version.GI_1_6_0)
    var casterId: Int
    @AddedIn(Version.GI_1_6_0)
    var type: Int
    @AddedIn(Version.GI_1_6_0)
    var reactionInfoList: List<Int>
    var paramList: List<Float>
    var syncFlag: Int
}