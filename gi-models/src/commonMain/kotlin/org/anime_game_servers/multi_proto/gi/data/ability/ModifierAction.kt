package org.anime_game_servers.multi_proto.gi.data.ability

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class ModifierAction {
    @AltName("MODIFIER_ACTION_ADDED")
    ADDED,
    @AltName("MODIFIER_ACTION_REMOVED")
    REMOVED,
}
