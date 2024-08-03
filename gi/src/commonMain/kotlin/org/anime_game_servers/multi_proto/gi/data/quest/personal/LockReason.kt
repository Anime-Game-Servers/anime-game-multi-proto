package org.anime_game_servers.multi_proto.gi.data.quest.personal

import org.anime_game_servers.core.base.Version.GI_1_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_0_0)
@ProtoEnum("LockedPersonallineData")
internal enum class LockReason {
    @AltName("LOCK_REASON_LEVEL")
    LEVEL,
    @AltName("LOCK_REASON_QUEST")
    QUEST,
}
