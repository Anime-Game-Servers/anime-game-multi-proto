package org.anime_game_servers.multi_proto.gi.data.community.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_2_0
import org.anime_game_servers.core.base.annotations.proto.CommandType.REQUEST
import org.anime_game_servers.core.base.annotations.proto.*


@AddedIn(GI_1_2_0)
@ProtoCommand(REQUEST)
internal interface PrivateChatReq {
    var targetUid: Int
    @OneOf(
        OneOfEntry(String::class, "text"),
        OneOfEntry(Int::class, "icon")
    )
    var content: OneOfType
}
