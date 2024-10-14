package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.general.Retcode

@AddedIn(GI_2_8_0)
@ProtoCommand(RESPONSE)
internal interface BackRebornGalleryRsp {
    var retcode: Retcode
    var galleryId: Int
}
