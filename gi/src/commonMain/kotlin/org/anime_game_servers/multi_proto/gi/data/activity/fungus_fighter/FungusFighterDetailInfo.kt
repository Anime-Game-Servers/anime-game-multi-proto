package org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter

import org.anime_game_servers.core.base.Version.GI_3_2_0
import org.anime_game_servers.core.base.Version.GI_3_3_0
import org.anime_game_servers.core.base.Version.GI_3_4_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.RemovedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_3_2_0)
@ProtoModel
internal interface FungusFighterDetailInfo {
    var finishCampIdList: List<Int>
    var fungusDetailList: List<org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter.FungusDetail>
    var plotStageDetailList: List<org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter.FungusPlotStageDetail>
    var trainingDungeonDetailList: List<org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter.FungusTrainingDungeonDetail>
    var trainingDungeonProgressDetailList: List<org.anime_game_servers.multi_proto.gi.data.activity.fungus_fighter.FungusTrainingProgressDetail>
    var unlockCampIdList: List<Int>
    var unlockCultivateIdList: List<Int>
}
