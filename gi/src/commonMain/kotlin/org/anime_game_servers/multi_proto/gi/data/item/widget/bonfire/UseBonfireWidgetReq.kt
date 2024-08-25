package org.anime_game_servers.multi_proto.gi.data.item.widget.bonfire

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_1_0)
@RemovedIn(GI_2_1_0)
@ProtoCommand(REQUEST)
internal interface UseBonfireWidgetReq {
    var pos: Vector
    var rot: Vector
}