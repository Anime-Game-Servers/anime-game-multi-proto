package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.base_info

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.serenitea_pot.HomePriorCheckNotify

/**
 * Server answers with multiple notifies as response to this request.
 * This contains for example [HomePriorCheckNotify], [HomeBasicInfoNotify] and [HomeComfortInfoNotify]
 */
@AddedIn(GI_1_5_0)
@ProtoCommand(REQUEST)
internal interface HomeGetBasicInfoReq {
}
