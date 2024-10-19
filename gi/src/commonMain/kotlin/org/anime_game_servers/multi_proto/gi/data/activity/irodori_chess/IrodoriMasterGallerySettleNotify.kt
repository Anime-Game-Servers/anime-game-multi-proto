package org.anime_game_servers.multi_proto.gi.data.activity.irodori_chess

import org.anime_game_servers.core.base.Version.GI_2_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.irodori_master.IrodoriMasterGallerySettleInfo

@AddedIn(GI_2_6_0)
@ProtoCommand(CLIENT)
internal interface IrodoriMasterGallerySettleNotify {
    var galleryId: Int
    var settleInfo: IrodoriMasterGallerySettleInfo
}
