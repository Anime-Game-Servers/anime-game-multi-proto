package org.anime_game_servers.multi_proto.gi.data.community.chat

import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_1_2_0)
@RemovedIn(GI_3_2_0)
@ProtoCommand(RESPONSE)
internal interface PrivateChatSetSequenceRsp {
    var retcode: Int
}
