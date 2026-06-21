package org.anime_game_servers.multi_proto.gi.data.world.investigation

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("InvestigationMonster")
internal enum class LockState {
    @AltName("LOCK_STATE_NONE")
    LOCK_NONE,
    @AltName("LOCK_STATE_QUEST")
    LOCK_QUEST,
}
