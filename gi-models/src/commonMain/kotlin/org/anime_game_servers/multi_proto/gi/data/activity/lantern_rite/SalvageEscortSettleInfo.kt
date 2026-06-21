package org.anime_game_servers.multi_proto.gi.data.activity.lantern_rite

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.gallery.salvage_escort.SalvageEscortGallerySettleInfo

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface SalvageEscortSettleInfo {
    var isNewRecord: Boolean
    var settleInfo: SalvageEscortGallerySettleInfo
}
