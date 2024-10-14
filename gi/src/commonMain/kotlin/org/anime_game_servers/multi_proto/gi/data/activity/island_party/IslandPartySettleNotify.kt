package org.anime_game_servers.multi_proto.gi.data.activity.island_party

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.CommandType.*
import org.anime_game_servers.core.base.annotations.proto.ProtoCommand
import org.anime_game_servers.multi_proto.gi.data.gallery.GalleryStopReason
import org.anime_game_servers.multi_proto.gi.data.gallery.island_party.IslandPartyGallerySettleInfo
import org.anime_game_servers.multi_proto.gi.data.general.ExhibitionDisplayInfo

@AddedIn(GI_2_8_0)
@ProtoCommand(NOTIFY)
internal interface IslandPartySettleNotify {
    var isNewRecord: Boolean
    var reason: GalleryStopReason
    var scoreList: List<ExhibitionDisplayInfo>
    var settleInfoList: List<IslandPartyGallerySettleInfo>
    var timeRemain: Int
}
