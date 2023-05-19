package data.activity.sea_lamp

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB2)
@ProtoCommand(CommandType.RESPONSE)
interface SeaLampFlyLampRsp {
    var totalContribution: Int
    var retcode: Int
    @AddedIn(VERSION.V0_9_0)
    var remainFlyNum: Int
    @AddedIn(VERSION.V0_9_0)
    var addContribution: Int
    @AddedIn(VERSION.V0_9_0)
    var addProgress: Int
    @AddedIn(VERSION.V0_9_0)
    var itemNum: Int
}