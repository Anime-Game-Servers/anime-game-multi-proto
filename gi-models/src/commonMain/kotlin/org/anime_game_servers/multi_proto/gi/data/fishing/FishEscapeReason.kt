package org.anime_game_servers.multi_proto.gi.data.fishing

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_1_0)
@ProtoEnum
internal enum class FishEscapeReason {
    @AltName("FISH_ESCAPE_REASON_NONE")
    FISN_ESCAPE_NONE,
    @AltName("FISH_ESCAPE_REASON_SHOCKED")
    FISH_ESCAPE_SHOCKED,
    @AltName("FISH_ESCAPE_REASON_UNHOOK")
    FISH_ESCAPE_UNHOOK,
}
