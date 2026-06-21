package org.anime_game_servers.multi_proto.gi.data.activity.sign_in

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_0_9_0)
@ProtoModel
internal interface SignInInfo {
    var beginTime: Int
    var configId: Int
    var endTime: Int
    var isCondSatisfied: Boolean
    var lastSignInTime: Int
    var rewardDayList: List<Int>
    var scheduleId: Int
    var signInCount: Int
    @AddedIn(GI_2_4_0)
    var signinDataList: List<SignInData>
}
