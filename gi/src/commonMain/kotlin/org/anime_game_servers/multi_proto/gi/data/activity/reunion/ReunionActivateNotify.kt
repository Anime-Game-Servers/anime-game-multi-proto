package org.anime_game_servers.multi_proto.gi.data.activity.reunion

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_2_0)
@ProtoCommand(NOTIFY)
internal interface ReunionActivateNotify {
    var reunionBriefInfo: org.anime_game_servers.multi_proto.gi.data.activity.reunion.ReunionBriefInfo
    @AddedIn(GI_2_1_0)
    var isActivate: Boolean
}
