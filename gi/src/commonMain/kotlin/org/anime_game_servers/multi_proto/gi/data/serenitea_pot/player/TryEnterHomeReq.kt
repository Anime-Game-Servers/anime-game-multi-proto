package org.anime_game_servers.multi_proto.gi.data.serenitea_pot.player

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_5_0)
@ProtoCommand(REQUEST)
internal interface TryEnterHomeReq {
    var targetUid: Int
    @AddedIn(GI_2_0_0)
    var targetPoint: Int
    @AddedIn(GI_3_1_0)
    var isTransferToSafePoint: Boolean
}
