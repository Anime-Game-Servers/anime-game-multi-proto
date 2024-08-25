package org.anime_game_servers.multi_proto.gi.data.item.widget

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_6_0)
@RemovedIn(GI_2_2_0)
@ProtoCommand(RESPONSE)
internal interface WidgetAddServerBuffRsp {
    var materialId: Int
    var retcode: Int
}
