package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_0_0)
@ProtoModel
internal interface SceneGalleryInstableSprayBuffInfo {
    var buffId: Int
    var buffEndTime: Long
    var buffMaxTime: Long
}