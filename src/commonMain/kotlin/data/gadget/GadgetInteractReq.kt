package data.gadget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.CommandType
import org.anime_game_servers.annotations.ProtoCommand

@AddedIn(VERSION.VCB1)
@ProtoCommand(CommandType.REQUEST)
interface GadgetInteractReq {
    var gadgetEntityId: Int
    var gadgetId: Int
    var opType: InterOpType

    @AddedIn(VERSION.V1_1_0)
    var isUseCondenseResin: Boolean

    @AddedIn(VERSION.V1_2_0)
    var resinCostType: ResinCostType

    @AddedIn(VERSION.V2_5_0)
    var uiInteractId: Int
}