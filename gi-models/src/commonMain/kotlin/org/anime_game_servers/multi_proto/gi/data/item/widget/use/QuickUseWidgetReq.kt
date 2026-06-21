package org.anime_game_servers.multi_proto.gi.data.item.widget.use

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector
import org.anime_game_servers.multi_proto.gi.data.item.widget.WidgetCreateLocationInfo
import org.anime_game_servers.multi_proto.gi.data.item.widget.WidgetCreatorInfo
import org.anime_game_servers.multi_proto.gi.data.item.widget.camera.WidgetCameraInfo
import org.anime_game_servers.multi_proto.gi.data.item.widget.thunder_bird_feather.WidgetThunderBirdFeatherInfo

@AddedIn(GI_1_1_0)
@ProtoCommand(REQUEST)
internal interface QuickUseWidgetReq {
    @AddedIn(GI_1_2_0)
    @RemovedIn(GI_2_1_0)
    var isPosValid: Boolean
    @AddedIn(GI_1_2_0)
    @RemovedIn(GI_2_1_0)
    var pos: Vector
    
    @AddedIn(GI_2_0_0)
    @OneOf(
        types = [
            OneOfEntry(Int::class, "target_entity_id"),
            OneOfEntry(WidgetCameraInfo::class, "camera_info"),
            OneOfEntry(WidgetCreatorInfo::class, "creator_info"),
            OneOfEntry(WidgetCreateLocationInfo::class, "location_info"),
            OneOfEntry(WidgetThunderBirdFeatherInfo::class, "thunder_bird_feather_info"),
        ]
    )
    var param: OneOfType
}
