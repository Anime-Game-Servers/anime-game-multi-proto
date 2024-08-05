package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version.GI_1_4_0
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_1_4_0)
@ProtoEnum
internal enum class GalleryStageType {
    @AltName("GALLERY_STAGE_TYPE_NONE")
    GALLERY_NONE,
    @AltName("GALLERY_STAGE_TYPE_PRESTART")
    GALLERY_PRESTART,
    @AltName("GALLERY_STAGE_TYPE_START")
    GALLERY_START,
}