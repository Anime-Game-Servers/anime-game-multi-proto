package data.general.widget

import annotations.AddedIn
import messages.VERSION
import org.anime_game_servers.annotations.AltName
import org.anime_game_servers.annotations.ProtoEnum

@AddedIn(VERSION.V1_5_0)
@ProtoEnum
internal enum class WidgetSlotTag {
    @AltName("WIDGET_SLOT_TAG_QUICK_USE")
    WIDGET_SLOT_QUICK_USE,
    @AltName("WIDGET_SLOT_TAG_ATTACH_AVATAR")
    WIDGET_SLOT_ATTACH_AVATAR
}