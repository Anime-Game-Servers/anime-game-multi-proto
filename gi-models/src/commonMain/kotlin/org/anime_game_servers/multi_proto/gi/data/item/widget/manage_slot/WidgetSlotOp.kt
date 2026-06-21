package org.anime_game_servers.multi_proto.gi.data.item.widget.manage_slot

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_5_0)
@ProtoEnum
internal enum class WidgetSlotOp {
    WIDGET_SLOT_OP_ATTACH,
    WIDGET_SLOT_OP_DETACH,
}
