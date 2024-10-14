package org.anime_game_servers.multi_proto.gi.data.item.widget.use

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

/**
 * Uses a widget directly from of the player bag
 */
@AddedIn(GI_2_1_0)
@ProtoCommand(RESPONSE)
internal interface WidgetDoBagRsp {
    var retcode: Retcode
    var materialId: Int
}
