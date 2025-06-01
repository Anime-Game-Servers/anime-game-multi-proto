package org.anime_game_servers.multi_proto.gi.data.quest.rand_task

import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_0_9_0)
@ProtoEnum("RemoveRandTaskInfoNotify")
internal enum class FinishReason {
    @AltName("FINISH_REASON_DEFAULT")
    DEFAULT,
    @AltName("FINISH_REASON_CLEAR")
    CLEAR,
    @AltName("FINISH_REASON_DISTANCE")
    DISTANCE,
    @AltName("FINISH_REASON_FINISH")
    FINISH,
}