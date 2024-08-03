package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(Version.GI_2_8_0)
@ProtoEnum
enum class GalleryStartSource {
    @AltName("GALLERY_START_SOURCE_BY_NONE")
    GALLERY_START_BY_NONE,
    @AltName("GALLERY_START_SOURCE_BY_MATCH")
    GALLERY_START_BY_MATCH,
    @AltName("GALLERY_START_SOURCE_BY_DRAFT")
    GALLERY_START_BY_DRAFT,
}