package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_2_0_0)
@ProtoEnum(parentClass = "ProjectorOptionReq")
enum class ProjectorOpType {
    PROJECTOR_OP_NONE,
    PROJECTOR_OP_CREATE,
    PROJECTOR_OP_DESTROY
}