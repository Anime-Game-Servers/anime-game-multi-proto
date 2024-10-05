package org.anime_game_servers.multi_proto.gi.data.activity.expedition

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface ExpeditionPathInfo {
    var assistAvatarId: Int
    var assistUid: Int
    var avatarIdList: List<Int>
    var bonusProbability: Float
    var markId: Int
    var pathId: Int
    var startTime: Int
    var state: org.anime_game_servers.multi_proto.gi.data.activity.expedition.ExpeditionState
    @AddedIn(GI_2_1_0)
    var assistCostumeId: Int
    @AddedIn(GI_2_1_0)
    var challengeId: Int
}
