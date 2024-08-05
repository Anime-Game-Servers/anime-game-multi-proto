package org.anime_game_servers.multi_proto.gi.data.gallery.island_party

import org.anime_game_servers.core.base.Version.GI_2_8_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.ExhibitionDisplayInfo
import org.anime_game_servers.multi_proto.gi.data.scene.entity.OnlinePlayerInfo

@AddedIn(GI_2_8_0)
@ProtoModel
internal interface IslandPartyGallerySettleInfo {
    var cardList: List<ExhibitionDisplayInfo>
    var playerInfo: OnlinePlayerInfo
}