package org.anime_game_servers.multi_proto.gi.data.activity.electrohercules_battle

import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_4_0)
@ProtoModel
internal interface ElectroherculesBattleStageInfo {
    var isStageOpen: Boolean
    var levelInfoList: List<org.anime_game_servers.multi_proto.gi.data.activity.electrohercules_battle.ElectroherculesBattleLevelInfo>
    var stageId: Int
}
