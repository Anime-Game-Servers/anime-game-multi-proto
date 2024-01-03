package data.general.widget

import annotations.AddedIn
import messages.VERSION.*
import org.anime_game_servers.annotations.ProtoModel


@AddedIn(V3_0_0)
@ProtoModel
internal interface PlayerWidgetInfo {
    var uid: Int
    var slotList: List<WidgetSlotData>
}