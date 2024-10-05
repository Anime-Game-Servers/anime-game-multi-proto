package org.anime_game_servers.multi_proto.gi.data.activity.potion

import org.anime_game_servers.core.base.Version.GI_2_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_2_4_0)
@ProtoModel
internal interface PotionStageData {
    var coolDownAvatarIdList: List<Int>
    var coolDownBuffIdList: List<Int>
    var isOpen: Boolean
    var levelList: List<org.anime_game_servers.multi_proto.gi.data.activity.potion.PotionLevelData>
    var stageId: Int
}
