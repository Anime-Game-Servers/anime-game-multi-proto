package org.anime_game_servers.multi_proto.gi.data.gallery.balloon

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.*
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY

@AddedIn(GI_1_4_0)
@ProtoCommand(NOTIFY)
internal interface GalleryBalloonShootNotify {
    var addScore: Int
    var combo: Int
    var comboDisableTime: Long
    var curScore: Int
    var galleryId: Int
    var triggerEntityId: Int
}