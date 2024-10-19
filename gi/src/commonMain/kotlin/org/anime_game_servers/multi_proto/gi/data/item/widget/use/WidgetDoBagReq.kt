package org.anime_game_servers.multi_proto.gi.data.item.widget.use

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.item.widget.WidgetCreateLocationInfo
import org.anime_game_servers.multi_proto.gi.data.item.widget.WidgetCreatorInfo

/**
 * Uses a widget directly from of the player bag
 */
@AddedIn(GI_2_1_0)
@ProtoCommand(REQUEST)
internal interface WidgetDoBagReq {
    var materialId: Int
    
    @OneOf(
        types = [
            OneOfEntry(WidgetCreateLocationInfo::class, "location_info"),
            OneOfEntry(WidgetCreatorInfo::class, "widget_creator_info"),
        ]
    )
    var opInfo: OneOfType
}
