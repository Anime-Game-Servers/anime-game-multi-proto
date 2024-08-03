package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_2_8_0)
@ProtoCommand(CommandType.REQUEST)
interface NightCrowGadgetObservationMatchReq {
    var targetGadgetState: Int
    var gadgetEntityId: Int
}