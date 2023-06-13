package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.RESPONSE)
interface GadgetInteractRsp {
    var gadgetEntityId: Int
    var interactType: InteractType
    var opType: InterOpType
    var gadgetId: Int
    var retCode: Int
}