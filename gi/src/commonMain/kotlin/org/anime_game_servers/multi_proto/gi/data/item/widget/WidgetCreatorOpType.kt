package org.anime_game_servers.multi_proto.gi.data.item.widget

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_1_0)
@ProtoEnum
internal enum class WidgetCreatorOpType {
    @AltName("WIDGET_CREATOR_OP_TYPE_NONE")
    WIDGET_CREATOR_TYPE_NONE,
    @AltName("WIDGET_CREATOR_OP_TYPE_RETRACT")
    WIDGET_CREATOR_TYPE_RETRACT,
    @AltName("WIDGET_CREATOR_OP_TYPE_RETRACT_AND_CREATE")
    WIDGET_CREATOR_TYPE_RETRACT_AND_CREATE,
}
