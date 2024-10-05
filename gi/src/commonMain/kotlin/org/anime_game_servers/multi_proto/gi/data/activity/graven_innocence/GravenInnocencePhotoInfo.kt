package org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface GravenInnocencePhotoInfo {
    var objectInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence.GravenInnocencePhotoObjectInfo>
    var stageInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence.GravenInnocencePhotoStageInfo>
}
