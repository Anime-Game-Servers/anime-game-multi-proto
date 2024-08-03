package org.anime_game_servers.multi_proto.gi.data.community.chat

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_CB2)
@ProtoModel("ChatInfo")
interface SystemHint {
    var type: Int
}