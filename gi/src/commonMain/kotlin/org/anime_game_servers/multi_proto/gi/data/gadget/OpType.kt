package org.anime_game_servers.multi_proto.gi.data.gadget

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_1_2_0)
@ProtoEnum("UpdateAbilityCreatedMovingPlatformNotify")
internal enum class OpType {
    @AltName("OP_TYPE_NONE")
    OP_NONE,
    @AltName("OP_TYPE_ACTIVATE")
    OP_ACTIVATE,
    @AltName("OP_TYPE_DEACTIVATE")
    OP_DEACTIVATE
}