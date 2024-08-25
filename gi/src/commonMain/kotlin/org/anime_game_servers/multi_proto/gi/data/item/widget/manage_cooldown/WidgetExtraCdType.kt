package org.anime_game_servers.multi_proto.gi.data.item.widget.manage_cooldown

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_3_0)
@ProtoEnum(alternativeNames = ["WidgetExtraCDType", "WIDGET_EXTRA_CD_TYPE", "WIDGETEXTRACDTYPE"])
internal enum class WidgetExtraCdType {
    WIDGET_EXTRA_CD_TYPE_NONE,
    WIDGET_EXTRA_CD_TYPE_E_SKILL_SHARED,
}
