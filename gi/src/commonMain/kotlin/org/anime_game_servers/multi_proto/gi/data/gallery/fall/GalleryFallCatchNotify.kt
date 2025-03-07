package org.anime_game_servers.multi_proto.gi.data.gallery.fall

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.*
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY

@AddedIn(GI_1_4_0)
@ProtoCommand(NOTIFY)
internal interface GalleryFallCatchNotify {
    var addScore: Int
    var ballCatchCountMap: Map<Int, Int>
    var curScore: Int
    var galleryId: Int
    var isGround: Boolean
    var timeCost: Int
}
