package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.furniture.custom

import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_2_0)
@ProtoCommand(RESPONSE)
internal interface HomeEditCustomFurnitureRsp {
    var customFurnitureInfo: HomeCustomFurnitureInfo
    var retcode: Retcode
}
