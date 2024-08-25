package org.anime_game_servers.multi_proto.gi.data.item.widget.manage_slot

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_5_0)
@ProtoCommand(RESPONSE)
internal interface SetWidgetSlotRsp {
    var materialId: Int
    var op: WidgetSlotOp
    var tagList: List<WidgetSlotTag>
    var retcode: Int
}
