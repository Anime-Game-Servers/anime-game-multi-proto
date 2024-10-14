package org.anime_game_servers.multi_proto.gi.data.item.widget.manage_slot

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_5_0)
@ProtoEnum
internal enum class WidgetSlotTag {
    @AltName("WIDGET_SLOT_TAG_QUICK_USE")
    WIDGET_SLOT_QUICK_USE,
    @AltName("WIDGET_SLOT_TAG_ATTACH_AVATAR")
    WIDGET_SLOT_ATTACH_AVATAR,
}
