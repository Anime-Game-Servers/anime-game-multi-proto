package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.blueprint

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_3_2_0)
@ProtoCommand(RESPONSE)
internal interface HomeDeleteBlueprintRsp {
    var retcode: Retcode
    var slotId: Int
}
