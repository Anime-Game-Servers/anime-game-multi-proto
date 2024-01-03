package data.general.widget

import annotations.AddedIn
import org.anime_game_servers.annotations.ProtoModel

import messages.VERSION.V1_2_0
import messages.VERSION.V1_5_0
import messages.VERSION.V2_1_0


@AddedIn(V1_2_0)
@ProtoModel
internal interface WidgetSlotData {
    var materialId: Int
    var cdOverTime: Int
    @AddedIn(V1_5_0)
    var tag: WidgetSlotTag
    @AddedIn(V2_1_0)
    var isActive: Boolean
}