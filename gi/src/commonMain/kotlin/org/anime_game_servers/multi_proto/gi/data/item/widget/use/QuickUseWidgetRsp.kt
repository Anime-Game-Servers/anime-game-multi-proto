package org.anime_game_servers.multi_proto.gi.data.item.widget.use

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.item.widget.ClientCollectorData
import org.anime_game_servers.multi_proto.gi.data.item.widget.one_of_gather_point_detector.OneOfGatherPointDetectorData
import org.anime_game_servers.multi_proto.gi.data.item.widget.sky_cristal_detector.SkyCrystalDetectorQuickUseResult

@AddedIn(GI_1_1_0)
@ProtoCommand(RESPONSE)
internal interface QuickUseWidgetRsp {
    @RemovedIn(GI_2_6_0)
    var clientCollectorData: ClientCollectorData
    @RemovedIn(GI_2_6_0)
    var detectorData: OneOfGatherPointDetectorData
    var materialId: Int
    var retcode: Int
    
    @AddedIn(GI_2_6_0)
    @OneOf(
        types = [
            OneOfEntry(ClientCollectorData::class, "client_collector_data"),
            OneOfEntry(OneOfGatherPointDetectorData::class, "detector_data"),
            OneOfEntry(SkyCrystalDetectorQuickUseResult::class, "sky_crystal_detector_quick_use_result"),
        ]
    )
    var param: OneOfType
}
