package org.anime_game_servers.multi_proto.gi.data.item.widget.manage_slot

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_5_0)
@ProtoModel
internal interface WidgetSlotData {
    var cdOverTime: Int
    var materialId: Int
    var tag: WidgetSlotTag
    @AddedIn(GI_2_1_0)
    var isActive: Boolean
}
