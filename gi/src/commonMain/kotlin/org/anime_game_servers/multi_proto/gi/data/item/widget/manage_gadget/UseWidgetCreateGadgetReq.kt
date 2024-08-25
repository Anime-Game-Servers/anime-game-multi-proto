package org.anime_game_servers.multi_proto.gi.data.item.widget.manage_gadget

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_5_0)
@ProtoCommand(REQUEST)
internal interface UseWidgetCreateGadgetReq {
    var materialId: Int
    var pos: Vector
    var rot: Vector
}