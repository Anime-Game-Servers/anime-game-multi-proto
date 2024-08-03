package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_2_0)
@ProtoModel
internal interface SceneGalleryFungusFighterCaptureInfo {
    var isHideProgress: Boolean
}