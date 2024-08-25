package org.anime_game_servers.multi_proto.gi.data.item.widget.anchor_point

import org.anime_game_servers.core.base.Version.GI_1_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_1_0)
@ProtoEnum("AnchorPointOpReq")
internal enum class AnchorPointOpType {
    @AltName("ANCHOR_POINT_OP_TYPE_NONE")
    ANCHOR_POINT_OP_NONE,
    @AltName("ANCHOR_POINT_OP_TYPE_TELEPORT")
    ANCHOR_POINT_OP_TELEPORT,
    @AltName("ANCHOR_POINT_OP_TYPE_REMOVE")
    ANCHOR_POINT_OP_REMOVE,
}
