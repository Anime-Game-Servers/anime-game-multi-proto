package org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite

import org.anime_game_servers.multi_proto.gi.data.general.ClientInputType
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_4_0)
@ProtoCommand(REQUEST)
internal interface ViewLanternProjectionTipsReq {
    var inputType: ClientInputType
    var isInputTips: Boolean
}
