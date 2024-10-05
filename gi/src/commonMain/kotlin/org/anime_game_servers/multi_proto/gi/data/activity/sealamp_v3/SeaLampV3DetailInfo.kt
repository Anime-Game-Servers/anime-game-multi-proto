package org.anime_game_servers.multi_proto.gi.data.activity.sealamp_v3

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_4_0)
@ProtoModel
internal interface SeaLampV3DetailInfo {
    var campInfo: org.anime_game_servers.multi_proto.gi.data.activity.sealamp_v3.SeaLampV3CampInfo
    var raceInfo: org.anime_game_servers.multi_proto.gi.data.activity.sealamp_v3.SeaLampV3RaceInfo
    var shadowInfo: org.anime_game_servers.multi_proto.gi.data.activity.sealamp_v3.SeaLampV3ShadowInfo
}
