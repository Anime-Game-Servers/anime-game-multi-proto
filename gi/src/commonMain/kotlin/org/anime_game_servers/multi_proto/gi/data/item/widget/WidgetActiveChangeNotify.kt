package org.anime_game_servers.multi_proto.gi.data.item.widget

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.item.widget.manage_slot.WidgetSlotData

@AddedIn(GI_2_1_0)
@ProtoCommand(NOTIFY)
internal interface WidgetActiveChangeNotify {
    var widgetDataList: List<WidgetSlotData>
}
