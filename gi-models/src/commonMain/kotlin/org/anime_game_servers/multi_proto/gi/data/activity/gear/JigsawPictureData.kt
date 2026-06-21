package org.anime_game_servers.multi_proto.gi.data.activity.gear

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_8_0)
@ProtoModel
internal interface JigsawPictureData {
    var isFinished: Boolean
    var isOpen: Boolean
    var lastDuration: Int
    var shortestTime: Int
}
