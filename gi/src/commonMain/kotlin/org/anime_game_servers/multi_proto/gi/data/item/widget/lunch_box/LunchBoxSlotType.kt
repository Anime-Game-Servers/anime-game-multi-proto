package org.anime_game_servers.multi_proto.gi.data.item.widget.lunch_box

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_1_0)
@ProtoEnum
internal enum class LunchBoxSlotType {
    LUNCH_BOX_SLOT_NONE,
    LUNCH_BOX_SLOT_REVIVE,
    LUNCH_BOX_SLOT_HEAL,
}
