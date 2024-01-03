package data.general.ability

import annotations.AddedIn
import annotations.RemovedIn
import messages.VERSION
import org.anime_game_servers.annotations.OneOf
import org.anime_game_servers.annotations.OneOfType
import org.anime_game_servers.annotations.ProtoModel

@AddedIn(VERSION.V1_5_0)
@ProtoModel
internal interface MassivePropParam {
    @RemovedIn(VERSION.V1_6_0)
    var elementReactionType: Int
    @RemovedIn(VERSION.V1_6_0)
    var casterId: Int
    @AddedIn(VERSION.V1_6_0)
    var type: Int
    @AddedIn(VERSION.V1_6_0)
    var reactionInfoList: List<Int>
    var paramList: List<Float>
    var syncFlag: Int
}