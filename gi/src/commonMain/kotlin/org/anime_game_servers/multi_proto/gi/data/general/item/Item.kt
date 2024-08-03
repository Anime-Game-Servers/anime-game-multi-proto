package org.anime_game_servers.multi_proto.gi.data.general.item

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_0_9_0)
@ProtoModel
interface Item {
    var itemId: Int
    var guid: Long
    @OneOf(
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.item.Material::class, "material"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.item.Equip::class, "equip"),
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.general.item.Furniture::class, "furniture")
    )
    var detail: OneOfType
}