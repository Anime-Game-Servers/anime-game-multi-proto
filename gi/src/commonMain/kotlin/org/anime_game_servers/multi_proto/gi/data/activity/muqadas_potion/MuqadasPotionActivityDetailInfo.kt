package org.anime_game_servers.multi_proto.gi.data.activity.muqadas_potion

import org.anime_game_servers.core.base.Version.GI_3_0_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_0_0)
@ProtoModel
internal interface MuqadasPotionActivityDetailInfo {
    var muqadasPotionLevelDataList: List<org.anime_game_servers.multi_proto.gi.data.activity.muqadas_potion.MuqadasPotionLevelData>
}
