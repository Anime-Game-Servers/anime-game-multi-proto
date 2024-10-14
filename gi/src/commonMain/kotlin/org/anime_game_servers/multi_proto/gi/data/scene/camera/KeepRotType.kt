package org.anime_game_servers.multi_proto.gi.data.scene.camera

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_6_0)
@ProtoEnum("BeginCameraSceneLookNotify")
internal enum class KeepRotType {
    @AltName("KEEP_ROT_TYPE_X")
    KEEP_ROT_X,
    @AltName("KEEP_ROT_TYPE_XY")
    KEEP_ROT_XY,
}
