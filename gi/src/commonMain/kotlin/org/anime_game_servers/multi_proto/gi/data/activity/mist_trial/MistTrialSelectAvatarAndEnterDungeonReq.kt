package org.anime_game_servers.multi_proto.gi.data.activity.mist_trial

import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_5_0)
@ProtoCommand(REQUEST)
internal interface MistTrialSelectAvatarAndEnterDungeonReq {
    var enterPointId: Int
    var selectTrialAvatarIdList: List<Int>
    var trialId: Int
    @AddedIn(GI_3_3_0)
    var selectAvatarIndexList: List<SelectAvatarIndex>
}
