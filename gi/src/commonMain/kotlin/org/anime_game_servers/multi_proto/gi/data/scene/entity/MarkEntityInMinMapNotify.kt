package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Vector

@AddedIn(GI_CB1)
@ProtoCommand(NOTIFY)
internal interface MarkEntityInMinMapNotify {
    var entityId: Int
    @AddedIn(GI_CB2)
    var monsterId: Int
    var position: Vector

    @RemovedIn(GI_CB2)
    @OneOf(
        types = [
            OneOfEntry(Int::class, "monster_id"),
        ]
    )
    var entity: OneOfType
}
