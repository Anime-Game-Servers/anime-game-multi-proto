package org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge_v2

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface EffigyChallengeV2DetailInfo {
    var levelDataList: List<org.anime_game_servers.multi_proto.gi.data.activity.effigy_challenge_v2.EffigyChallengeV2LevelData>
}
