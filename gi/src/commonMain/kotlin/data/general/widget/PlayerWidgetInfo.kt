package data.general.widget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.ProtoModel


@AddedIn(GI_3_0_0)
@ProtoModel
internal interface PlayerWidgetInfo {
    var uid: Int
    var slotList: List<WidgetSlotData>
}