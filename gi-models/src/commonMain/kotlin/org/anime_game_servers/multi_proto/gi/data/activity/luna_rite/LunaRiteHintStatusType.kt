package org.anime_game_servers.multi_proto.gi.data.activity.luna_rite

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_1_0)
@ProtoEnum
internal enum class LunaRiteHintStatusType {
    @AltName("LUNA_RITE_HINT_STATUS_TYPE_DEFAULT")
    LUNA_RITE_HINT_STATUS_DEFAULT,
    @AltName("LUNA_RITE_HINT_STATUS_TYPE_NO_COUNT")
    LUNA_RITE_HINT_STATUS_NO_COUNT,
    @AltName("LUNA_RITE_HINT_STATUS_TYPE_FINISH")
    LUNA_RITE_HINT_STATUS_FINISH,
}
