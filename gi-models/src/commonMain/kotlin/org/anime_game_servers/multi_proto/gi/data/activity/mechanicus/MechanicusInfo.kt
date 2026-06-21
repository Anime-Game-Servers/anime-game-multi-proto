package org.anime_game_servers.multi_proto.gi.data.activity.mechanicus

import org.anime_game_servers.core.base.Version.GI_1_3_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel
import org.anime_game_servers.multi_proto.gi.data.general.Uint32Pair

@AddedIn(GI_1_3_0)
@ProtoModel
internal interface MechanicusInfo {
    var coin: Int
    var finishDifficultLevelList: List<Int>
    var gearLevelPairList: List<Uint32Pair>
    var isFinishTeachDungeon: Boolean
    var mechanicusId: Int
    var openSequenceIdList: List<Int>
    var punishOverTime: Int
}
