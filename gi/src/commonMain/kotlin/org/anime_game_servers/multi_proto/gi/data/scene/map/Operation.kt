package org.anime_game_servers.multi_proto.gi.data.scene.map

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum("MarkMapReq")
internal enum class Operation {
    @AltName("OPERATION_ADD")
    ADD,
    @AltName("OPERATION_MOD")
    MOD,
    @AltName("OPERATION_DEL")
    DEL,
    @AltName("OPERATION_GET")
    GET,
}
