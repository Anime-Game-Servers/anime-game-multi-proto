package org.anime_game_servers.multi_proto.gi.data.item.widget.manage_cooldown

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_1_0)
@ProtoModel
internal interface WidgetCoolDownData {
    var coolDownTime: Long
    var id: Int
    @AddedIn(GI_2_1_0)
    var isSuccess: Boolean
}
