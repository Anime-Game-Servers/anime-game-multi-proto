package data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB1)
@ProtoCommand(CommandType.REQUEST)
interface GadgetInteractReq {
    var gadgetEntityId: Int
    var gadgetId: Int
    var opType: InterOpType

    @AddedIn(Version.GI_1_1_0)
    var isUseCondenseResin: Boolean

    @AddedIn(Version.GI_1_2_0)
    var resinCostType: ResinCostType

    @AddedIn(Version.GI_2_5_0)
    var uiInteractId: Int
}