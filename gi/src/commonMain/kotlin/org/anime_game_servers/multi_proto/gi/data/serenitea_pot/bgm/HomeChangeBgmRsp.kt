package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.bgm

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_4_0)
@ProtoCommand(RESPONSE)
internal interface HomeChangeBgmRsp {
    var retcode: Retcode
}