package org.anime_game_servers.multi_proto.gi.data.activity.mist_trial

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_2_3_0)
@ProtoCommand(CLIENT)
internal interface MistTrialSettleNotify {
    var dungeonSceneId: Int
    var exhibitionListDataRecordMap: Map<Int, Int>
    var exhibitionListDataResultMap: Map<Int, Int>
    @AddedIn(GI_3_3_0)
    var bestAvatarList: List<MistTrialBestAvatar>
    @AddedIn(GI_3_3_0)
    var bestHitAvatar: MistTrialBestAvatar
    @AddedIn(GI_3_3_0)
    var firstPassTime: Int
}
