package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.*

@AddedIn(Version.GI_1_4_0)
@ProtoCommand(CommandType.NOTIFY)
internal interface GalleryStartNotify {
    var galleryId: Int
    var endTime: Int
    @AddedIn(Version.GI_1_6_0)
    var playerCount: Int
    @AddedIn(Version.GI_2_3_0)
    var ownerUid: Int
    @AddedIn(Version.GI_3_2_0)
    var startTime: Int

    @OneOf(types = [
        OneOfEntry(org.anime_game_servers.multi_proto.gi.data.gallery.GalleryFlowerStartParam::class, "flower")
    ])
    var detail: OneOfType
}