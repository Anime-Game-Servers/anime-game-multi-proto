package org.anime_game_servers.multi_proto.gi.data.activity.luna_rite

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_1_0)
@ProtoEnum
internal enum class LunaRiteHintPointType {
    @AltName("LUNA_RITE_HINT_POINT_TYPE_NONE")
    LUNA_RITE_HINT_TYPE_NONE,
    @AltName("LUNA_RITE_HINT_POINT_TYPE_RUNE")
    LUNA_RITE_HINT_TYPE_RUNE,
    @AltName("LUNA_RITE_HINT_POINT_TYPE_CHEST")
    LUNA_RITE_HINT_TYPE_CHEST,
}
