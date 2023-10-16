package data.activity.sea_lamp

import annotations.AddedIn
import annotations.RemovedIn
import data.general.Vector
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.REQUEST)
interface SeaLampFlyLampReq {
    var itemId: Int
    @RemovedIn(VERSION.V1_3_0)
    var wishText: String
    @AddedIn(VERSION.V0_9_0)
    var itemNum: Int
    @AddedIn(VERSION.V1_0_0) @RemovedIn(VERSION.V1_3_0)
    var activityId: Int
    @AddedIn(VERSION.V1_3_0)
    var pos: Vector
    @AddedIn(VERSION.V1_3_0)
    var param: Int
}