package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_5_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(REQUEST)
internal interface GadgetInteractReq {
    var gadgetEntityId: Int
    var gadgetId: Int
    var opType: InterOpType

    @AddedIn(GI_1_1_0)
    var isUseCondenseResin: Boolean

    @AddedIn(GI_1_2_0)
    var resinCostType: ResinCostType

    @AddedIn(GI_2_5_0)
    var uiInteractId: Int
}