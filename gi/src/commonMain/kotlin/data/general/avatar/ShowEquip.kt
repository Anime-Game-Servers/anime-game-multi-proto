package data.general.avatar

import org.anime_game_servers.core.base.annotations.AddedIn
import data.general.item.Reliquary
import data.general.item.Weapon
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.OneOf
import org.anime_game_servers.core.base.annotations.proto.OneOfEntry
import org.anime_game_servers.core.base.annotations.proto.OneOfType
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_1_0_0)
@ProtoModel
internal interface ShowEquip {
    var itemId: Int
    @OneOf(
        types = [
            OneOfEntry(Reliquary::class, "reliquary"),
            OneOfEntry(Weapon::class, "weapon"),
        ]
    )
    var detail: OneOfType
}