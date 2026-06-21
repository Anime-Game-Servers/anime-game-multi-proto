package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.multi_proto.gi.data.general.PlayerDieType
import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface DungeonPlayerDieNotify {
    var dieType: PlayerDieType
    var dungeonId: Int
    var murdererEntityId: Int
    var reviveCount: Int
    var waitTime: Int
    @AddedIn(GI_1_1_0)
    var strengthenPointDataMap: Map<Int, StrengthenPointData>
    
    @OneOf(
        types = [
            OneOfEntry(Int::class, "gadget_id"),
            OneOfEntry(Int::class, "monster_id"),
        ]
    )
    var entity: OneOfType
}
