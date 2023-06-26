package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.V1_3_0)
@ProtoCommand(CommandType.RESPONSE)
interface FoundationRsp {
    var gadgetEntityId: Int
    var opType: FoundationOpType
    var buildingId: Int
    var pointConfigId: Int
    var retCode: Int
}