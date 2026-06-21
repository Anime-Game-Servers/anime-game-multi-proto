package org.anime_game_servers.multi_proto.gi.data.scene.notify

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_5_0
import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(NOTIFY)
internal interface ShowTemplateReminderNotify {
    var paramList: List<Int>
    var templateReminderId: Int
    @AddedIn(GI_1_5_0)
    var paramUidList: List<Int>
    @AddedIn(GI_2_1_0)
    var isRevoke: Boolean
    @AddedIn(GI_3_2_0)
    var isNeedCache: Boolean
}
