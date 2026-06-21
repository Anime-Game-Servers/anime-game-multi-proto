package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_2_0_0
import org.anime_game_servers.core.base.Version.GI_5_4_0
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_0_0) @RemovedIn(GI_5_4_0)
@ProtoEnum(parentClass = "ProjectorOptionReq")
internal enum class ProjectorOpType {
    @AltName("PROJECTOR_OP_TYPE_NONE")
    PROJECTOR_OP_NONE,
    @AltName("PROJECTOR_OP_TYPE_CREATE")
    PROJECTOR_OP_CREATE,
    @AltName("PROJECTOR_OP_TYPE_DESTROY")
    PROJECTOR_OP_DESTROY
}