package org.anime_game_servers.multi_proto.gi.data.community

import org.anime_game_servers.core.base.Version.GI_0_9_0
import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_0_9_0)
@ProtoCommand(REQUEST)
internal interface GetOnlinePlayerInfoReq {
    // todo handle causes nullable problems right now
    //@RemovedIn(GI_1_0_0)
    //var targetUid: Int
    @AddedIn(GI_1_0_0)
    var isOnlineId: Boolean
    
    @AddedIn(GI_1_0_0)
    @OneOf(
        types = [
            OneOfEntry(String::class, "online_id"),
            OneOfEntry(Int::class, "target_uid"),
            OneOfEntry(String::class, "psn_id"),
        ]
    )
    var playerId: OneOfType
}
