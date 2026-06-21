package org.anime_game_servers.multi_proto.gi.data.quest.rand_task

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(Version.GI_CB2)
@ProtoCommand(CommandType.NOTIFY)
internal interface RemoveRandTaskInfoNotify {
    var isSucc: Boolean
    var randTaskId: Int
    var reason: FinishReason
}