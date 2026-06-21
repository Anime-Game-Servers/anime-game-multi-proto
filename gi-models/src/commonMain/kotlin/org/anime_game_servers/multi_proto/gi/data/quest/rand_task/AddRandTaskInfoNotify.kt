package org.anime_game_servers.multi_proto.gi.data.quest.rand_task

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(Version.GI_0_9_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface AddRandTaskInfoNotify {
    var pos: Vector
    var randTaskId: Int
}