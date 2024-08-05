package org.anime_game_servers.multi_proto.gi.data.administration.community

import org.anime_game_servers.core.base.Version.GI_2_7_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_7_0)
@ProtoEnum
internal enum class AuditState {
    @AltName("AUDIT_STATE_NONE")
    AUDIT_NONE,
    @AltName("AUDIT_STATE_WAITING")
    AUDIT_WAITING,
    @AltName("AUDIT_STATE_FAILED")
    AUDIT_FAILED,
}
