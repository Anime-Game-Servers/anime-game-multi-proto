package data.general.widget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_1_0


@AddedIn(GI_1_2_0)
@ProtoModel
internal interface WidgetSlotData {
    var materialId: Int
    var cdOverTime: Int
    @AddedIn(GI_1_5_0)
    var tag: WidgetSlotTag
    @AddedIn(GI_2_1_0)
    var isActive: Boolean
}