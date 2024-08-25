package org.anime_game_servers.multi_proto.gi.data.item.widget.anchor_point

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface AnchorPointOpRsp {
    var anchorPointId: Int
    var anchorPointOpType: Int
    var retcode: Int
}
