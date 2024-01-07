package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.vehicle.VehicleMember
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_0_0)
@ProtoCommand(CommandType.RESPONSE)
interface RequestLiveInfoRsp {
    var liveId: Int
    var liveUrl: String
    var spareLiveUrl: String
    var retCode: Int
}