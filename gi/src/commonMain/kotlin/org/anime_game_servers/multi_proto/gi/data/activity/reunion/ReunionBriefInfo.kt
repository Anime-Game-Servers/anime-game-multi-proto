package org.anime_game_servers.multi_proto.gi.data.activity.reunion

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_2_2_0
import org.anime_game_servers.core.base.Version.GI_3_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_2_0)
@ProtoModel
internal interface ReunionBriefInfo {
    var finishTime: Int
    var firstGiftRewardId: Int
    var isTakenFirstGift: Boolean
    var missionHasReward: Boolean
    var missionId: Int
    var privilegeId: Int
    var signInConfigId: Int
    var signInHasReward: Boolean
    var version: String
    @AddedIn(GI_2_1_0)
    var startTime: Int
    @AddedIn(GI_2_2_0)
    var firstDayStartTime: Int
    @AddedIn(GI_3_1_0)
    var privilegeInfo: org.anime_game_servers.multi_proto.gi.data.activity.reunion.ReunionPrivilegeInfo
}
