package data.gadget

import annotations.AddedIn
import data.general.vehicle.VehicleMember
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V2_0_0)
@ProtoCommand(CommandType.RESPONSE)
interface RequestLiveInfoRsp {
    var liveId: Int
    var liveUrl: String
    var spareLiveUrl: String
    var retCode: Int
}