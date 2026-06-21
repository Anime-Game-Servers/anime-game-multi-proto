package org.anime_game_servers.multi_proto.gi.data.item.widget.one_of_gather_point_detector

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_1_1_0)
@ProtoModel(alternativeNames = ["OneofGatherPointDetectorData","OneoffGatherPointDetectorData"])
internal interface OneOfGatherPointDetectorData {
    var configId: Int
    var groupId: Int
    var hintCenterPos: Vector
    var hintRadius: Int
    var isAllCollected: Boolean
    var isHintValid: Boolean
    var materialId: Int
}
