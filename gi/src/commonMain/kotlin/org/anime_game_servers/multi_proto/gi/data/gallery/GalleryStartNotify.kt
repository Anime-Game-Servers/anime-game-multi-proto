package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.*
import org.anime_game_servers.core.base.annotations.proto.*
import org.anime_game_servers.core.base.annotations.proto.CommandType.NOTIFY
import org.anime_game_servers.multi_proto.gi.data.gallery.flower.GalleryFlowerStartParam

@AddedIn(GI_1_4_0)
@ProtoCommand(NOTIFY)
internal interface GalleryStartNotify {
    var endTime: Int
    var galleryId: Int
    @AddedIn(GI_1_6_0)
    var playerCount: Int
    @AddedIn(GI_2_3_0)
    var ownerUid: Int
    @AddedIn(GI_3_2_0)
    var startTime: Int

    @OneOf(types = [
        OneOfEntry(GalleryFlowerStartParam::class, "flower_start_param")
    ])
    var detail: OneOfType
}