package org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface GravenInnocenceDetailInfo {
    var campInfo: org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence.GravenInnocenceCampInfo
    var carveInfo: org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence.GravenInnocenceCarveInfo
    var isContentClosed: Boolean
    var photoInfo: org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence.GravenInnocencePhotoInfo
    var raceInfo: org.anime_game_servers.multi_proto.gi.data.activity.graven_innocence.GravenInnocenceRaceInfo
}
