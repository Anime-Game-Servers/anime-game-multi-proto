package org.anime_game_servers.multi_proto.gi.data.item.widget.one_of_gather_point_detector

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_1_0)
@ProtoCommand(NOTIFY, alternateNames = ["OneofGatherPointDetectorDataNotify", "OneoffGatherPointDetectorDataNotify"])
internal interface OneOfGatherPointDetectorDataNotify {
    @AltName("oneofGatherPointDetectorDataList","oneoffGatherPointDetectorDataList")
    var oneOfGatherPointDetectorDataList: List<OneOfGatherPointDetectorData>
}
