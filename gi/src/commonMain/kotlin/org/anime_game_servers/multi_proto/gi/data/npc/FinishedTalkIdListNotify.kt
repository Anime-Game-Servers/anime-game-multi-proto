package org.anime_game_servers.multi_proto.gi.data.npc

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_3_1_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface FinishedTalkIdListNotify {
    var finishedTalkIdList: List<Int>
}
