package org.anime_game_servers.multi_proto.gi.data.general

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_3_0)
@ProtoModel
interface Uint32Pair {
    var key: Int
    var value: Int
}