package org.anime_game_servers.multi_proto.gi.data.scene

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.PlayerDieType

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface WorldPlayerDieNotify {
    var dieType: PlayerDieType
    var murdererEntityId: Int
    
    @OneOf(
        types = [
            OneOfEntry(Int::class, "gadget_id"),
            OneOfEntry(Int::class, "monster_id"),
        ]
    )
    var entity: OneOfType
}
