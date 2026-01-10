package org.anime_game_servers.multi_proto.gi.data.activity.sign_in

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface OpActivityStateNotify {
    var openedOpActivityInfoList: List<OpActivityTagBriefInfo>
    @AddedIn(GI_1_2_0)
    var finishedBonusActivityIdList: List<Int>
}
