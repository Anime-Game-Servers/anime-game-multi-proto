package org.anime_game_servers.multi_proto.gi.data.dungeon

import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB1)
@ProtoEnum
internal enum class PlayerDieOption {
    @AltName("PLAYER_DIE_OPTION_OPT_NONE")
    DIE_OPT_NONE,
    @AltName("PLAYER_DIE_OPTION_OPT_REPLAY")
    DIE_OPT_REPLAY,
    @AltName("PLAYER_DIE_OPTION_OPT_CANCEL")
    DIE_OPT_CANCEL,
    @AltName("PLAYER_DIE_OPTION_OPT_REVIVE")
    DIE_OPT_REVIVE,
}
