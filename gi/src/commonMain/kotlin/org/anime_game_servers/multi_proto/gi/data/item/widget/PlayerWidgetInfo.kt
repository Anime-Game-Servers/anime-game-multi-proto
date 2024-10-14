package org.anime_game_servers.multi_proto.gi.data.item.widget

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.item.widget.manage_slot.WidgetSlotData

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface PlayerWidgetInfo {
    var slotList: List<WidgetSlotData>
    var uid: Int
}
