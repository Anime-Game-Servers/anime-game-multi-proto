package org.anime_game_servers.multi_proto.gi.data.pathfinding

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("QueryPathRsp")
internal enum class PathStatusType {
    @AltName("PATH_STATUS_TYPE_FAIL")
    STATUS_FAIL,
    @AltName("PATH_STATUS_TYPE_SUCC")
    STATUS_SUCC,
    @AltName("PATH_STATUS_TYPE_PARTIAL")
    STATUS_PARTIAL,
}
