package org.anime_game_servers.multi_proto.gi.data.general.item

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface Equip {
    @OneOf(
        OneOfEntry(Reliquary::class, "reliquary"),
        OneOfEntry(Weapon::class, "weapon")
    )
    var detail: OneOfType
    @AddedIn(Version.GI_1_1_0)
    var isLocked: Boolean
}