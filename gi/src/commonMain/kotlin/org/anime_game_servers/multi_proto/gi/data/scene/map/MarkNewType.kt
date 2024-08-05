package org.anime_game_servers.multi_proto.gi.data.scene.map

import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_CB2)
@ProtoEnum
internal enum class MarkNewType {
    MARK_NEW_TYPE_NONE,
    MARK_NEW_TYPE_COMBINE,
    MARK_NEW_TYPE_FORGE,
}
