package org.anime_game_servers.multi_proto.gi.data.player

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface BlockInfo {
    var blockId: Int
    var dataVersion: Int
    var binData: ByteArray
    var isDirty: Boolean
}
