package org.anime_game_servers.multi_proto.gi.data.community.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.CommandType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand


@AddedIn(Version.GI_1_2_0)
@ProtoCommand(CommandType.REQUEST)
internal interface PullRecentChatReq {
    var pullNum: Int
    var beginSequence: Int
}